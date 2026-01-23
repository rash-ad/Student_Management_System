package controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import model.Student;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AttendanceController implements Initializable {

    @FXML
    private TableColumn<?, ?> ColActions;
    @FXML
    private TableColumn<?, ?> ColClass;
    @FXML
    private TableColumn<?, ?> ColId;

    @FXML
    private TableColumn<?, ?> ColName;

    @FXML
    private TableColumn<?, ?> ColStatus;

    @FXML
    private DatePicker Date;

    @FXML
    private Label TotalStudents;

    @FXML
    private Label TotalStudents3;

    @FXML
    private Label TotalStudents4;

    @FXML
    private JFXButton btnAddStudent;

    @FXML
    private Label lableTotalStudentsNum;

    @FXML
    private Label lableotalCoursesNum;

    @FXML
    private Label lalePresentTodayNum;

    @FXML
    private AnchorPane lbleAttendance;

    @FXML
    private TableView<Student> tableStudents;


    @FXML
    private TextField txtSearch;
    ArrayList<Student> studentArrayList=new ArrayList<>();
    int count;
    @FXML
    void btnAddStudentOnAction(ActionEvent event) {


    }

    @FXML
    void txtFieldSearchEnter(KeyEvent event) {

    }

 void loadTable() {
    ColId.setCellValueFactory(new PropertyValueFactory<>("id"));
    ColName.setCellValueFactory(new PropertyValueFactory<>("Name"));
    ColClass.setCellValueFactory(new PropertyValueFactory<>("classes"));
    ColActions.setCellValueFactory(new PropertyValueFactory<>("actions"));
    ColStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc", "root", "rashpro");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students");
        while (resultSet.next()) {
             studentArrayList.add(
                    new Student(

                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5)
                    )
            );
        }
        ObservableList<Student> observableList =
                FXCollections.observableArrayList(studentArrayList);
        tableStudents.setItems(observableList);
    }catch (SQLException e){

throw new RuntimeException(e);

    }
}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        loadTable();
    }

}
