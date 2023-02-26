module com.example.keylogger {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.keylogger to javafx.fxml;
    exports com.example.keylogger;
}