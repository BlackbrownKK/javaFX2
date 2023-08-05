package com.example.demojavafx2;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckboxDemo extends Application {
    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;
    Label response;
    Label allTargets;
    String targets = "";

    public static void main(String[] args) {
// запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    //переопределить метод start()
    public void start(Stage myStage) {
//присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate Checkboxes");
//Продемонстрировать флажки
//Использовать панель поточной компоновки
//типа FlowPane в качестве корневого узла.
// В данном случае с промежутками 10
//по вертикали и по горизонтали
        FlowPane rootNode = new FlowPane(10, 10);
// выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);
// создать сцену
        Scene myScene = new Scene(rootNode, 230, 140);
//установить сцену на подмостках
        myStage.setScene(myScene);
        Label heading = new Label("Select Deployment Options");
// Выбрать вариант развертывания приложения
// создать метку, извещающую о состоянии
//установленного флажка
        response = new Label("No Deployment Selected");
//Ни один из вариантов развертывания не выбран
// создать метку, извещающую обо всех
// установленных флажках
        allTargets = new Label("Target List: <none>");
//Список целевых флажков
// создать флажки
        cbWeb = new CheckBox("Web"); // Веб
        cbDesktop = new CheckBox("Desktop"); // Настольная система
        cbMobile = new CheckBox("MoЬile"); // Мобильное устройство
// обработать события действия от флажков
        cbWeb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbWeb.isSelected())

                    response.setText("Web deployment selected. ");
// Выбрано развертывание приложения в веб
                else
                    response.setText("Web deployment cleared. ");
// Развертывание приложения в веб отменено
                showAll();
            }
        });
        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbDesktop.isSelected())
                    response.setText("Desktop deployment selected.");
// Выбрано развертывание приложения в настольной системе
                else
                    response.setText("Desktop deployment cleared.");

// Развертывание приложения в настольной системе отменено
                showAll();
            }
        });

        cbMobile.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbMobile.isSelected())

                    response.setText("Mobile deployment selected.");
// Выбрано развертывание приложения
// на мобильном устройстве
                else
                    response.setText("Mobile deployment cleared.");
                // Развертывание приложения на
// мобильном устройстве отменено
                showAll();
            }
        });


        cbWeb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cbWeb.isIndeterminate())
                    response.setText("Web deployment indeterminate.");
                    // Развертывание приложения в веб не определено
                else if (cbWeb.isSelected())
                    response.setText("Web deployment selected.");
                    // Выбрано развертывание приложения в веб
                else
                    response.setText("Web deployment cleared.");
                // Развертывание приложения в веб отменено
                showAll();
            }
        });

        // использовать разделитель, чтобы улучшить
// порядок расположения элементов управления
        Separator separator = new Separator();
        separator.setPrefWidth(200);
// ввести элементы управления в граф сцены
        rootNode.getChildren().

                addAll(heading, separator,
                        cbWeb, cbDesktop,
                        cbMobile, response,
                        allTargets);
// показать подмостки и сцену на них
        myStage.show();
    }

    // обновить и показать список целевых флажков
    void showAll() {
        targets = "";
        if (cbWeb.isSelected()) targets = "Web";
        if (cbDesktop.isSelected()) targets += "Desktop ";
        if (cbMobile.isSelected()) targets += "MoЬile";
        if (targets.equals("")) targets = "<none>";
        allTargets.setText("Target List: " + targets);
    }


}
