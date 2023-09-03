package se.iths.twentytwofx.javafx.Shapes;

//
//public abstract class Shape {
//
//    private final double x;
//    private final double y;
//
//    public Shape(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//}

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {

    // vill lagra var vi har klickat någonstans i ett shape objekt
    private double xCoordinate;
    private double yCoordinate;
    //perhaps pointCoordinates?
    private Color color;
    private double size;

    protected Shape(ShapeParameters shapeParameters) {
        this.xCoordinate = shapeParameters.xCoordinate();
        this.yCoordinate = shapeParameters.yCoordinate();
        this.color = shapeParameters.color();
        this.size = shapeParameters.size();
    }
    //change to parameter class?


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

}
