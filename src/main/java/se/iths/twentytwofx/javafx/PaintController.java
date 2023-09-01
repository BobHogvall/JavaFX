package se.iths.twentytwofx.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;

public class PaintController {

    PaintModel paintModel = new PaintModel();
    @FXML
    private Label welcomeText;

    public MenuBar menuBar;
    public Button circle;
    public Button rectangle;
    public ColorPicker colorPicker;
    public Button undo;
    public Button redo;
    public Button save;
    public Canvas canvas;

    public GraphicsContext graphicsContext;

    public void initialize(){
        graphicsContext = canvas.getGraphicsContext2D();
    }

    public void menuBarAction(){
        //todo: vilka actions ska finnas här, ska vi ens använda den?
        //todo: metoder för menuBar + items?
    }
    public void circleAction(ActionEvent actionEvent){
        // todo: metod för att skapa cirkel
    }
    public void rectangleAction(ActionEvent actionEvent){
        // todo: metod för att skapa rektangel
    }
    public void colorPickerAction(){
        // todo: metod för att välja färg
    }
    public void undoAction(ActionEvent actionEvent){
        //todo: metod för att radera föregående, ev flera
    }
    public void redoAction(ActionEvent actionEvent){
        //todo: metod för att gå tillbaka, ev flera
    }
    public void saveAction(ActionEvent actionEvent){
        //todo: metod för att spara
    }

    public void canvasAction(MouseEvent mouseEvent) {
        //todo: metod för att rita på canvas

        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}

