module com.example.grass {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.grass to javafx.fxml;
    exports com.example.grass;
}