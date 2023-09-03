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
    private final ObjectProperty<Color> color;
    private final ObjectProperty<Double> size;

    public PaintModel(){
        shapeList = observableArrayList();
        shapeTypeList = FXCollections.observableList(observableArrayList(ShapeType.values()));
        color = new SimpleObjectProperty<>(Color.BLACK);
        size = new SimpleObjectProperty<>(25.0);
    }


    private PointCoordinates pointCoordinates;




    StringProperty sizePicker = new SimpleStringProperty();


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
