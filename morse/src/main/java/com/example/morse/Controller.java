package com.example.morse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane back;

    @FXML
    private Button fromMorseButton;

    @FXML
    private TextArea inputArea;

    @FXML
    private TextArea resultArea;

    @FXML
    private Button toMorseButton;

    @FXML
    void fromMorse(ActionEvent event) {
        String result = Functions.fromMorzeToEng(inputArea.getText());
        if (result != null)
            resultArea.setText(result);
        else
            resultArea.setText("NO TEXT");
    }

    @FXML
    void toMorse(ActionEvent event) {
        String result = Functions.fromEngToMorze(inputArea.getText());
        if (result != null)
            resultArea.setText(result);
        else
            resultArea.setText("NO CODE");
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert fromMorseButton != null : "fx:id=\"fromMorseButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert inputArea != null : "fx:id=\"inputArea\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert resultArea != null : "fx:id=\"resultArea\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert toMorseButton != null : "fx:id=\"toMorseButton\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}