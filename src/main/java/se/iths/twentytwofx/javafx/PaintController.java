package se.iths.twentytwofx.javafx;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import se.iths.twentytwofx.javafx.Shapes.Shape;
import se.iths.twentytwofx.javafx.Shapes.ShapeCreator;
import se.iths.twentytwofx.javafx.Shapes.ShapeType;

import java.io.File;

public class PaintController {
    PaintModel paintModel = new PaintModel();

    public MenuItem exit;
    public MenuItem save;
    public ChoiceBox<ShapeType> choiceBox;
    public ColorPicker colorPicker;
    public Button undo;
    public Button colorChanger;
    public Button sizeChanger;
    public TextField sizePicker;
    //selector
    public Canvas canvas;
    public Stage stage;
    public GraphicsContext graphicsContext;


    public void initialize(){
        graphicsContext = canvas.getGraphicsContext2D();
        choiceBox.setItems(paintModel.getShapeTypeList());
        choiceBox.valueProperty().bindBidirectional(paintModel.currentShapeTypeProperty());
        colorPicker.valueProperty().bindBidirectional(paintModel.colorProperty());
        sizePicker.textProperty().bindBidirectional(paintModel.sizeProperty());
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void canvasAction(MouseEvent mouseEvent) {
        Shape shape = ShapeCreator.createShape(choiceBox.getValue(), mouseEvent.getX(), mouseEvent.getY());
        System.out.println(shape);
        // , ShapeParameters shapeParameters, ShapeType type
        // får inte ha mer än en inparameter här
        //todo: metod för att rita på canvas
        // if  shape exists do x
        // else if  create new shape

        // double whereTheyClickedXCoordinate = mouseEvent.getX();
        // double whereTheyClickedYCoordinate = mouseEvent.getY();
        //should information be added to shapeParameters?
        //da fuck ska jag göra med dessa?
        //todo: metod för att lägga in i undo-lista för att sedan kunna radera
        //todo: något behöver kollas annars:
        //  ShapeCreator.createShape(ShapeType.CIRCLE, shapeParameters);
    }

    // if they press circle ShapeType=Circle
    // bring: color, size and where they press to get the right shape
    // So, to ShapeParameters: send "color, size, x, y".
    // then bring: type and Parameters to -> createShape


    public void actionExit(ActionEvent actionEvent) {
        Platform.exit();
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

}

