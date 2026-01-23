package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class LoginController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private CheckBox checkBoxRememberMe;

    @FXML
    private ImageView imgUsername;

    @FXML
    private Label lableLoginForm;

    @FXML
    private Label lableStudentMSystem;

    @FXML
    private Rectangle lableStudentManagementSystem;

    @FXML
    private Hyperlink linkForgotPassword;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    void btnLoginOnAction(ActionEvent event) {

    }

}
