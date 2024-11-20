package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Baum. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Tree extends GraphicalObject {
    private double s;

    public Tree(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.s = size;
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Tree-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Baum */
        drawTool.setCurrentColor(new Color(58,28,28));
        drawTool.drawFilledRectangle(x+50*s, y+90*s, 20*s, 100*s);
        /** Baumkrone */
        drawTool.setCurrentColor(new Color(247, 145, 35));
        drawTool.drawFilledEllipticArc(x,y+60*s,120*s,70*s,0, 360, 2);
        drawTool.drawFilledEllipticArc(x+15*s,y+30*s,90*s,53*s,0, 360, 2);
        drawTool.drawFilledEllipticArc(x+30*s,y+5*s,60*s,35*s,0, 360, 2);
        drawTool.drawFilledCircle(x+60*s, y, 15*s);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawEllipticArc(x,y+60*s,120*s,70*s,48, -276, 0);
        drawTool.drawEllipticArc(x+15*s,y+30*s,90*s,53*s,60, -300, 0);
        drawTool.drawEllipticArc(x+30*s,y+5*s,60*s,35*s,65, -310, 0);
        drawTool.drawCircle(x+60*s, y, 15*s);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}