package se.iths.twentytwofx.javafx;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import se.iths.twentytwofx.javafx.Shapes.PointCoordinates;
import se.iths.twentytwofx.javafx.Shapes.Shape;
import se.iths.twentytwofx.javafx.Shapes.ShapeType;


import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;

import static javafx.collections.FXCollections.observableArrayList;

public class PaintModel {
// toppen av ett isberg: under kan vi ha hur många klasser som helst.
    //men denna är det som kommunicerar med controllern?
    //men kan också ha flera models

    private final ObservableList<Shape> shapeList;
    private final ObservableList<ShapeType> shapeTypeList;
    private final ObjectProperty<ShapeType> currentShapeType;
    private final ObjectProperty<Color> color;
    private final StringProperty size;


    public PaintModel(){
        shapeList = observableArrayList();
        shapeTypeList = FXCollections.observableList(observableArrayList(ShapeType.values()));
        currentShapeType = new SimpleObjectProperty<>(ShapeType.CIRCLE);
        color = new SimpleObjectProperty<>(Color.BLACK);
        size = new SimpleStringProperty("25");

    }

    public void setCurrentShapeType(ShapeType currentShapeType) {
        this.currentShapeType.set(currentShapeType);
    }

    public ObservableList<Shape> getShapeList() {
        return shapeList;
    }

    public ObservableList<ShapeType> getShapeTypeList() {
        return shapeTypeList;
    }

    public ShapeType getCurrentShapeType() {
        return currentShapeType.get();
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

    public void setColor(Color color) {
        this.color.set(color);
    }


    public double getSize() {
        return Double.parseDouble(size.get());
    }

    public StringProperty sizeProperty() {
        return size;
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    private PointCoordinates pointCoordinates;













    Deque<Command> undoStack = new ArrayDeque<>();
    @FunctionalInterface
    interface Command{
        void execute();
    }



    public void saveToFile(Path filePath){
//        StringBuffer output = new StringBuffer();
//        for (ShapeCreator s : shapeObservableList) {
//            output.append(s.getShape)
//        Todo: kommer ev ändras pga svg och har inget att skriva här just nu
        // also har bara skrivit grejer här i cuz
//        }

    }

}
