package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {
    public Sun(){
        // Hier passiert momentan nichts
    }

    @Override
    public void draw(DrawTool drawTool) {
        /** Himmel */
        drawTool.setCurrentColor(new Color(135,206,235));
        drawTool.drawFilledRectangle(0,0,600,600);
        /** Sonne */
        drawTool.setCurrentColor(new Color(255, 221, 33));
        drawTool.drawFilledCircle(50,50, 80);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
