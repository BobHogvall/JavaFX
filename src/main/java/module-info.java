module se.iths.twentytwofx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.twentytwofx.javafx to javafx.fxml;
    exports se.iths.twentytwofx.javafx;
}