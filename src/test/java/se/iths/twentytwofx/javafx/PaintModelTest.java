package se.iths.twentytwofx.javafx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.iths.twentytwofx.javafx.Shapes.CircleShape;
import se.iths.twentytwofx.javafx.Shapes.Shape;
import se.iths.twentytwofx.javafx.Shapes.ShapeParameters;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PaintModelTest {
    PaintModel paintModel = new PaintModel();
    PaintController paintController = new PaintController();

    @BeforeEach
    void setUp(){
        paintController.canvas = new Canvas();
    }

    Shape createNewShape(){
        return new CircleShape(new ShapeParameters(106.0, 102.0, Color.BLACK, 25.0));
    }

    @Test
    void testThatAddToShapeListMethodWorks(){
        GraphicsContext graphicsContext = paintController.canvas.getGraphicsContext2D();
        paintModel.addShapeToShapeList(createNewShape(), graphicsContext);
        assertEquals(1, paintModel.getShapeList().size());
    }

    @Test
    void testThatUndoMethodWorks(){
        GraphicsContext graphicsContext = paintController.canvas.getGraphicsContext2D();
        paintModel.addShapeToUndoDeque(createNewShape());
        paintModel.addShapeToUndoDeque(createNewShape());
        paintModel.undoShapeFromCanvas(graphicsContext);
        assertEquals(1, paintModel.getUndoStack().size());
    }
}
