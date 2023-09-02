package se.iths.twentytwofx.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import se.iths.twentytwofx.javafx.Shapes.PointCoordinates;

import java.io.File;

public class PaintModel {
// toppen av ett isberg: under kan vi ha hur många klasser som helst.
    //men denna är det som kommunicerar med controllern?
    //men kan också ha flera models
    private PointCoordinates pointCoordinates;


    StringProperty sizePicker = new SimpleStringProperty();


    public void saveToFile(File file){

    }

}
