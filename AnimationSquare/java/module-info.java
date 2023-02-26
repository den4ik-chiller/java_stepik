module com.example.animationsquare {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.animationsquare to javafx.fxml;
    exports com.example.animationsquare;
}