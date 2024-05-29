module FunktionGenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;


//    exports Funktionsgenerator;
//    opens Funktionsgenerator to javafx.fxml;
    exports ApplicationHandler;
    opens ApplicationHandler to javafx.fxml;
}