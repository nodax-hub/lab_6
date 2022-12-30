module com.example.lab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires json.simple;

    opens com.example.lab_6 to javafx.fxml;
    exports com.example.lab_6;
    exports com.example.lab_6.ui;
    opens com.example.lab_6.ui to javafx.fxml;
    exports com.example.lab_6.controllers;
    opens com.example.lab_6.controllers to javafx.fxml;
}