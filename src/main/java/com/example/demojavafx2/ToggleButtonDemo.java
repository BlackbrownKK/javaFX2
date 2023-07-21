package com.example.demojavafx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ToggleButtonDemo extends Application {
    ToggleButton tbOnOff;
    Label response;


    public static void main(String[] args) {
        //запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    // переопределить метод start()
    public void start(Stage myStage) {
        // присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate а Toggle Button");
        // Продемонстрировать переключатель
        // Использовать панель поточной компоновки
        // типа FlowPane в качестве корневого узла.
        // В данном случае - с промежутками 10 по
        // вертикали и по горизонтали
        FlowPane rootNode = new FlowPane(10, 10);
        // выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // создать сцену
        Scene myScene = new Scene(rootNode, 220, 120);
        //установить с цену на п одмостках
        myStage.setScene(myScene);
        // создать метку
        response = new Label("Push the Button . ");
        // Нажать кно пку
        // создать переключатель
        tbOnOff = new ToggleButton("On/Off");
        // Включить / Выключить
        //обработать события действия от переключателя
        tbOnOff.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (tbOnOff.isSelected())
                    response.setText("Button is on . ");
                    // Переключатель нажат

                else response.setText("Button is off. ");
                // Переключатель отпущен
            }
        });
        //ввести метку и переключатель в граф сцены
        rootNode.getChildren().addAll(tbOnOff, response);
        //пока з ать подмостки и сцену на них
        myStage.show();
    }
}
