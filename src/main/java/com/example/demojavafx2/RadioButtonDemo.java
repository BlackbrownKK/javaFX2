package com.example.demojavafx2;

import javafx.application.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableBooleanValue;
import javafx.beans.value.ObservableValue;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {
    // Простой пример, демонстрирующий применение
// кнопок-переключателей. Это JаvаFХ-приложение
// реагирует на события действия, генерируемые
// выбираемыми кнопками-переключателями.
// В нем демонстрируется также активизация
// кнопки-переключателя под управлением программы

    Label response;

    public static void main(String[] args) {
        // запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
        //переопределить метод start()
    }

    public void start(Stage myStage) {
        // присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate Radio Buttons");
        // Продемонстрировать кнопки-переключатели
        // Использовать панель поточной компоновки
        // типа FlowPane в качестве корневого узла.
        // В данном случае - с промежутками 10 по
        // вертикали и по горизонтали
        FlowPane rootNode = new FlowPane(10, 10);
        // выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
        // создать сцену
        Scene myScene = new Scene(rootNode, 220, 120);
// установить сцену на подмостках
        myStage.setScene(myScene);
// создать метку, извещающую о сделанном выборе
        response = new Label("");
// создать кнопки-переключатели
        RadioButton rbTrain = new RadioButton("Train");
        // Поезд
        RadioButton rbCar = new RadioButton("Car");
        // Автомобиль
        RadioButton rbPlane = new RadioButton("Airplane");
// Самолет
// создать группу кнопок-переключателей
        ToggleGroup tg = new ToggleGroup();
// ввести каждую кнопку-переключатель в группу
        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
// обработать события действия от кнопок-переключателей
        rbTrain.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("Transport selected is train.");
// Выбранным транспортным средством является поезд
            }
        });
        rbCar.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent ae) {
                response.setText("Transport selected is car.");
            }
        });
// Выбранным транспортным средством является автомобиль
        rbPlane.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent ae) {
                response.setText("Transport selected is airplane.");
// Выбранным транспортным средством является самолет
            }
        });
// Инициировать событие от первой выбранной
// кнопки-переключателя. В итоге кнопка-переключатель
// выбирается и наступает событие действия от
// этой кнопки-переключателя
        rbTrain.fire();
// ввести метку и кнопки-переключатели в граф сцены
        rootNode.getChildren().addAll(rbTrain, rbCar,
                rbPlane, response);
// показать подмостки и сцену на них
        myStage.show();


//        //использовать приемник событий изменения,
//        //чтобы реагировать на изменения при выборе
//        //кнопок-переключателей из группы
//        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//            public void changed(
//                    ObservableValue<? extends Toggle> changed,
//                    Toggle oldVal, Toggle newval) {
//                // привести новое значение к типу RadioButton
//                RadioButton rb = (RadioButton) newVal;
//                // отобразить результат выбора
//                response.setText("Transport selected is " + rb.getText());
//                // Выбран указанный вид транспорта
//            }
//        });
//        // выбрать первую кнопку-переключатель, чтобы
//        //инициировать событие изменения в группе
//        rbTrain.setSelected(true);

    }
}
