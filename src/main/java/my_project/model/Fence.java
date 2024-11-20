package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Zaun. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Fence extends GraphicalObject {
    private double s;

    public Fence(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.s = size;
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Fence-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Zaun */
        drawTool.setCurrentColor(new Color(139,69,19));
        drawTool.drawFilledRectangle(x, y, 289*s, 15*s);
        drawTool.drawFilledRectangle(x, y+35*s, 289*s, 15*s);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(x, y, 289*s, 15*s);
        drawTool.drawRectangle(x, y+35*s, 289*s, 15*s);

        for (int i = 0; i < 10; i++) {
            drawTool.setCurrentColor(new Color(139,69,19));
            drawTool.drawFilledRectangle(x+2*s+30*s*i, y-5, 15*s, 70*s);
            drawTool.drawFilledTriangle(x+2.5*s+30*s*i, y-5, x+10*s+30*s*i, y-5-10*s, x+17.5*s+30*s*i, y-5);
            drawTool.setCurrentColor(Color.BLACK);
            drawTool.drawRectangle(x+2*s+30*s*i, y-5, 15*s, 70*s);
            drawTool.drawTriangle(x+2.5*s+30*s*i, y-5, x+10*s+30*s*i, y-5-10*s, x+17.5*s+30*s*i, y-5);
        }
    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
