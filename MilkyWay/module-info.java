module com.example.earth {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.earth to javafx.fxml;
    exports com.example.earth;
}