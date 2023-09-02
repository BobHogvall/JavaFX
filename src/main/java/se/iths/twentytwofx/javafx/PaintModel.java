package se.iths.twentytwofx.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import se.iths.twentytwofx.javafx.Shapes.PointCoordinates;
import se.iths.twentytwofx.javafx.Shapes.Shape;
import se.iths.twentytwofx.javafx.Shapes.ShapeCreator;
import se.iths.twentytwofx.javafx.Shapes.ShapeType;

import java.io.File;
import java.nio.file.Path;

public class PaintModel {
// toppen av ett isberg: under kan vi ha hur många klasser som helst.
    //men denna är det som kommunicerar med controllern?
    //men kan också ha flera models
    private PointCoordinates pointCoordinates;

    ObservableList<Shape> shapeObservableList = FXCollections.observableArrayList();
    StringProperty sizePicker = new SimpleStringProperty();

    public void createShape(){
        new ShapeCreator().createShape(ShapeType.CIRCLE);
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
