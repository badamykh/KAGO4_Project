package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert eine Sonne. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class Sun extends GraphicalObject {
    public Sun(){
        // Hier passiert momentan nichts
    }

    /**
     * Diese Methode zeichnet den die optische Repräsentation eines Sun-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /** Himmel */
        drawTool.setCurrentColor(new Color(135,206,235));
        drawTool.drawFilledRectangle(0,0,600,600);
        /** Sonne */
        drawTool.setCurrentColor(new Color(255, 221, 33));
        drawTool.drawFilledCircle(25,25, 60);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
