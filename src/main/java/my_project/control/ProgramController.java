package my_project.control;

import KAGO_framework.control.ViewController;

import my_project.model.*;


/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern.
 * Hinweise:
 * - Der Konstruktor sollte nicht geändert werden.
 * - Sowohl die startProgram()- als auch die updateProgram(...)-Methoden müssen vorhanden sein und ihre Signatur sollte
 *   nicht geändert werden
 * - Zusätzliche Methoden sind natürlich gar kein Problem
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private final ViewController viewController;// diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    private House firstHouse;// deklariert eine Referenz für ein Objekt der Klasse House
    private House secondHouse;
    private House thirdHouse;

    private Fence firstFence;
    private Fence secondFence;
    private Fence thirdFence;

    private Cloud firstCloud;
    private Cloud secondCloud;

    private Tree firstTree;
    private Tree secondTree;

    private Sun firstSun;
    private Grass firstGrass;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen. Hier sollte also alles geregelt werden,
     * was zu diesem Zeipunkt passieren muss.
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klassen und initialisiere damit die Referenz first, second ...
        firstHouse = new House(30, 400, 0.5);
        firstFence = new Fence(7.5, 455, 0.5);

        secondHouse = new House(440, 429, 0.2);
        secondFence = new Fence(431, 454, 0.2);

        thirdHouse = new House(200, 400,1);
        thirdFence = new Fence(155, 505, 1);

        firstCloud = new Cloud(430, 70, 0.5);
        secondCloud = new Cloud(70, 200, 1);

        firstTree = new Tree(475, 390, 0.9);
        secondTree = new Tree(165, 425, 0.2);

        firstSun = new Sun();
        firstGrass = new Grass();

        // Teile dem ViewController-Objekt mit, dass die Objekte gezeichnet werden sollen
        viewController.draw(firstSun);

        viewController.draw(secondHouse);

        viewController.draw(firstGrass);

        viewController.draw(firstCloud);
        viewController.draw(secondCloud);

        viewController.draw(firstHouse);
        viewController.draw(firstFence);

        viewController.draw(thirdHouse);
        viewController.draw(thirdFence);

        viewController.draw(firstTree);
        viewController.draw(secondTree);
    }

    /**
     * Diese Methode wird vom ViewController-Objekt automatisch mit jedem Frame aufgerufen (ca. 60mal pro Sekunde)
     * @param dt Zeit seit letztem Frame in Sekunden
     */
    public void updateProgram(double dt){

    }
}
