package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import model.Student;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

import static javafx.fxml.FXMLLoader.load;

public class DashboardController {

    @FXML
    private JFXButton btnAttendance;
    @FXML
    private AnchorPane dashRoot;
    @FXML
    private JFXButton btnCourses;

    @FXML
    private JFXButton btnDashBoard;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnReports;

    @FXML
    private JFXButton btnSettings;

    @FXML
    private JFXButton btnStudentList;

    @FXML
    void btnAttendanceOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/Attendance.fxml");
            assert resource!=null;
            Parent parent = FXMLLoader.load(resource);
            dashRoot.getChildren().clear();
            dashRoot.getChildren().add(parent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnCoursesOnAction(ActionEvent event) {

        try {
            URL resource = this.getClass().getResource("/view/Courses.fxml");
            assert resource!=null;

            Parent parent = FXMLLoader.load(resource);
            dashRoot.getChildren().clear();
            dashRoot.getChildren().add(parent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/Analytics.fxml");
            assert resource!=null;

            Parent parent = FXMLLoader.load(resource);
            dashRoot.getChildren().clear();
            dashRoot.getChildren().add(parent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnReportsOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/Report.fxml");
            assert resource!=null;

            Parent parent = FXMLLoader.load(resource);
            dashRoot.getChildren().clear();
            dashRoot.getChildren().add(parent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnSettingsOnAction(ActionEvent event) {
        try {
            URL resource = this.getClass().getResource("/view/Settings.fxml");
            assert resource!=null;

            Parent parent = FXMLLoader.load(resource);
            dashRoot.getChildren().clear();
            dashRoot.getChildren().add(parent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
   ArrayList<Student> studentArrayList= new ArrayList<>();
    @FXML
    void btnStudentListOnAction(ActionEvent event) {

        try {
            URL resource = this.getClass().getResource("/view/Student.fxml");
            assert resource!=null;


            Parent parent = load(resource);
            dashRoot.getChildren().clear();
            dashRoot.getChildren().add(parent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
