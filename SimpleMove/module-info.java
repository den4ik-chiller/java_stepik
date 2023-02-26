module com.example.simplemove {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.simplemove to javafx.fxml;
    exports com.example.simplemove;
}