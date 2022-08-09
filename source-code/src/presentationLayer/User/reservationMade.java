package presentationLayer.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import logicLayer.Hotel;

import java.time.LocalDate;

public class reservationMade {

    // Label

    @FXML
    private Label txt_price;

    @FXML
    private Label txt_rooms;

    // Button

    @FXML
    private Button btn_close;

    //Function

    public void receiveEmail(Hotel recv) {
        int price = 0;
        String roomNumbers = "";

        for (int i = 0; i < recv.getRooms().size(); ++i) {
            if (recv.getRooms().get(i).getType().equals("Single")) {
                price += Integer.valueOf(recv.getSingleRoomPrice());
            } else {
                price += Integer.valueOf(recv.getDoubleRoomPrice());
            }

            if (i != (recv.getRooms().size() - 1)) {
                roomNumbers = roomNumbers + recv.getRooms().get(i).getNumber() + ", ";
            } else {
                roomNumbers = roomNumbers + recv.getRooms().get(i).getNumber();
            }
        }

        txt_price.setText(String.valueOf(price));
        txt_rooms.setText(roomNumbers);
    }

    @FXML
    void closeClick(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

}
