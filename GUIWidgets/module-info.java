module com.example.guiwidgets {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.guiwidgets to javafx.fxml;
    exports com.example.guiwidgets;
}