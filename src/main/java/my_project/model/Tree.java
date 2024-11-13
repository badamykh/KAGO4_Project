package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {
    public Tree(){
        // Hier passiert momentan nichts
    }

    @Override
    public void draw(DrawTool drawTool) {
        /** Gras */
        drawTool.setCurrentColor(new Color(19, 133, 16));
        drawTool.drawFilledEllipticArc(-170,450,600,300,0, 180, 2);
        drawTool.drawFilledEllipticArc(130,450,600,300,0, 180, 2);
        /** Baum */
        drawTool.setCurrentColor(new Color(58,28,28));
        drawTool.drawFilledRectangle(460, 390, 20, 100);
        /** Baumkrone */
        drawTool.setCurrentColor(new Color(247, 145, 35));
        drawTool.drawFilledEllipticArc(410,360,120,70,0, 360, 2);
        drawTool.drawFilledEllipticArc(425,330,90,53,0, 360, 2);
        drawTool.drawFilledEllipticArc(440,305,60,35,0, 360, 2);
        drawTool.drawFilledCircle(470, 300, 15);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawEllipticArc(410,360,120,70,48, -276, 0);
        drawTool.drawEllipticArc(425,330,90,53,60, -300, 0);
        drawTool.drawEllipticArc(440,305,60,35,65, -310, 0);
        drawTool.drawCircle(470, 300, 15);

    }

    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}