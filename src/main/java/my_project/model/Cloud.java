package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Wolke. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Cloud extends GraphicalObject {
    private double s;
    private int v;
    private int r;

    public Cloud(double x, double y, double size, int geschwindigkeit, int richtung){
        this.x = x;
        this.y = y;
        s = size;
        v = geschwindigkeit;
        r = richtung;
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
        x = x + r*v*dt;
                if(x>700){
                    x = -60;
                    y = Math.random()*300;
                }
                if (x<-200){
                    x = 700;
                    y = Math.random()*300;
                }
    }
}
