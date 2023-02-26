module com.example.racing {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.racing to javafx.fxml;
    exports com.example.racing;
}