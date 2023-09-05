package se.iths.twentytwofx.javafx.Shapes;

import javafx.scene.canvas.GraphicsContext;

public class SquareShape extends Shape {

    double halfSide = getSize() / 2.0;
    double minX = getxCoordinate() - halfSide;
    double maxX = getxCoordinate() + halfSide;
    double minY = getyCoordinate() - halfSide;
    double maxY = getyCoordinate() + halfSide;

    public SquareShape(ShapeParameters shapeParameters) {
        super(shapeParameters);
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(getColor());
        context.fillRect(getxCoordinate(), getyCoordinate(), getSize(), getSize());
    }

    @Override
    public boolean isPointInsideShapeArea(double xSelectShape, double ySelectShape) {
        return xSelectShape >= minX && xSelectShape <= maxX &&
                ySelectShape >= minY && ySelectShape <= maxY;

    }

    @Override
    public String svgFormat() {
        return "<rect x=\"" + getxCoordinate() + "\" y=\"" + getyCoordinate() + "\" width=\"" + getSize() +
                "\" height=\"" + getSize() + "\" fill=\"#" + getColor().toString().substring(2, 10) + "\" />";
    }
}

