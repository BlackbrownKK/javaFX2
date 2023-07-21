package com.example.demojavafx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonimageDemo extends Application {
    Label response;

    public static void main(String[] args) {
// запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    // переопределить метод start()
    public void start(Stage myStage) {
// присвоить заголовок подмосткам
        myStage.setTitle("Use Images with Buttons");
// Использовать изображения в кнопках
// Использовать панель поточной компоновки
// типа FlowPane в качестве корневого узла.
// В данном случае - с промежутками 10 по
// вертикали и по горизонтали
        FlowPane rootNode = new FlowPane(10, 10);
// выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
// создать сцену
        Scene myScene = new Scene(rootNode, 250, 450);
//установить сцену на подмостках
        myStage.setScene(myScene);
// создать метку
        response = new Label("Push а Button"); //Нажать кнопку
// создать две экранные кнопки с текстовыми надписями
//и соответствующими изображениями часов
        Button btnHourglass = new Button("Hourglass",
                new ImageView("C:\\Users\\k.kosteniuk\\Desktop\\hillel\\projects\\demoJavaFX2\\src\\main\\java\\" +
                        "com\\example\\demojavafx2\\hourglass.png"));
        Button btnAnalogClock = new Button("Analog Clock",
                new ImageView("C:\\Users\\k.kosteniuk\\Desktop\\hillel\\projects\\demoJavaFX2\\src\\main\\java" +
                        "\\com\\example\\demojavafx2\\analog.png"));
//расположить текст под изображением
        btnHourglass.setContentDisplay(ContentDisplay.TOP);
        btnAnalogClock.setContentDisplay(ContentDisplay.TOP);
//обработать события действия от экранной кнопки
// с изображением песочных часов
        btnHourglass.setOnAction(
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        response.setText("Hourglass Pressed");
                    }
                });
// Нажата кнопка с изображением песочных часов
//обработать события действия от экранной кнопки
// с изображением аналоговых часов
        btnAnalogClock.setOnAction(
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        response.setText("Analog Clock Pressed");
                    }
                });
//Нажата кнопка с изображением аналоговых часов
// ввести метку и экранные кнопки в граф сцены
        rootNode.getChildren().addAll(btnHourglass,
                btnAnalogClock, response);
//показать подмостки и сцену на них
        myStage.show();
    }
}
