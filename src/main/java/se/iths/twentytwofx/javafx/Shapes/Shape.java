package se.iths.twentytwofx.javafx.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {

    private double xCoordinate;
    private double yCoordinate;
    private Color color;
    private double size;

    protected Shape(ShapeParameters shapeParameters) {
        this.xCoordinate = shapeParameters.xCoordinate();
        this.yCoordinate = shapeParameters.yCoordinate();
        this.color = shapeParameters.color();
        this.size = shapeParameters.size();
    }


    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public abstract void draw(GraphicsContext context);

    public abstract boolean isPointInsideShapeArea(double xCoordinate, double yCoordinate);

    public abstract String svgFormat();
}
