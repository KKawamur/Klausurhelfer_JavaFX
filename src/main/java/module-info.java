module kkawamur.funktionsgenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens kkawamur.funktionsgenerator to javafx.fxml;
    exports kkawamur.funktionsgenerator;
}