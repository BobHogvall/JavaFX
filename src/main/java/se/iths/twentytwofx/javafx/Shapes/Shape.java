package se.iths.twentytwofx.javafx.Shapes;

import javafx.scene.paint.Color;

public abstract class Shape {

    //Todo: add information to be inherited by the actual shapes

    private double xCoordinate;
    private double yCoordinate;
    //perhaps pointCoordinates?
    private Color color;
    private double size;



    public abstract void draw();

}
