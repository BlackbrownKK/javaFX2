module com.example.demojavafx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demojavafx2 to javafx.fxml;
    exports com.example.demojavafx2;
    exports com.example.demojavafx2.gama_LunarLander;
    opens com.example.demojavafx2.gama_LunarLander to javafx.fxml;
}