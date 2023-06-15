package com.dongpl.controller;

import com.dongpl.FXMLController;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class BaseSceneController implements Initializable {
    @FXML
    public JFXButton userAddButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void insert(ActionEvent actionEvent) {
        System.out.println(actionEvent);
    }

}
