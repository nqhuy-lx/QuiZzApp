module com.hnq.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.hnq.mavenproject3 to javafx.fxml;
    exports com.hnq.mavenproject3;
}
