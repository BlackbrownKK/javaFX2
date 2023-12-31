package com.example.demojavafx2;

import javafx.application.Application;
// Продемонстрировать применение представления списка
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    Label response;

    public static void main(String[] args) {
// запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    // переопределить метод start()
    public void start(Stage myStage) {
// присвоить заголовок подмосткам
        myStage.setTitle("ListView Demo");
// Демонстрация представления списка
// Использовать панель поточной компоновки
// типа FlowPane в качестве корневого узла.
// В данном случае - с промежутками 10
// по вертикали и по горизонтали
        FlowPane rootNode = new FlowPane(10, 10);
// выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
// создать сцену
        Scene myScene = new Scene(rootNode, 200, 120);
// установить сцену на подмостках
        myStage.setScene(myScene);
// создать метку
        response = new Label("Select Transport Туре");
// Выбрать вид транспортного средства
// создать список типа ObservableList из
// элементов для представления списка

 
        ObservableList<String> transportTypes =
                FXCollections.observableArrayList(
                        "Train", "Car", "Airplane", "Bicycle", "Walking");
// создать представление списка
        ListView<String> lvTransport =
                new ListView<String>(transportTypes);
// задать предпочтительную высоту и ширину
// представления списка
        lvTransport.setPrefSize(80, 80);
// получить модель выбора для представления списка
        MultipleSelectionModel<String> lvSelModel =
                lvTransport.getSelectionModel();
// ввести приемник событий изменения,
// чтобы реагировать на выбор элементов
// в представлении списка

        lvTransport.getSelectionModel() .setSelectionMode(
                SelectionMode.MULTIPLE); // delete to turn off

        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(
                    ObservableValue<? extends String> changed,
                    String oldVal, String newVal) {


                String selltems = "";
                ObservableList<String> selected =
                        lvTransport.getSelectionModel() .getSelectedItems();
                // отобразить результаты выбора
                for(int i=0; i < selected.size(); i++)
                    selltems += "\n " + selected.get(i);

// отобразить результат выбора
                response.setText("Transport selected is " + selltems);
// Выбрано указанное транспортное средство
            }
        });
// ввести метку и представление списка в граф сцены
        rootNode.getChildren().addAll(lvTransport, response);
// показать подмостки и сцену на них
        myStage.show();
    }
}
