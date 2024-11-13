package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {

    /**
     * Erzeugt ein neues Objekt der Klasse House
     */
    public House(){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(150,300,200,240);
        /** Tür */
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(225, 440, 50, 100);
        /** Fenster */
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(175, 440, 30, 30);
        drawTool.drawFilledRectangle(295, 440, 30, 30);
        /** Fensterrahmen */
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(175, 440, 30, 30);
        drawTool.drawRectangle(295, 440, 30, 30);
        /** Fensterkreuz */
        drawTool.drawLine(190, 440, 190, 470);
        drawTool.drawLine(175, 455, 205, 455);
        drawTool.drawLine(310, 440, 310, 470);
        drawTool.drawLine(295, 455, 325, 455);
        /** Türknauf */
        drawTool.setCurrentColor(Color.YELLOW);
        drawTool.drawFilledCircle(235, 490, 10);
        /** Schornstein */
        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(300, 200, 40, 100);
        /** Dach */
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledTriangle(115, 315, 385, 315, 250, 225);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawTriangle(115, 315, 385, 315, 250, 225);
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
