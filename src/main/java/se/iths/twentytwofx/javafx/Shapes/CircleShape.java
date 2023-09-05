package se.iths.twentytwofx.javafx.Shapes;

import javafx.scene.canvas.GraphicsContext;

public class CircleShape extends Shape {

    double radius = getSize()/2;

    public CircleShape(ShapeParameters shapeParameters) {
        super(shapeParameters);
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(getColor());
        context.fillOval(getxCoordinate() - radius, getyCoordinate() - radius, getSize(), getSize());
    }

    @Override
    public boolean isPointInsideShapeArea(double xSelectShape, double ySelectShape) {
        double distance = Math.sqrt(Math.pow(xSelectShape - getxCoordinate(), 2) + Math.pow(ySelectShape - getyCoordinate(), 2));
        return distance <= radius;
    }

    @Override
    public String svgFormat() {
        return "<circle cx=\"" + getxCoordinate() + "\" cy=\"" + getyCoordinate() + "\" r=\"" + (getSize() / 2) +
                "\" fill=\"#" + getColor().toString().substring(2,10) + "\" />";
    }
}

