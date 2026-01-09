package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Student;

import java.sql.*;
import java.util.ArrayList;

public class DashboardController {

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
    void btnAttendanceOnAction(ActionEvent event) {

    }

    @FXML
    void btnCOursesOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnReportsOnAction(ActionEvent event) {

    }

    @FXML
    void btnSetttingsOnAction(ActionEvent event) {

    }
   ArrayList<Student> studentArrayList= new ArrayList<>();
    @FXML
    void btnStudentListOnAction(ActionEvent event) {

    }
    public void loadTable(){
        try {
            Statement statement;
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentjdbc", "root", "Rashpro")) {

                statement = connection.createStatement();
            }

            ResultSet resultSet = statement.executeQuery("select id,name,class,status,actions from Students");
            while(resultSet.next()){
                 studentArrayList.add(
                         new Student(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getInt(4),
                                resultSet.getInt(5)
    )
    );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
