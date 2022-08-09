
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

public class RecpM {

    @FXML
    private TextField txt_email;

    @FXML
    private Button btn_Search;


    @FXML
    private Label label_invalid;

    @FXML
    void SearchClick(ActionEvent event) {
        HRS hrs = new HRS();
        String email = txt_email.getText();

        if (hrs.searchReceptionistByMail(email)!=null) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("RecpShow.fxml"));


                Scene scene = new Scene(fxmlLoader.load(), 700, 600);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                RecpShow c=fxmlLoader.getController();
                c.initData(email);
                stage.show();
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        }
        else {
            label_invalid.setVisible(true);
        }

    }

}

