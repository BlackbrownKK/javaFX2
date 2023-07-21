package com.example.demojavafx2.gama_LunarLander;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LunarLander extends Application {
    GraphicsContext gc;
    public static void main(String[] args) {
        launch(args);
    }

    public LunarLander() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 500, 500);
        stage.setScene(myScene);

        stage.show();
    }
}
