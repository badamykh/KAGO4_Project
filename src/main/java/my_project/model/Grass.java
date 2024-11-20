package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Gras. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Grass extends GraphicalObject {
    public Grass(){
        // Hier passiert momentan nichts
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Grass-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Gras */
        drawTool.setCurrentColor(new Color(19, 133, 16));
        drawTool.drawFilledEllipticArc(-170,450,600,300,0, 180, 2);
        drawTool.drawFilledEllipticArc(130,450,600,300,0, 180, 2);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}