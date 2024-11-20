package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Wolke. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Cloud extends GraphicalObject {
    private double s;

    public Cloud(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.s = size;
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Cloud-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Wolken */
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x+50*s, y-20*s, 30*s);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x, y, 40*s);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x+50*s, y+30*s, 40*s);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x+150*s, y+10*s, 40*s);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x+100*s, y+30*s, 35*s);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x+100*s, y-20*s, 35*s);
        drawTool.setCurrentColor(Color.WHITE);
        drawTool.drawFilledCircle(x+100*s, y+30*s, 35*s);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
