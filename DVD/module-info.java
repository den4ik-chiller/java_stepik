module com.example.dvd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.dvd to javafx.fxml;
    exports com.example.dvd;
}