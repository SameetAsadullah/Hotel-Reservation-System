package presentationLayer.Vendor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import logicLayer.HRS;
import logicLayer.Vendor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class RegisterHotelV {

    //*
    //*
    //* Objects
    //*
    //*

    // Panel

    @FXML
    private AnchorPane pane_register;

    @FXML
    private AnchorPane pane_view;

    // Text Fields

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
    private Button left_register;

    @FXML
    private Button left_viewHotel;

    @FXML
    private Button left_viewAcc;

    // Labels

    @FXML
    private Label txt_innerHeading;

    // Table

    @FXML
    private TableView<VendorV> table_view;

    @FXML
    private TableColumn<VendorV, String> col1;

    @FXML
    private TableColumn<VendorV, String> col2;

    //*
    //*
    //* Getting Vendor Acc
    //*
    //*

    private String email;
    public void receiveEmail(String e) {
        email = e;
    }

    Vendor vendor = new Vendor();
    private void getVendor()
    {
        HRS hrs = new HRS();
        vendor = hrs.searchVendorByMail(email);
    }

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

    @FXML
    void registerHotelClick(ActionEvent event) {
        pane_view.setVisible(false);
        pane_register.setVisible(true);
    }

    @FXML
    void viewAccClick(ActionEvent event) {
        pane_register.setVisible(false);
        pane_view.setVisible(true);
        txt_innerHeading.setText("Your Account");

        getVendor();
        ObservableList<VendorV> list = FXCollections.observableArrayList(
                new VendorV("Name", vendor.getName()),
                new VendorV("Email", vendor.getEmail()),
                new VendorV("CNIC", vendor.getCNIC()),
                new VendorV("Address", vendor.getAddress()),
                new VendorV("Contact No", vendor.getPhoneNo()),
                new VendorV("Credit Card No", vendor.getAccountNo())
        );

        col1.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s1"));
        col1.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s1"));
        col1.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s1"));
        col1.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s1"));
        col1.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s1"));
        col1.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s1"));

        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s2"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s2"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s2"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s2"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s2"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s2"));
        table_view.setItems(list);

        /*col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s"));
        col2.setCellValueFactory(new PropertyValueFactory<VendorV,String>("s"));
        table_view.setItems(list1);*/
    }

    @FXML
    void viewHotelClick(ActionEvent event) {
        pane_register.setVisible(false);
        pane_view.setVisible(true);
        txt_innerHeading.setText("Your Hotels");
    }
}
