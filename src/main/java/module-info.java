module com.example.demodinamic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demodinamic to javafx.fxml;
    exports com.example.demodinamic;
}