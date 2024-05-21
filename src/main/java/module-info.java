module com.example.merobank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.merobank to javafx.fxml;
    exports com.example.merobank;
    exports com.example.merobank.controller;
    exports com.example.merobank.controller.client;
    exports com.example.merobank.controller.admin;
    exports com.example.merobank.model;
    exports com.example.merobank.view;
}