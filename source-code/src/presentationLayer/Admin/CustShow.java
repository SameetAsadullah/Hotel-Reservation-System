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
import logicLayer.HRS;
import logicLayer.Customer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustShow {

    @FXML
    private Label CName;

    @FXML
    private Label CCnic;

    @FXML
    private Label CAccountNo;

    @FXML
    private Label CPassword;

    @FXML
    private Label CEmail;

    @FXML
    private Label CAddress;

    @FXML
    private Label CPhoneNo;

    @FXML
    private Button CEditName;

    @FXML
    private Button CEditCnic;

    @FXML
    private Button CEditAcc;

    @FXML
    private Button CEditPass;

    @FXML
    private Button CEditEmail;

    @FXML
    private Button CEditAddress;

    @FXML
    private Button CEditPhone;

    @FXML
    private Button Cdelete;



    String recv;
    public void initData(String s){
        recv=s;
        HRS hrs=new HRS();
        Customer customer=hrs.searchCustomerByMail(recv);
        CName.setText(customer.getName());
        CCnic.setText(customer.getCNIC());
        CAccountNo.setText(customer.getAccountNo());
        CPassword.setText(customer.getPassword());
        CEmail.setText(customer.getEmail());
        CAddress.setText(customer.getAddress());
        CPhoneNo.setText(customer.getPhoneNo());



    }
    @FXML
    void CustomerEditAcc(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CAccountNo");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void CustomerEditAddress(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CAddress");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }

    @FXML
    void CustomerEditCnic(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CCNIC");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void CustomerEditEmail(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CEmail");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }

    @FXML
    void CustomerEditName(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CName");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }



    }

    @FXML
    void CustomerEditPass(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CPassword");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void CustomerEditPhone(ActionEvent event) throws Exception {

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Editit.fxml"));


            Scene scene = new Scene(fxmlLoader.load(), 700, 600);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            Editit c=fxmlLoader.getController();
            c.emailsent(CEmail.getText());
            Editit f=fxmlLoader.getController();
            f.btn("CPhoneNo");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void DeleteCustomer(ActionEvent event) throws Exception {


        HRS hrs=new HRS();
        hrs.DeleteCustomerSelect(CEmail.getText());
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();

        System.out.println("Requesting");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CustM.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

}
