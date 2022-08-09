package presentationLayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import presentationLayer.Vendor.SignInV;

public class HomePage {

    @FXML
    private Button btn_admin;

    @FXML
    private Button btn_vendor;

    @FXML
    private Button btn_customer;

    @FXML
    private Button btn_receptionist;

    @FXML
    void adminClick(ActionEvent event) throws Exception {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Admin/AdminPage.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Sign In");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void customerClick(ActionEvent event) throws Exception{
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("User/SignInU.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Sign In");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void vendor_Click(ActionEvent event) throws Exception{
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Vendor/SignInV.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    void receptionistClick(ActionEvent event) throws Exception{
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Receptionist/SignInR.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}


