package se.iths.twentytwofx.javafx;

import javafx.scene.canvas.GraphicsContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintModelTest {

    PaintModel paintModel;
    GraphicsContext graphicsContext;

    @BeforeAll
    void setUp(){

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

    }

}