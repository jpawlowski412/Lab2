package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    public Button btnMain;
    public TextField txtLicznik;

    int clickCounter=0;
    public void onBtnAction(ActionEvent actionEvent) {
        txtLicznik.setText("kliknięcie nr " + ++clickCounter);
        if (clickCounter == 1)
            btnMain.setText("i jeszcze raz");
    }
}