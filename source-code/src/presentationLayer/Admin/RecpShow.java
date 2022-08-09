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
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import logicLayer.Customer;
import logicLayer.HRS;
import logicLayer.Receptionist;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RecpShow {

    @FXML
    private TextField RName;

    @FXML
    private TextField RCnic;

    @FXML
    private TextField RAccountNo;

    @FXML
    private TextField RPassword;

    @FXML
    private TextField REmail;

    @FXML
    private TextField RAddress;

    @FXML
    private TextField RPhoneNo;

    @FXML
    private Button REditName;

    @FXML
    private Button REditCnic;

    @FXML
    private Button REditAcc;

    @FXML
    private Button REditPass;

    @FXML
    private Button REditEmail;

    @FXML
    private Button REditAddress;

    @FXML
    private Button RecpEditPhone;

    @FXML
    private Button CDelete;

    String recv;
    public void initData(String s){
        recv=s;
        HRS hrs=new HRS();
        Receptionist receptionist=hrs.searchReceptionistByMail(recv);
        RName.setText(receptionist.getName());
        RCnic.setText(receptionist.getCNIC());
        RAccountNo.setText(receptionist.getAccountNo());
        RPassword.setText(receptionist.getPassword());
        REmail.setText(receptionist.getEmail());
        RAddress.setText(receptionist.getAddress());
        RPhoneNo.setText(receptionist.getPhoneNo());



    }


    @FXML
    void RecpEditAcc(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("RAccountNo");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void RecpEditAddress(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("RAddress");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }

    @FXML
    void RecpEditCNIC(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("RCNIC");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void RecpEditEmail(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("REmail");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void RecpEditName(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("RName");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void RecpEditPass(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("RPassword");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void RecpEditPhone(ActionEvent event)  throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(REmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("PhoneNo");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }
    @FXML
    void DeleteRecp(ActionEvent event) throws Exception{
        HRS hrs=new HRS();
        hrs.DeleteReceptionistSelect(REmail.getText());
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RecpM.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

}
