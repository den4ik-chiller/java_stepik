module com.example.mouselistener {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.mouselistener to javafx.fxml;
    exports com.example.mouselistener;
}