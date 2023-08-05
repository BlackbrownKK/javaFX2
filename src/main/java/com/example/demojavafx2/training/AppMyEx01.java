package com.example.demojavafx2.training;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMyEx01 extends Application {
    Label responseDay;
    Label responseSum;
    Label ballance;


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        StatusForToday newGame = new StatusForToday();

        myStage.setTitle("My investition ");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.BASELINE_LEFT);


        Scene myScene = new Scene(rootNode, 500, 300);
        myStage.setScene(myScene);


        ballance = new Label("ballance is " + newGame.getballance());
        responseDay = new Label("Today is " + newGame.getDay());
        responseSum = new Label("You have money " + newGame.getSum());

        Button bicycle = new Button("Bicycle (+5) 100");
        Button scooter = new Button("Scooter (+7) 250");
        Button coffeeAutomate = new Button("Coffee Automate (+15) 1 000");
        Button car = new Button("Car (+20) 2 000");
        Button electricBicycle = new Button("Electric Bicycle (+25) 5 000");
        Button electricScooter = new Button("Electric Scooter (+35) 6 000");
        Button mobileHome = new Button("Mobile Home (+100) 10 000");


        bicycle.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addBicycle();
                ballance.setText("ballance is +" + newGame.getballance());
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });

        car.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addCar();
                ballance.setText("ballance is +" + newGame.getballance());
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });

        coffeeAutomate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addCoffeeAutomate();
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });
        electricBicycle.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addElectricBicycle();
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });
        electricScooter.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addElectricScooter();
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });
        scooter.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addScooter();
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });
        mobileHome.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.addMobileHome();
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });

        Button nextDay = new Button("next day");
        nextDay.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                newGame.nextDay();
                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
            }
        });


        Button nextTenDays = new Button("next ten days");
        nextTenDays.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                for (int i = 0; i < 10; i++) {
                    newGame.nextDay();
                }

                responseDay.setText("Today is " + newGame.getDay());
                responseSum.setText("You have money " + newGame.getSum());
                System.out.println("Day = " + newGame.getDay());
                System.out.println("Sum = " + newGame.getSum());
            }
        });


//        rootNode.getChildren().addAll(choose, nextDay, nextTenDays, bicycle, car, coffeeAutomate, electricBicycle,
//                electricScooter, mobileHome, scooter, responseDay, responseSum);

        HBox leftSide = new HBox(10);
        leftSide.setAlignment(Pos.CENTER_LEFT);
        leftSide.getChildren().addAll(responseDay, responseSum, nextDay, nextTenDays);

        VBox rightSide = new VBox(10);
        rightSide.setAlignment(Pos.CENTER_RIGHT);
        rightSide.getChildren().addAll(bicycle, scooter, coffeeAutomate, car, electricBicycle,
                electricScooter, mobileHome);

        HBox mainLayout = new HBox(20);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(leftSide, rightSide, ballance);

        Scene myScene2 = new Scene(mainLayout, 800, 300);
        myStage.setScene(myScene2);
        myStage.show();

    }
}
