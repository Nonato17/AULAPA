module com.mycompany.mavenproject3fxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.mavenproject3fxml to javafx.fxml;
    exports com.mycompany.mavenproject3fxml;
}
