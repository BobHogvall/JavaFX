package se.iths.twentytwofx.javafx;

import javafx.event.ActionEvent;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class PaintController {

    //Controller tar emot händelser och skickar vidare vad som hänt till modellen
    //todo: listener/observable med Boolean/StringProperty för att registera förändringar

    public MenuItem exit;
    public MenuItem save;
    public Button circle;
    public Button rectangle;
    public ColorPicker colorPicker;
    public Button undo;
    public Button redo;
    public Canvas canvas;
    public Button colorChanger;
    public Button sizeChanger;
    public TextField sizePicker;

    public Stage stage;
    public GraphicsContext graphicsContext;

    PaintModel paintModel = new PaintModel();

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void initialize(){
        graphicsContext = canvas.getGraphicsContext2D();
    }

    public void actionExit(ActionEvent actionEvent) {
    }

    public void onSave(ActionEvent actionEvent) {
    }

    public void circleAction(ActionEvent actionEvent){
        // todo: metod för att skapa cirkel
    }
    public void rectangleAction(ActionEvent actionEvent){
        // todo: metod för att skapa rektangel
    }
    public void colorPickerAction(){
        //har ingen action i view
        // todo: metod för att ändra färg
    }
    public void colorChangerAction(ActionEvent actionEvent) {
        //todo: metod för att välja ändrad färg?
    }
    public void sizeChangerAction(ActionEvent actionEvent) {
        //todo: change size
    }
    public void undoAction(ActionEvent actionEvent){
        //todo: metod för att radera föregående, ev flera
    }
    public void redoAction(ActionEvent actionEvent){
        //todo: metod för att gå tillbaka, ev flera
    }
    public void saveAction(ActionEvent actionEvent){
        //todo: metod för att spara
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save as");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().clear();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV","*.csv"));

        File file = fileChooser.showOpenDialog(stage);
        if (file != null)
            paintModel.saveToFile(file);
    }

    public void canvasAction(MouseEvent mouseEvent) {
        //todo: metod för att rita på canvas
        // if  shape exist do x
        // else if  create new shape

        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
    }

}

