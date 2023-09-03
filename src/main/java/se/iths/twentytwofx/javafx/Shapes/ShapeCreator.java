package se.iths.twentytwofx.javafx.Shapes;

public class ShapeCreator {

    public static Object createShape;

    public static Shape createShape(ShapeType shapeType, ShapeParameters shapeParameters){
        return switch (shapeType) {
            case CIRCLE -> new CircleShape(shapeParameters);
            case  SQUARE -> new SquareShape(shapeParameters);
        };
    }
}
