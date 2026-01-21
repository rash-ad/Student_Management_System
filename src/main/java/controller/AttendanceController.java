package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AttendanceController {

    @FXML
    private TableColumn<?, ?> ColActions;

    @FXML
    private TableColumn<?, ?> ColId;

    @FXML
    private TableColumn<?, ?> ColName;

    @FXML
    private TableColumn<?, ?> ColStatus;

    @FXML
    private DatePicker Date;

    @FXML
    private JFXButton btnAddStudent;

    @FXML
    private JFXButton btnAttendance;

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
    private AnchorPane dashRoot;

    @FXML
    private AnchorPane lbleAttendance;

    @FXML
    private TextField txtSearch;
    @FXML
    void txtFieldSearchEnter(KeyEvent event) {

    }

}
