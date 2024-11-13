package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Fence extends GraphicalObject {
    public Fence(){
        // Hier passiert momentan nichts
    }

    @Override
    public void draw(DrawTool drawTool) {
        /** Zaun */
        drawTool.setCurrentColor(new Color(139,69,19));
        drawTool.drawFilledRectangle(0, 520, 590, 15);
        drawTool.drawFilledRectangle(0, 555, 590, 15);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(0, 520, 590, 15);
        drawTool.drawRectangle(0, 555, 590, 15);

        for (int i = 0; i < 20; i++) {
            drawTool.setCurrentColor(new Color(139,69,19));
            drawTool.drawFilledRectangle(2+30*i, 510, 15, 70);
            drawTool.drawFilledTriangle(2+30*i, 510, 9.5+30*i, 500, 17+30*i, 510);
            drawTool.setCurrentColor(Color.BLACK);
            drawTool.drawRectangle(2+30*i, 510, 15, 70);
            drawTool.drawTriangle(2+30*i, 510, 9.5+30*i, 500, 17+30*i, 510);
        }
    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
