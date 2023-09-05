package se.iths.twentytwofx.javafx;

import javafx.scene.canvas.GraphicsContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import se.iths.twentytwofx.javafx.Shapes.Shape;

import static org.junit.jupiter.api.Assertions.*;

class PaintModelTest {

    PaintModel paintModel;
    GraphicsContext graphicsContext;
    PaintController paintController;

    @BeforeAll
    void setUp(){
    }

    @Test
    void testThatShapeToEditReturnsNull(){
        Shape expected = null;
        //Shape accurate = paintController.selectShapeToEdit();
    }
    @Test
    void ifPressingOutsideOfShapeInsideShapeShouldFail(){
        //given pressing outside
        //then inside method fail
    }

    @Test
    void ifPressingInsideOfShapeShouldReturnShape(){
        //
    }

    @Test
    void makeUndoFail(){
        // System.out.println("Undo Stack Size: " + undoStack.size());
        //kan jag göra test här?
        //var expected = paintModel.getUndoStack();?
        //assertEquals(exp, act);

        //kolla att add to stack funkar printsaken
    }

}