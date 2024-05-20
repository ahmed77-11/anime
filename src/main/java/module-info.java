module com.selim.anime {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.selim.anime.Beans to javafx.base;
    opens com.selim.anime to javafx.fxml;
    exports com.selim.anime;
    exports com.selim.anime.controllers;
    opens com.selim.anime.controllers to javafx.fxml;

}