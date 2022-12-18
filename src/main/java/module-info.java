module com.example.hystory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hystory to javafx.fxml;
    exports com.example.hystory;
}