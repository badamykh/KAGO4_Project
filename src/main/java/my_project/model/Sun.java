package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Sonne. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Sun extends GraphicalObject {
    private double rY;
    private double rX;
    private double a;
    public Sun(){
        this.y = 510;
        this.x = 575;
        a = 0;
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Sun-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Himmel */
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(0,0,600,600);
        drawTool.setCurrentColor(135, 206, 235, (int) a);
        drawTool.drawFilledRectangle(0,0,600,600);
        /** Sonne */
        drawTool.setCurrentColor(new Color(255, 221, 33));
        drawTool.drawFilledCircle(x,y, 50);

    }

    @Override
    public void update(double dt){
        /** Sonne */
        if(x >= 575){
            rY = 1;
            rX = -1;
        }else if(x <= 25){
            rY = -1;
            rX = 1;
        }
        x = x + rX * 80 * dt;
        y = 510 + rY * Math.sqrt(275 * 275 - (x - 300) * (x - 300));

        /** Himmel */
        if(y<=680 && x<=150){
            a = a + 148*dt;
        }else if(y>=350 && y<=750 && x>=450){
            a = a - 148*dt;
        }

        if (a > 255) {
            a = 255;
        } else if (a < 0) {
            a = 0;
        }
    }
}
