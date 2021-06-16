package ua.goit.modul.modul7.graphicsEditor;

import ua.goit.modul.modul7.graphicsEditor.Shapes.*;

public class Main {
    public static void main(String[] args) {
        Quad quad = new Quad();
        Circle circle = new Circle();
        Line line = new Line();
        Oval oval = new Oval();
        Point point = new Point();


        AreaPrinter areaPrinter = new AreaPrinter();
        areaPrinter.printArea( quad );
        areaPrinter.printArea( circle );
        areaPrinter.printArea( line );
        areaPrinter.printArea( oval );
        areaPrinter.printArea( point );

    }

}
