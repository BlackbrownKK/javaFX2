package com.example.demojavafx2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LabelimageDemo extends Application {
    public static void main(String[] args) {
        //запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    //переопределить метод start()
    @Override
    public void start(Stage myStage) {
        //присвоить заголовок подмосткам
        myStage.setTitle("Use an Image in а Labe");
        // Использовать панель поточной компоновки
        // типа FlowPane в качестве корневого узла
        FlowPane rootNode = new FlowPane();
        // выполнить выравнивание по центру
        rootNode.setAlignment(Pos.CENTER);
        // создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);
        //установить сцену на подмостках
        myStage.setScene(myScene);
        // создать объект изображения
        Image hourglass = new Image("C:\\Users\\k.kosteniuk\\Desktop\\hillel\\projects\\demoJavaFX2\\src\\main" +
                "\\java\\com\\example\\demojavafx2\\Untitled.png");
        // создать представление этого изображения
        ImageView hourglassIV = new ImageView(hourglass);
        //создать метку, содержащую изображение и текст
        Label hourglassLabel = new Label("Hourglass", hourglassIV);
        //ввести метку в граф сцены
        rootNode.getChildren().add(hourglassLabel);
        // ввести изображение в граф сцены
        rootNode.getChildren().add(hourglassIV);
        //показать подмостки и сцену на них 
        hourglassLabel.setContentDisplay(ContentDisplay.TOP);
        myStage.show();
    }
}
