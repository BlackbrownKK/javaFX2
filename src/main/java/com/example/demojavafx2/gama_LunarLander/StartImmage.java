package com.example.demojavafx2.gama_LunarLander;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class StartImmage {

    public GraphicsContext setStartImmageForLuna(Canvas myCanvas) {
        Canvas myNewCanvas = new Canvas(myCanvas.getWidth(), myCanvas.getHeight());
        //получить графический контекст для холста
        GraphicsContext gc;
        gc = myCanvas.getGraphicsContext2D();
        gc.strokeLine(0, 0, 200, 200);
        return myNewCanvas.getGraphicsContext2D();
    }
}
