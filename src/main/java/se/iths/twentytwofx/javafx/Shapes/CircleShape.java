package se.iths.twentytwofx.javafx.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CircleShape extends Shape {

    double radius = getSize()/2;

    public CircleShape(ShapeParameters shapeParameters) {
        super(shapeParameters);
    }

    @Override
    public void draw(GraphicsContext context) {

    }

    //Todo: add circle info?
}






//    public CircleShape(double x, double y) {
//        super(x, y);
//    }
