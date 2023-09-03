package se.iths.twentytwofx.javafx.Shapes;

public class ShapeCreator {

    public Shape createShape (ShapeType shapeType){
        return switch (shapeType) {
            case CIRCLE -> new CircleShape();
            case  RECTANGLE -> new SquareShape();
        };
    }
}
