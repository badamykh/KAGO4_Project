package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {
    private double s;
    private int r = (int)(Math.random()*256); // Typecast
    private int g = (int)(Math.random()*256); // Typecast
    private int b = (int)(Math.random()*256); // Typecast

    public House(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.s = size;
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(r,g,b));
        drawTool.drawFilledRectangle(x,y,200*s,140*s);
        /** Tür */
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(x+75*s, y+40*s, 50*s, 100*s);
        /** Fenster */
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(x+25*s, y+40*s, 30*s, 30*s);
        drawTool.drawFilledRectangle(x+145*s, y+40*s, 30*s, 30*s);
        /** Fensterrahmen */
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(x+25*s, y+40*s, 30*s, 30*s);
        drawTool.drawRectangle(x+145*s, y+40*s, 30*s, 30*s);
        /** Fensterkreuz */
        drawTool.drawLine(x+40*s, y+40*s, x+40*s, y+70*s);
        drawTool.drawLine(x+25*s, y+55*s, x+55*s, y+55*s);
        drawTool.drawLine(x+160*s, y+40*s, x+160*s, y+70*s);
        drawTool.drawLine(x+145*s, y+55*s, x+175*s, y+55*s);
        /** Türknauf */
        drawTool.setCurrentColor(Color.YELLOW);
        drawTool.drawFilledCircle(x+85*s, y+90*s, 10*s);
        /** Schornstein */
        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(x+150*s, y-80*s, 40*s, 90*s);
        /** Dach */
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledTriangle(x-35*s, y+15*s, x+235*s, y+15*s, x+100*s, y-75*s);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawTriangle(x-35*s, y+15*s, x+235*s, y+15*s, x+100*s, y-75*s);
    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}
