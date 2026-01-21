package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class StudentController {

    @FXML
    private JFXButton btnAttendance;

    @FXML
    private AnchorPane dashRoot;
    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnReports;

    @FXML
    private JFXButton btnSettings;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private ImageView imghome;

    @FXML
    private Label lableStManagementSys;

    @FXML
    private JFXButton lableStudentList;

    @FXML
    private JFXButton lbleCourses;

    @FXML
    private JFXButton lbleDashboard;


    public void btnLoginOnAction(ActionEvent actionEvent) {

    }
}




