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
    private double a;
    private Sun sun;

    public Cloud(double x, double y, double size, int geschwindigkeit, int richtung, Sun sun){
        this.x = x;
        this.y = y;
        s = size;
        v = geschwindigkeit;
        r = richtung;
        a = 40;
        this.sun = sun;
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Cloud-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Wolken */
        drawTool.setCurrentColor(255, 255, 255, (int) a);
        drawTool.drawFilledCircle(x+50*s, y-20*s, 30*s);
        drawTool.drawFilledCircle(x, y, 40*s);
        drawTool.drawFilledCircle(x+50*s, y+30*s, 40*s);
        drawTool.drawFilledCircle(x+150*s, y+10*s, 40*s);
        drawTool.drawFilledCircle(x+100*s, y+30*s, 35*s);
        drawTool.drawFilledCircle(x+100*s, y-20*s, 35*s);
        drawTool.drawFilledCircle(x+100*s, y+30*s, 35*s);

    }

    @Override
    public void update(double dt){
        x = x + r*v*dt;
            if(x>700){
                x = -200;
                y = Math.random()*300;
            }

        if(sun.getY()<=680 && sun.getX()<=150){
            a = a + 148*dt;
        }else if(sun.getY()>=350 && sun.getY()<=750 && sun.getX()>=450){
            a = a - 148*dt;
        }

        if (a > 255) {
            a = 255;
        } else if (a < 40) {
            a = 40;
        }
    }
}
