package com.example.demojavafx2;
// узел графа сцены

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class ScrollPaneDemo extends Application {
    ScrollPane scrlPane;

    public static void main(String[] args) {
        // запустить JаvаFХ-приложение, вызвав метод launch(){
        launch(args);
    }

    // переопределить метод start()
    public void start(Stage myStage) {
// присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate а ScrollPane");
// Продемонстрировать элемент
// управления типа ScrollPane
// Использовать панель поточной компоновки типа FlowPane
        FlowPane rootNode = new FlowPane(10, 10);
// выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
// создать сцену
        Scene myScene = new Scene(rootNode, 200, 200);
// установить сцену на подмостках
        myStage.setScene(myScene);
// создать многострочную прокручиваемую метку,
// где отмечаются преимущества элемента управления
// типа ScrollPane над отдельными элементами
// управления полосами прокрутки
        Label scrlLabel = new Label(
                "А ScrollPane streamlines the process of\n"
                        + "adding scroll bars to а window whose\n"
                        + "contents exceed the window's dimensions.\n"
                        + "It also enaЫes а control to fit in a\n"
                        + "smaller space than it otherwise would.\n"
                        + "As such, it often provides а superior\n"
                        + "approach over using individual scroll bars.");
// создать панель прокрутки, установив в качестве
// содержимого метку типа scrlLabel
        scrlPane = new ScrollPane(scrlLabel);
// задать ширину и высоту окна просмотра
        scrlPane.setPrefViewportWidth(130);
        scrlPane.setPrefViewportHeight(80);
// разрешить панорамирование прокручиваемого
// содержимого
        scrlPane.setPannable(true);
// создать кнопку сброса
        Button btnReset = new Button("Reset Scroll Bar Positions");
// Установить полосы прокрутки в исходное положение
// обработать события действия от кнопки сброса
        btnReset.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {

// установить полосы прокрутки на нулевые позиции
                scrlPane.setVvalue(0);
                scrlPane.setHvalue(0);
            }
        });
// ввести метку и кнопку сброса в граф сцены
        rootNode.getChildren().addAll(scrlPane, btnReset);
// показать подмостки и сцену на них
        myStage.show();
    }
}
