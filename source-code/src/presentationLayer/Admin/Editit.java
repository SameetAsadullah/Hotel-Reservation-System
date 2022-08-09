package presentationLayer.Admin;

import javafx.fxml.FXML;
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
import logicLayer.Customer;

import logicLayer.Hotel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Editit {


    @FXML
    private TextField TExtHere;

    @FXML
    private Button EditITSave;

    String r;
    public void emailsent(String s) {
        r = s;
    }



    String button;
    public void btn(String s) {
        button= s;
    }


    String recv1,recv2;
    public void initdata(String s1,String s2){
        recv1=s1;
        recv2= s2;}
    @FXML
    void editSaveButton(ActionEvent event) throws Exception {

        String text=TExtHere.getText();

        HRS hrs=new HRS();

        System.out.println(button);

        System.out.println(r);


        Customer customer=hrs.searchCustomerByMail(r);

        if(button.charAt(0)=='C') {
            if (button == "CAccountNo") {

                hrs.editCustomerSelect(r, "AccountNo", text);

            } else if (button == "CAddress") {

                hrs.editCustomerSelect(r, "Address", text);
            } else if (button == "CCNIC") {

                hrs.editCustomerSelect(r, "CNIC", text);
            } else if (button == "CEmail") {

                hrs.editCustomerSelect(r, "Email", text);
            } else if (button == "CPhoneNo") {

                hrs.editCustomerSelect(r, "PhoneNo", text);
            } else if (button == "CName") {

                hrs.editCustomerSelect(r, "Name", text);
            } else if (button == "CPassword") {

                hrs.editCustomerSelect(r, "Password", text);
            }
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("CustShow.fxml"));


                Scene scene = new Scene(fxmlLoader.load(), 700, 600);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                CustShow c = fxmlLoader.getController();
                c.initData(r);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        }

        else if(button.charAt(0)=='R') {
            if (button == "RAccountNo") {

                hrs.editReceptionistSelect(r, "AccountNo", text);

            } else if (button == "RAddress") {

                hrs.editReceptionistSelect(r, "Address", text);
            } else if (button == "RCNIC") {

                hrs.editReceptionistSelect(r, "CNIC", text);
            } else if (button == "REmail") {

                hrs.editReceptionistSelect(r, "Email", text);
            } else if (button == "RPhoneNo") {

                hrs.editReceptionistSelect(r, "PhoneNo", text);
            } else if (button == "RName") {

                hrs.editReceptionistSelect(r, "Name", text);
            } else if (button == "RPassword") {

                hrs.editReceptionistSelect(r, "Password", text);
            }
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("RecpShow.fxml"));


                Scene scene = new Scene(fxmlLoader.load(), 700, 600);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                RecpShow c = fxmlLoader.getController();
                c.initData(r);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        }
        else if(button.charAt(0)=='V') {
            if (button == "VAccountNo") {

                hrs.editVendorSelect(r, "AccountNo", text);

            } else if (button == "VAddress") {

                hrs.editVendorSelect(r, "Address", text);
            } else if (button == "VCNIC") {

                hrs.editVendorSelect(r, "CNIC", text);
            } else if (button == "VEmail") {

                hrs.editVendorSelect(r, "Email", text);
            } else if (button == "VPhoneNo") {

                hrs.editVendorSelect(r, "PhoneNo", text);
            } else if (button == "VName") {

                hrs.editVendorSelect(r, "Name", text);
            } else if (button == "VPassword") {

                hrs.editVendorSelect(r, "Password", text);
            }
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("VendShow.fxml"));


                Scene scene = new Scene(fxmlLoader.load(), 700, 600);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                VendShow c = fxmlLoader.getController();
                c.initData(r);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        }
        else if (button.charAt(0)=='H'){


            System.out.println(button);

            System.out.println(r);


            Hotel hotel=hrs.searchHotelByNameLoc(recv1,recv2);

            if (button == "HDoublePrice") {

                hrs.editHotelSelect(recv1,recv2, "DoubleRoomPrice", text);

            } else if (button == "HLocation") {

                hrs.editHotelSelect(recv1,recv2, "Location", text);
            } else if (button == "HName") {

                hrs.editHotelSelect(recv1,recv2, "Name", text);
            }
        }









    }

}
