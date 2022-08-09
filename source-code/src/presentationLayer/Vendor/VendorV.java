package presentationLayer.Vendor;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class VendorV {
    public String s1, s2;

    public VendorV(String recv1, String recv2) {
        s1 = recv1;
        s2 = recv2;
        System.out.println(s1);
        System.out.println(s2);
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }
}
