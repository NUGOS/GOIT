package ua.goit.modul.modul7.graphicsEditor;

import ua.goit.modul.modul7.graphicsEditor.Shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.print( new Circle() );
        shape.print( new Line() );
        shape.print( new Oval() );
        shape.print( new Point() );
        shape.print( new Quad() );
    }
}
