module com.maxiflexy.monieshopbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires mysql.connector.j;

    opens com.maxiflexy.monieshopbank to javafx.fxml;
    exports com.maxiflexy.monieshopbank;
    exports com.maxiflexy.monieshopbank.controllers;
    exports com.maxiflexy.monieshopbank.controllers.admin;
    exports com.maxiflexy.monieshopbank.controllers.client;
    exports com.maxiflexy.monieshopbank.models;
    exports com.maxiflexy.monieshopbank.views;
}