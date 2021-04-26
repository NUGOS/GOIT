package ua.goit.modul.modul7.graphicsEditor;

import ua.goit.modul.modul7.graphicsEditor.Shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape line = new Line();
        Shape oval = new Oval();
        Shape point = new Point();
        Shape quad = new Quad();

        System.out.println(circle.getShapeName());
        System.out.println(line.getShapeName());
        System.out.println(oval.getShapeName());
        System.out.println(point.getShapeName());
        System.out.println(quad.getShapeName());

    }
}
