package se.iths.twentytwofx.javafx;

import javafx.event.ActionEvent;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import se.iths.twentytwofx.javafx.Shapes.ShapeCreator;
import se.iths.twentytwofx.javafx.Shapes.ShapeParameters;
import se.iths.twentytwofx.javafx.Shapes.ShapeType;

import java.io.File;
import java.nio.file.Path;

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

        File filePath = fileChooser.showSaveDialog(stage);
        if (filePath != null)
            paintModel.saveToFile(filePath.toPath());
    }

    public void canvasAction(MouseEvent mouseEvent, ShapeParameters shapeParameters, ShapeType type) {
        //todo: metod för att rita på canvas
        // if  shape exists do x
        // else if  create new shape

        double whereTheyClickedXCoordinate = mouseEvent.getX();
        double whereTheyClickedYCoordinate = mouseEvent.getY();
        //should information be added to shapeParameters?
        //da fuck ska jag göra med dessa?
        //todo: metod för att lägga in i undo-lista för att sedan kunna radera
        //todo: något behöver kollas annars:
        ShapeCreator.createShape(type, shapeParameters);
    }

    // if they press circle ShapeType=Circle
    // bring: color, size and where they press to get the right shape
    // So, to ShapeParameters: send "color, size, x, y".
    // then bring: type and Parameters to -> createShape

}

