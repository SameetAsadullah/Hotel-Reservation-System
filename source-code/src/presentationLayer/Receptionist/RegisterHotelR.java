package presentationLayer.Receptionist;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import logicLayer.HRS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RegisterHotelR {

    //*
    //*
    //* Objects
    //*
    //*
    // Text Fields

    @FXML
    private TextField txt_name;

    @FXML
    private TextField txt_address;

    @FXML
    private TextField txt_location;

    @FXML
    private TextField txt_single_bed;

    @FXML
    private TextField txt_double_bed;

    @FXML
    private TextField rs_single_bed;

    @FXML
    private TextField rs_double_bed;

    // Buttons
    @FXML
    private Button btn_register;

    @FXML
    private Button btn_close;

    @FXML
    private Label invalidHotel;

    @FXML
    private Label registeredSuccessfully;

    @FXML
    private Label invalidName;

    @FXML
    private Label invalidAddress;

    @FXML
    private Label invalidLocation;

    @FXML
    private Label invalidSection;

    @FXML
    private Label Nullhotel;

    //*
    //*
    //* Functions
    //*
    //*

    @FXML
    void closeClick(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    void registerHotel(ActionEvent event) { // registration button
        HRS hrs = new HRS();
        String name = txt_name.getText();
        String address = txt_address.getText();
        String location = txt_location.getText();
        String totalSingleBeds = txt_single_bed.getText();
        String singlePrice = rs_single_bed.getText();
        String totalDoubleBeds = txt_double_bed.getText();
        String doublePrice = rs_double_bed.getText();

        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }

    if(!name.isEmpty() && !address.isEmpty() && !location.isEmpty() && !totalSingleBeds.isEmpty() && !singlePrice.isEmpty() && !totalDoubleBeds.isEmpty() && !doublePrice.isEmpty()) {
        if(!invalidAddress.isVisible() && !invalidName.isVisible() && !invalidSection.isVisible() && !invalidLocation.isVisible()) {
            if (hrs.validateHotel(name, location)) {
                hrs.registerHotel(name, address, location, totalSingleBeds, totalDoubleBeds, singlePrice, doublePrice);
                registeredSuccessfully.setVisible(true);
            }
            else{
                invalidHotel.setVisible(true);
            }
        }
    }
    else {
            Nullhotel.setVisible(true);
        }
    }

    @FXML
    void addressUnfocus(KeyEvent event) {
        String name = txt_address.getText();
        if(invalidAddress.isVisible()==true){ invalidAddress.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);
            if (ascii == 44) {

                invalidAddress.setVisible(true);
            }
        }
    }

    @FXML
    void doubleBedUnfocus(KeyEvent event) {

        String name = txt_double_bed.getText();
        if (invalidSection.isVisible() == true) {invalidSection.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 48 || ascii > 57) ) {

                invalidSection.setVisible(true);
            }
        }
    }

    @FXML
    void doublePriceUnfocus(KeyEvent event) {

        String name = rs_double_bed.getText();
        if (invalidSection.isVisible() == true) {invalidSection.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 48 || ascii > 57) ) {
                invalidSection.setVisible(true);
            }
        }
    }

    @FXML
    void locationUnfocus(KeyEvent event) {
        String name = txt_location.getText();
        if (invalidLocation.isVisible() == true) {invalidLocation.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if (ascii==44) {

                invalidLocation.setVisible(true);
            }
        }
    }

    @FXML
    void nameUnfocus(KeyEvent event) {

        String name = txt_name.getText();
        if (invalidName.isVisible() == true) {invalidName.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122) && (ascii < 48 || ascii > 57)) {

                invalidName.setVisible(true);
            }
        }
    }

    @FXML
    void singleBedUnfocus(KeyEvent event) {

        String name = txt_single_bed.getText();
        if (invalidSection.isVisible() == true) {invalidSection.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 48 || ascii > 57) ) {

                invalidSection.setVisible(true);
            }
        }
    }

    @FXML
    void singlePriceUnfocus(KeyEvent event) {

        String name = rs_single_bed.getText();
        if (invalidSection.isVisible() == true) {invalidSection.setVisible(false); }
        if (registeredSuccessfully.isVisible()) {
            registeredSuccessfully.setVisible(false);
        }
        if (invalidHotel.isVisible()) {
            invalidHotel.setVisible(false);
        }
        if(Nullhotel.isVisible()){
            Nullhotel.setVisible(false);
        }
        for(int i=0; i<name.length();i++) {
            int ascii = name.charAt(i);

            if ((ascii < 48 || ascii > 57) ) {

                invalidSection.setVisible(true);
            }
        }
    }
}
