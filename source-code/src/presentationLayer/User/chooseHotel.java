package presentationLayer.User;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import logicLayer.HRS;
import logicLayer.Hotel;
import logicLayer.Vendor;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class chooseHotel {

    //*
    //*
    //* Objects
    //*
    //*

    // Labels

    @FXML
    private TextField txt_loc;

    @FXML
    private TextField txt_hname;

    // Buttons

    @FXML
    private Button btn_submit;

    @FXML
    private Button btn_close;

    // Table

    @FXML
    private TableView<Hotel> table_view;

    @FXML
    private TableColumn<Hotel, String> col1;

    @FXML
    private TableColumn<Hotel, String> col2;

    @FXML
    private TableColumn<Hotel, String> col3;

    @FXML
    private TableColumn<Hotel, String> col4;

    @FXML
    private TableColumn<Hotel, String> col5;

    //*
    //*
    //* Initialization
    //*
    //*

    ObservableList<Hotel> list = FXCollections.observableArrayList();
    Vector <Hotel> vH = new Vector<Hotel>();
    private String email;
    LocalDate c1, c2;

    public void fillObserve() {
        for (int i = 0; i < vH.size(); i++) {
            list.add(vH.get(i));
        }
    }

    public void receiveEmail(Vector<Hotel> recv, String e, LocalDate cIn, LocalDate cOut) {
        email = e;
        vH = recv;
        c1 = cIn;
        c2 = cOut;

        fillObserve();
        for (int i = 0; i < vH.size(); i++)
            col1.setCellValueFactory(new PropertyValueFactory<Hotel,String>("name"));

        for (int i = 0; i < vH.size(); i++)
            col2.setCellValueFactory(new PropertyValueFactory<Hotel,String>("address"));

        for (int i = 0; i < vH.size(); i++)
            col3.setCellValueFactory(new PropertyValueFactory<Hotel,String>("location"));

        for (int i = 0; i < vH.size(); i++)
            col4.setCellValueFactory(new PropertyValueFactory<Hotel,String>("singleRoomPrice"));

        for (int i = 0; i < vH.size(); i++)
            col5.setCellValueFactory(new PropertyValueFactory<Hotel,String>("doubleRoomPrice"));

        table_view.setItems(list);
    }

    //*
    //*
    //* Functions
    //*
    //*

    @FXML
    void actionPerformed(ActionEvent event) {
        HRS hrs = new HRS();
        Hotel to_send = new Hotel();
        String name = txt_hname.getText();
        String loc = txt_loc.getText();

        for(int i = 0; i < vH.size(); ++i) {
            if (vH.get(i).getName().equals(name) && vH.get(i).getLocation().equals(loc)) {
                to_send = vH.get(i);
                hrs.makeReservation(email, vH.get(i), c1, c2);
                break;
            }
        }

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("reservationMade.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 423);
            scene.getStylesheets().add(getClass().getResource("table.css").toExternalForm());

            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            reservationMade cH = fxmlLoader.getController();

            cH.receiveEmail(to_send);
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void closeClick(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
}
