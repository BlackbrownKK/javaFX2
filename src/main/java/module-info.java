module com.example.demojavafx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    exports com.example.demojavafx2.training;
    opens com.example.demojavafx2.training to javafx.fxml;
}