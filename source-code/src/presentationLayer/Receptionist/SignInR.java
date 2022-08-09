package presentationLayer.Receptionist;

import logicLayer.HRS;
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

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignInR {

    //*
    //*
    //* Objects
    //*
    //*

    // Label

    @FXML
    private Label label_invalid;

    // Buttons

    @FXML
    private Button btn_signUp;

    @FXML
    private Button btn_signIn;

    @FXML
    private Button btn_close;

    @FXML
    private TextField txt_email;

    @FXML
    private PasswordField txt_password;

    //*
    //*
    //* Functions
    //*
    //*

    @FXML
    void signInClick(ActionEvent event) {
        HRS hrs = new HRS();
        String email = txt_email.getText();
        String password = txt_password.getText();

        //if (hrs.validateReceptionistAccount(email, password)) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("ShowOptions.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 900, 600);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        //}
        //else {
        //    label_invalid.setVisible(true);
        //}
    }

    @FXML
    void closeClick(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
}
