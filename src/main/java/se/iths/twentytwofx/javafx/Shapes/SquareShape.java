package se.iths.twentytwofx.javafx.Shapes;

import javafx.scene.canvas.GraphicsContext;

public class SquareShape extends Shape {



    public SquareShape(ShapeParameters shapeParameters) {
        super(shapeParameters);
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(getColor());
        context.fillRect(getxCoordinate(), getyCoordinate(), getSize(), getSize());
    }
}

