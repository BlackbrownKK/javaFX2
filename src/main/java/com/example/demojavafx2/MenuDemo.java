package com.example.demojavafx2;
// Продемонстрировать меню

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.input.KeyCombination;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.application.Application;

public class MenuDemo extends Application {
    Label response;

    public static void main(String[] args) {
// запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    // переопределить метод start()
    public void start(Stage myStage) {
// присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate Menus");
// Демонстрация меню
// использовать панель граничной компоновки
// типа BorderPane в качестве корневого узла
        BorderPane rootNode = new BorderPane();
// создать сцену
        Scene myScene = new Scene(rootNode, 300, 300);
// установить сцену на подмостках
        myStage.setScene(myScene);
// создать метку для отображения
// результатов выбора из меню
        response = new Label("Menu Demo");
//Демонстрация меню
// создать строку меню
        MenuBar mb = new MenuBar();
// создать меню File
        Menu fileMenu = new Menu("File"); //Файл
        MenuItem open = new MenuItem("Open"); //Открыть
        MenuItem close = new MenuItem("Close"); // Закрыть
        MenuItem save = new MenuItem("Save"); //Сохранить
        MenuItem exit = new MenuItem("Exit"); // Выход
        fileMenu.getItems().addAll(open, close, save,
                new SeparatorMenuItem(), exit);
// ввести меню File в строку меню
        mb.getMenus().add(fileMenu);
// создать меню Options
        Menu optionsMenu = new Menu("Options"); //Параметры
// создать подменю Colors
        Menu colorsMenu = new Menu("Colors"); //Цвета
        MenuItem red = new MenuItem("Red"); //Красный
        MenuItem green = new MenuItem("Green"); //Зеленый
        MenuItem blue = new MenuItem("Blue"); //Синий

        colorsMenu.getItems().addAll(red, green, blue);
        optionsMenu.getItems().add(colorsMenu);

// создать подменю Priority
        Menu priorityMenu = new Menu("Priority"); //Приоритет
        MenuItem high = new MenuItem("High"); //Высокий
        MenuItem low = new MenuItem("Low"); //Низкий
        priorityMenu.getItems().addAll(high, low);
        optionsMenu.getItems().add(priorityMenu);
// ввести разделитель
        optionsMenu.getItems().add(new SeparatorMenuItem());
// создать пункт меню Reset
        MenuItem reset = new MenuItem("Reset"); //Сбросить
        optionsMenu.getItems().add(reset);
// ввести меню Options в строку меню
        mb.getMenus().add(optionsMenu);
// создать меню Help
        Menu helpMenu = new Menu("Help"); // Справка
        MenuItem about = new MenuItem("About"); // О программе
        helpMenu.getItems().add(about);
// ввести меню Help в строку меню
        mb.getMenus().add(helpMenu);
// создать один приемник действий для обработки
// всех событий действия, наступающих в меню
        EventHandler<ActionEvent> MEHandler =
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        String name = ((MenuItem) ae.getTarget()).getText();
// выйти из программы, если выбран пункт меню Exit
                        if (name.equals("Exit")) Platform.exit();
                        response.setText(name + " selected");
// Выбран указанный пункт меню
                    }
                };
// установить приемники действий от пунктов меню
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        red.setOnAction(MEHandler);
        green.setOnAction(MEHandler);
        blue.setOnAction(MEHandler);
        high.setOnAction(MEHandler);
        low.setOnAction(MEHandler);
        reset.setOnAction(MEHandler);
        about.setOnAction(MEHandler);


        // ввести оперативные клавиши для быстрого
        // выбора пунктов меню File
        open.setAccelerator(
                KeyCombination.keyCombination("shortcut+O"));
        close.setAccelerator(
                KeyCombination.keyCombination("shortcut+C"));
        save.setAccelerator(
                KeyCombination.keyCombination("shortcut+S"));
        exit.setAccelerator(
                KeyCombination.keyCombination("shortcut+E"));



        // ввести строку меню в верхней области панели
// граничной компоновки, а метку response -
// в центре этой панели
        rootNode.setTop(mb);
        rootNode.setCenter(response);



// показать подмостки и сцену на них
        myStage.show();
    }
}
