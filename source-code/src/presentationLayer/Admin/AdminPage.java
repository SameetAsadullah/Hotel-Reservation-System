package presentationLayer.Admin;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import logicLayer.HRS;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminPage {

    @FXML
    private Button btn_signUp;

    @FXML
    private Button btn_Customer;

    @FXML
    private Button btn_Reception;

    @FXML
    private Button btn_Vendor;

    @FXML
    private Button btn_Hotel;



    @FXML
    void CustomerClick(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        FXMLLoader fxmlLoader = new FXMLLoader();
        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CustM.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();


    }

    @FXML
    void HotelClick(ActionEvent event) throws Exception {

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
    void ReceptionClick(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RecpM.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    @FXML
    void VendorClick(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("VendM.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    @FXML
    void signUpClick(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SignUPA.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
