package com.example.demojavafx2;
// В этом примере применения кнопок-переключателей
// демонстрируется получение кнопки-переключателя,
// выбранной в текущий момент из группы, под управлением
// программы, когда в этом возникает потребность, вместо
// реагирования на события действия или изменения.
// В данном примере события, связанные с
// кнопками-переключателями, не обрабатываются.
// Вместо этого просто получается выбранная в
// данный момент кнопка-переключатель, когда
// нажимается экранная кнопка Confirm Transport Selection

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class RadioButtonDemo2 extends Application {
    Label response;
    ToggleGroup tg;
    public static void main(String[] args) {
// запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }
    // переопределить метод start()
    public void start(Stage myStage) {
//присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate Radio Buttons");
// Продемонстрировать кнопки-переключатели
// Использовать панель поточной компоновки
// типа FlowPane в качестве корневого узла.
// В данном случае - с промежутками 10
// по вертикали и по горизонтали
        FlowPane rootNode = new FlowPane(10, 10);
// выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
// создать сцену
        Scene myScene = new Scene(rootNode, 200, 140);
//установить сцену на подмостках
        myStage.setScene(myScene);
// создать две метки
        Label choose = new Label(
                " Select а Transport Туре ");
// Выбор транспортного средства
        response = new Label("No transport confirmed");
// Выбор транспортного средства не подтвержден
// создать экранную кнопку для подтверждения
// выбора транспортного средства
        Button btnConfirm = new Button("Confirm Transport Selection");
// Подтвердить выбор транспортного средства
// создать кнопки-переключатели
        RadioButton rbTrain = new RadioButton("Train"); // Поезд
        RadioButton rbCar = new RadioButton("Car");     // Автомобиль
        RadioButton rbPlane = new RadioButton("Airplane"); // Самолет
// создать группу кнопок-переключателей
        tg = new ToggleGroup();
// ввести каждую кнопку-переключатель в группу
        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
// первоначально выбрать одну из кнопок-переключателей
        rbTrain.setSelected(true);
// обработать события действия от кнопки
// подтверждения выбора транспортного средства
        btnConfirm.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
// получить выбранную в настоящий момент
// кнопку-переключатель
                RadioButton rb = (RadioButton) tg.getSelectedToggle();
// отобразить результат выбора
// транспортного средства
                response.setText(rb.getText() + " is confirmed.");
// Подтверждено указанное транспортное средство
            }
        });
// использовать разделитель, чтобы улучшить порядок
// расположения элементов управления
        Separator separator = new Separator();
        separator.setPrefWidth(180);
// ввести метку и все виды кнопок в граф сцены
        rootNode.getChildren().addAll(choose, rbTrain, rbCar,
                rbPlane, separator,
                btnConfirm, response);




// показать подмостки и сцену на них
        myStage.show();
    }
}
