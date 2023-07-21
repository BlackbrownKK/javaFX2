package com.example.demojavafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {
    public static void main(String[] args) {
        //запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }
    public void init() {
        System.out.println("B теле метода init() .");
    }
    // переопределить метод start()

    public void start(Stage myStage) {
        //присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate а JavaFX label.");
        //Продемонстрировать метку в JavaFX использовать панель поточной компоновки типа FlowPane в качестве корневого узла
        FlowPane rootNode = new FlowPane();
        //создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);
        //установить сцену на подмостках
        myStage.setScene(myScene);
        //создать метку
        Label myLabel = new Label("This is а JavaFX label");
        //Это метка в JavaFX
        //ввести метку в граф сцены
        rootNode.getChildren().add(myLabel);
        //показать подмостки и сцену на них
        myStage.show();
    }
}
