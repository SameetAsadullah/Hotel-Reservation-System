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
import logicLayer.Vendor;
import logicLayer.HRS;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class VendShow {

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
    private Button VEditName;

    @FXML
    private Button VEditCNIC;

    @FXML
    private Button VEditAcc;

    @FXML
    private Button VEditPass;

    @FXML
    private Button VEditEmail;

    @FXML
    private Button VEditAddress;

    @FXML
    private Button VEditPhone;

    @FXML
    private Button Cdelete;

    String recv;
    public void initData(String s){
        recv=s;
        HRS hrs=new HRS();
        Vendor customer=hrs.searchVendorByMail(recv);
        CName.setText(customer.getName());
        CCnic.setText(customer.getCNIC());
        CAccountNo.setText(customer.getAccountNo());
        CPassword.setText(customer.getPassword());
        CEmail.setText(customer.getEmail());
        CAddress.setText(customer.getAddress());
        CPhoneNo.setText(customer.getPhoneNo());



    }
    @FXML
    void DeleteCustomer(ActionEvent event) throws Exception{

        HRS hrs=new HRS();
        hrs.DeleteVendorSelect(CEmail.getText());
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
    void VendorEditAcc(ActionEvent event) throws Exception {

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
            f.btn("VAccountNo");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }




    }

    @FXML
    void VendorEditAddress(ActionEvent event)throws Exception {

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
            f.btn("VAddress");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }

    @FXML
    void VendorEditCNIC(ActionEvent event) throws Exception {

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
            f.btn("VCNIC");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void VendorEditEMail(ActionEvent event) throws Exception {

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
            f.btn("VEmail");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }

    @FXML
    void VendorEditName(ActionEvent event) throws Exception {

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
            f.btn("VName");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void VendorEditPass(ActionEvent event) throws Exception {

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
            f.btn("VPassword");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }


    }

    @FXML
    void VendorEditPhone(ActionEvent event) throws Exception {

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
            f.btn("VPhoneNo");

            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }

    }



}
