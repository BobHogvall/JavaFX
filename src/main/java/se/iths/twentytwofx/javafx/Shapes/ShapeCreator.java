package se.iths.twentytwofx.javafx.Shapes;

public class ShapeCreator {

    public static Shape createShape(ShapeType shapeType, double x, double y) {
        return switch (shapeType) {
            case CIRCLE -> new CircleShape(x, y);
            case SQUARE -> new SquareShape(x, y);
        };
    }


//    public static Object createShape;
    //vet inte vad detta är?


//    public static Shape createShape(ShapeType shapeType, ShapeParameters shapeParameters){
//        return switch (shapeType) {
//            case CIRCLE -> new CircleShape(shapeParameters);
//            case  SQUARE -> new SquareShape(shapeParameters);
//        };
//    }
}
