package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField firstname;

    public void handleSayBonjour(ActionEvent actionEvent) {
        System.out.printf("Bonjour %s! %n", firstname.getText());
    }
}
