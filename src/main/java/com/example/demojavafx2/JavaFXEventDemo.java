package com.example.demojavafx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {
    Label response;

    public static void main(String[] args) {
        //запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }
    //переопределить метод start()

    @Override
    public void start(Stage myStage) throws Exception {
        //присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate JavaFX Buttons and Events.");
        //Продемонстрировать экранные кнопки и события в JavaFX
        /*
    Использовать панель поточной компоновки
    типа FlowPane в качестве корневого узла.
    Установить промежутки между элементами
    управления по горизонтали и по вертикали
    равными 10
         */
        FlowPane rootNode = new FlowPane(10, 10);
        //выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
        //создать сцену
        Scene myScene = new Scene(rootNode, 300, 100);
        //установить сцену на подмостках
        myStage.setScene(myScene);
        //создать метку
        response = new Label("Push а Button"); // Нажать кнопку
        //создать две экранные кнопки
        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");
        //обработать события действия от кнопки Alpha

//        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
//
//            public void handle(ActionEvent ae) {
//                response.setText("Alpha was pressed.");
//                // Нажата кнопка Alpha
//            }
//        });

        btnAlpha.setOnAction((ае) -> response.setText("Alpha was pressed. ")); // -  переписанный в виде лямбда-выражения.

        //обработать события действия от кнопки Beta
        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("Beta was pressed.");
                //Нажата кнопка Beta
            }
        });
        //ввести метку и экранные кнопки в граф сцены
        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
        //показать подмостки и сцену на них
        myStage.show();
    }
}