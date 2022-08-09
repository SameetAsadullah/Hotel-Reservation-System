package presentationLayer.Admin;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import logicLayer.HRS;
import logicLayer.Hotel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HotelShow {

    @FXML
    private Label HName;

    @FXML
    private Label HAddress;

    @FXML
    private Label HLocation;

    @FXML
    private Label HTotalRooms;

    @FXML
    private Label HSingleRooms;

    @FXML
    private Label HSinglePrice;

    @FXML
    private Label HDoubleRooms;

    @FXML
    private Label HDoublePrice;

    @FXML
    private Button HEditName;

    @FXML
    private Button HEditLocation;

    @FXML
    private Button HEditTotalRooms;

    @FXML
    private Button HEditSingleRooms;

    @FXML
    private Button HEditSinglePrice;

    @FXML
    private Button HEditDoubleRoomPrice;

    @FXML
    private Button HEditDoublePrice;

    @FXML
    private Button HEditAddress;

    @FXML
    private Button HDelete;
    String recv1,recv2;
    public void initdata(String s1,String s2){
        recv1=s1;
        recv2= s2;
        HRS hrs=new HRS();
        Hotel customer=hrs.searchHotelByNameLoc(recv1,recv2);
        HName.setText(customer.getName());
        HLocation.setText(customer.getLocation());
        HDoublePrice.setText(customer.getDoubleRoomPrice());
        HDoubleRooms.setText(customer.getDoubleRooms());
        HSingleRooms.setText(customer.getSingleRooms());
        HAddress.setText(customer.getAddress());
        HTotalRooms.setText(Integer.toString(customer.getTotalRooms()));
        HSinglePrice.setText(customer.getSingleRoomPrice());



    }

    @FXML
    void HEditDoublePrice(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HDoublePrice");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void HotelDeleteRecord(ActionEvent event) throws Exception{

        HRS hrs=new HRS();
        hrs.DeleteHotelSelect(HName.getText(),HLocation.getText());
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("HotelM.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    @FXML
    void HotelEditAddress(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HAddress");

            stage.show();
        }
        catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }


    @FXML
    void HotelEditDoubleRooms(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HDoubleRooms");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }


    @FXML
    void HotelEditLocation(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HLocation");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void HotelEditName(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HName");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void HotelEditSinglePrice(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HSinglePrice");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }

    @FXML
    void HotelEditSingleRooms(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HSingleRoom");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void HotelEditTotalRooms(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.initdata(HName.getText(),HLocation.getText());
            Editit f=fxmlLoader.getController();
            f.btn("HTotalRooms");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

}
