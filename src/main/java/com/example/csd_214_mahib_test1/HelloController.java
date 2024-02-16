package com.example.csd_214_mahib_test1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password123";
    private int counter = 0;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label message;

    @FXML
    protected void onloginbtnClick() {
        String username=this.username.getText();
        String password=this.password.getText();
        if(validateInput(username,password)){
            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                message.setText("Success!!!");
            } else {
                counter++;
                if (counter >= 5){
                    message.setText("Sorry, Your Account is Locked!!!");
                } else {
                    message.setText("Sorry, Invalid Username or Password");
                }
            }
        }else {
            message.setText("Please Provide Username or Password");
        }

    };
    private boolean validateInput(String username, String password) {
        return !username.isEmpty() && !password.isEmpty();
    }
}




