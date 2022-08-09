package presentationLayer.Admin;

import javafx.fxml.FXML;
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

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HotelM {


        @FXML
        private TextField txt_name;

        @FXML
        private Button HotelSearch;

        @FXML
        private TextField txt_location;

        @FXML
        private Label label_invalid;

        @FXML
        void SearchHotelButton(ActionEvent event) {

            HRS hrs = new HRS();
            String name = txt_name.getText();
            String loc=txt_location.getText();

            if (hrs.searchHotelByNameLoc(name,loc)!=null) {
                ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("HotelShow.fxml"));


                    Scene scene = new Scene(fxmlLoader.load(), 700, 600);
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(scene);
                    HotelShow c=fxmlLoader.getController();
                    c.initdata(name,loc);
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
