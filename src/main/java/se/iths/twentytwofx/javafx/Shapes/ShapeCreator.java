package se.iths.twentytwofx.javafx.Shapes;

public class ShapeCreator {

    public Shape createShape (ShapeType shapeType, ShapeParameters shapeParameters){
        return switch (shapeType) {
            case CIRCLE -> new CircleShape(shapeParameters);
            case  RECTANGLE -> new SquareShape(shapeParameters);
        };
    }
}
