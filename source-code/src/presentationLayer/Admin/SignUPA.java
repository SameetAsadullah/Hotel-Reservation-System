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

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignUPA {

    //*
    //*
    //* Objects
    //*
    //*

    // Text Fields

    @FXML
    private TextField txt_name;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_cnic;

    @FXML
    private TextField txt_address;

    @FXML
    private TextField txt_contact;

    @FXML
    private TextField txt_credit;

    @FXML
    private PasswordField txt_pass;

    @FXML
    private PasswordField txt_confirm_pass;

    // Labels

    @FXML
    private Label name_invalid;

    @FXML
    private Label email_invalid;

    @FXML
    private Label cnic_invalid;

    @FXML
    private Label address_invalid;

    @FXML
    private Label contact_invalid;

    @FXML
    private Label credit_invalid;

    @FXML
    private Label pass_invalid;

    @FXML
    private Label pass_invalid1;
    // Buttons

    @FXML
    private Label email_invalid1;

    @FXML
    private Label fillAll;

    @FXML
    private Label checkAll;

    @FXML
    private Button btn_submit;

    @FXML
    private Button btn_close;

    //*
    //*
    //* Functions
    //*
    //*

    @FXML
    void closeClick(ActionEvent event) { // cross button on the top right of screen

        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    void actionPerformed(ActionEvent event) throws Exception { // submit button to submit all the values
        HRS hrs = new HRS();
        String name = txt_name.getText();
        String email = txt_email.getText();
        String cnic = txt_cnic.getText();
        String address = txt_address.getText();
        String contact = txt_contact.getText();
        String credit = txt_credit.getText();
        String pass = txt_pass.getText();
        String confirm_pass = txt_confirm_pass.getText();

        if(pass_invalid.isVisible()==true) {
            pass_invalid.setVisible(false);
        }
        if(email_invalid1.isVisible()==true){
            email_invalid1.setVisible(false);
        }

        if (name == "" || email == "" || address == "" || cnic == "" || contact == "" || credit == "" || pass == "" || confirm_pass == "") {
            fillAll.setVisible(true);
        }

        else if (hrs.searchAdminByMail(email)!=null) {
            if (email_invalid.isVisible() == false) {
                email_invalid1.setVisible(true);
            }
        }

        else if (!pass.equals(confirm_pass)) {
            if (pass_invalid1.isVisible() == false) {
                pass_invalid.setVisible(true);
            }
        }

        if (!name_invalid.isVisible() && !email_invalid.isVisible() && !cnic_invalid.isVisible() && !contact_invalid.isVisible() &&
                !fillAll.isVisible() && !credit_invalid.isVisible() && !pass_invalid1.isVisible() && !pass_invalid.isVisible() &&
                !email_invalid1.isVisible()) {
            hrs.registerAdmin(name, email, pass, address, contact, cnic, credit);
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();

            System.out.println("Requesting");
            Stage primaryStage= new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setTitle("Sign In");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
    }

    @FXML
    void nameUnfocus(KeyEvent event) { // name label validation
        String name = txt_name.getText();
        if (name_invalid.isVisible() == true) {name_invalid.setVisible(false); }
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122) && (ascii < 48 || ascii > 57)) {

                name_invalid.setVisible(true);
            }
        }
    }

    @FXML
    void emailunfocus(KeyEvent event) {
        String name = txt_email.getText();
        if(email_invalid.isVisible()==true){ email_invalid.setVisible(false); }
        if(email_invalid1.isVisible()==true){email_invalid1.setVisible(false); }
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        for(int i=0; i<name.length();i++){
            int ascii=name.charAt(i);
            if((ascii< 64 || ascii>90) && (ascii<97 || ascii>122) && (ascii<46 || ascii>57)){

                email_invalid.setVisible(true);
            }
        }
    }

    @FXML
    void addressUnfocused(KeyEvent event) {

        String name = txt_address.getText();
        if(address_invalid.isVisible()==true){ address_invalid.setVisible(false); }
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);
            if (ascii == 44) {

                address_invalid.setVisible(true);
            }
        }
    }

    @FXML
    void cnicUnfocused(KeyEvent event) {

        if(cnic_invalid.isVisible()==true){ cnic_invalid.setVisible(false); }
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        String name = txt_cnic.getText();
        for(int i=0; i<name.length();i++){
            int ascii=name.charAt(i);
            if((ascii < 48 || ascii > 57)){

                cnic_invalid.setVisible(true);
            }
        }
        if(name.length()!=13){
            cnic_invalid.setVisible(true);
        }



    }

    @FXML
    void contactUnfocused(KeyEvent event) {

        String name = txt_contact.getText();
        if(contact_invalid.isVisible()==true){ contact_invalid.setVisible(false); }
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        for(int i=0; i<name.length();i++){
            int ascii=name.charAt(i);
            if((ascii < 48 || ascii > 57)){

                contact_invalid.setVisible(true);
            }
        }
        if(name.length()!=11){
            contact_invalid.setVisible(true);
        }

    }

    @FXML
    void creditUnfocused(KeyEvent event) {

        String name = txt_credit.getText();
        if(credit_invalid.isVisible()==true){credit_invalid.setVisible(false); }
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        for(int i=0; i<name.length();i++){
            int ascii=name.charAt(i);

            if((ascii < 48 || ascii > 57)){

                credit_invalid.setVisible(true);
            }
        }
        if(name.length()>19 || name.length()<13 ){
            credit_invalid.setVisible(true);
        }

    }

    @FXML
    void passUnfocused(KeyEvent event) {

        String name = txt_pass.getText();
        if(pass_invalid1.isVisible()==true){ pass_invalid1.setVisible(false); }
        if(pass_invalid.isVisible() == true){ pass_invalid.setVisible(false);}
        if (fillAll.isVisible() == true) {
            fillAll.setVisible(false);
        }
        for(int i=0; i<name.length();i++){
            int ascii=name.charAt(i);
            if(ascii==44){

                pass_invalid1.setVisible(true);
            }
        }
    }
    @FXML
    void confirmpassUnfocussed(KeyEvent event) {
    }
}
