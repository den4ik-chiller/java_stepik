module com.example.joptionpane {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.joptionpane to javafx.fxml;
    exports com.example.joptionpane;
}