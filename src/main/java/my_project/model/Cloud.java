package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {
    public Cloud(){
        // Hier passiert momentan nichts
    }

    @Override
    public void draw(DrawTool drawTool) {
        /** Wolken */
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(410, 70, 30);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(410, 70, 30);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(360, 90, 40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(360, 90, 40);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(410, 120, 40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(410, 120, 40);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(510, 100, 40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(510, 100, 40);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(460, 120, 35);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(460, 120, 35);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(460, 70, 35);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(460, 70, 35);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(460, 120, 35);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawCircle(460, 120, 35);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
