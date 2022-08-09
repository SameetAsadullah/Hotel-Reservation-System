package presentationLayer.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import logicLayer.HRS;
import logicLayer.Hotel;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReserveRoom {

    @FXML
    private TextField txt_loc;

    @FXML
    private TextField txt_noOfPerson;

    @FXML
    private DatePicker date_checkIn;

    @FXML
    private Button btn_submit;

    @FXML
    private DatePicker date_checkOut;

    @FXML
    private CheckBox check_single;

    @FXML
    private CheckBox check_double;

    @FXML
    private Button btn_close;

    @FXML
    private Label invalidLocation;

    @FXML
    private Label invalidPersons;

    @FXML
    private Label fillAll;

    @FXML
    private Label noHotelsFound;

    private String email;
    public void receiveEmail(String e) {
        email = e;
    }

    @FXML
    void closeClick(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    void submitClick(ActionEvent event) throws IOException {
        HRS hrs = new HRS();
        String location = txt_loc.getText();
        String noOfPersons = txt_noOfPerson.getText();
        LocalDate checkInDate = date_checkIn.getValue();
        LocalDate checkOutDate = date_checkOut.getValue();
        boolean both = false;
        String roomType = "";

        if (check_single.isSelected() && check_double.isSelected()) {
            both = true;
        } else if (check_single.isSelected()) {
            roomType = "Single";
        } else if (check_double.isSelected()){
            roomType = "Double";
        }

        if (location.isEmpty() || noOfPersons.isEmpty()) {
            fillAll.setVisible(true);
        }

        if(!invalidLocation.isVisible() && !invalidPersons.isVisible() && !fillAll.isVisible()){
            Vector<Hotel> hotels = hrs.getHotels(location, noOfPersons, checkInDate, roomType, both);
            if (!hotels.isEmpty()) {
                ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("chooseHotel.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 800, 600);
                    scene.getStylesheets().add(getClass().getResource("table.css").toExternalForm());

                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(scene);
                    chooseHotel cH = fxmlLoader.getController();
                    cH.receiveEmail(hotels, email, checkInDate, checkOutDate);
                    stage.show();
                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            }
            else {
                noHotelsFound.setVisible(true);
            }
        }
    }

    @FXML
    void locationUnfocus(KeyEvent event) {

        String name = txt_loc.getText();
        if (invalidLocation.isVisible() == true) {invalidLocation.setVisible(false); }
        if (fillAll.isVisible() == true) {fillAll.setVisible(false);}
        if (noHotelsFound.isVisible() == true) {noHotelsFound.setVisible(false);}
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if (ascii==44) {

                invalidLocation.setVisible(true);
            }
        }
    }

    @FXML
    void personUnfocus(KeyEvent event) {

        String name = txt_noOfPerson.getText();
        if (invalidPersons.isVisible() == true) {invalidPersons.setVisible(false); }
        if (fillAll.isVisible() == true) {fillAll.setVisible(false);}
        if (noHotelsFound.isVisible() == true) {noHotelsFound.setVisible(false);}
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 48 || ascii > 57) ) {

                invalidPersons.setVisible(true);
            }
        }
    }
}


