package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class ReportController {

    @FXML
    private DatePicker DateStudentReport;

    @FXML
    private JFXButton btnAttendance;

    @FXML
    private JFXButton btnCourses;

    @FXML
    private JFXButton btnDashBoard;

    @FXML
    private JFXButton btnExportReport;

    @FXML
    private JFXButton btnGenerateReport;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnReports;

    @FXML
    private JFXButton btnSettings;

    @FXML
    private JFXButton btnStudentList;

    @FXML
    private JFXComboBox<?> comboBoxStudentReports;

    @FXML
    void btnGenerateReportOnAction(ActionEvent event) {

    }

    public void btnExportReport(ActionEvent actionEvent) {

    }
}
