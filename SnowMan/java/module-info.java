module com.example.snowman {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snowman to javafx.fxml;
    exports com.example.snowman;
}