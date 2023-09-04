package se.iths.twentytwofx.javafx;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import se.iths.twentytwofx.javafx.Shapes.PointCoordinates;
import se.iths.twentytwofx.javafx.Shapes.Shape;
import se.iths.twentytwofx.javafx.Shapes.ShapeType;


import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;

import static javafx.collections.FXCollections.observableArrayList;

//he Model managing the application's state and data

public class PaintModel {
    private final ObservableList<Shape> shapeList;
    private final ObservableList<ShapeType> shapeTypeList;
    private final ObjectProperty<ShapeType> currentShapeType;
    private final ObjectProperty<Color> color;
    private final StringProperty size;
    private final Deque<Command> undoStack;

    private PointCoordinates pointCoordinates;

    public PaintModel() {
        shapeList = observableArrayList();
        shapeTypeList = FXCollections.observableList(observableArrayList(ShapeType.values()));
        currentShapeType = new SimpleObjectProperty<>(ShapeType.CIRCLE);
        color = new SimpleObjectProperty<>(Color.BLACK);
        size = new SimpleStringProperty("25");
        undoStack = new ArrayDeque<>();
    }

    public ObservableList<Shape> getShapeList() {
        return shapeList;
    }

    public ObservableList<ShapeType> getShapeTypeList() {
        return shapeTypeList;
    }

    public ObjectProperty<ShapeType> currentShapeTypeProperty() {
        return currentShapeType;
    }

    public Color getColor() {
        return color.get();
    }

    public ObjectProperty<Color> colorProperty() {
        return color;
    }

    public double getSize() {
        return Double.parseDouble(size.get());
    }

    public StringProperty sizeProperty() {
        return size;
    }

    public Deque<Command> getUndoStack() {
        return undoStack;
    }



    void addShapeToShapeList(Shape shape, GraphicsContext graphicsContext) {
        getShapeList().add(shape);
        drawShapeOnCanvas(graphicsContext);
        addShapeToUndoDeque(shape);
    }

    void drawShapeOnCanvas( GraphicsContext graphicsContext){
        graphicsContext.clearRect(0,0,graphicsContext.getCanvas().getWidth(), graphicsContext.getCanvas().getHeight());
        for (Shape s: getShapeList()) {
            s.draw(graphicsContext);
        }
    }

    void addShapeToUndoDeque(Shape shape) {
        Command undo = () -> getShapeList().remove(shape);
        undoStack.push(undo);
    }

    public void undoShapeFromCanvas(GraphicsContext graphicsContext) {
        if (!undoStack.isEmpty()) {
            Command undoCommand = undoStack.pop();
            undoCommand.execute();
            drawShapeOnCanvas(graphicsContext);
        }
    }











    public void saveToFile(Path filePath) {
//        StringBuffer output = new StringBuffer();
//        for (ShapeCreator s : shapeObservableList) {
//            output.append(s.getShape)
//        Todo: kommer ev ändras pga svg och har inget att skriva här just nu
        // also har bara skrivit grejer här i cuz
//        }

    }


    @FunctionalInterface
    interface Command {
        void execute();
    }

}
