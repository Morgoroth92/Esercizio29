package org.example;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            default:
                throw new IllegalArgumentException("Shape type not supported");
        }
    }
}
