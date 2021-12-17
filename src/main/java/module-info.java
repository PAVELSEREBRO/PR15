module com.example.pr15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr15 to javafx.fxml;
    exports com.example.pr15;
}