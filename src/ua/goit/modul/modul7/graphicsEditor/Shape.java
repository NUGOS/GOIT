package ua.goit.modul.modul7.graphicsEditor;

public class Shape implements ShapeName {
    public void print(Shape shape) {
        System.out.println( shape.getShapeName() );
    }

    @Override
    public String getShapeName() {
        return "Shape";
    }
}
