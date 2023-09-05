package se.iths.twentytwofx.javafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import se.iths.twentytwofx.javafx.Shapes.Shape;
import se.iths.twentytwofx.javafx.Shapes.ShapeCreator;
import se.iths.twentytwofx.javafx.Shapes.ShapeParameters;
import se.iths.twentytwofx.javafx.Shapes.ShapeType;

import java.io.File;


// the Controller handles user interaction
public class PaintController {
    public MenuItem exit;
    public MenuItem save;
    public ChoiceBox<ShapeType> choiceBox;
    public ColorPicker colorPicker;
    public Button undo;
    public TextField sizePicker;
    public CheckBox selectMode;
    public Canvas canvas;
    public Stage stage;
    public GraphicsContext graphicsContext;

    PaintModel paintModel = new PaintModel();


    public void initialize() {
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
        if (selectMode.isSelected()) {
            selectShapeToEdit(paintModel.isPointInsideShapeArea(mouseEvent.getX(), mouseEvent.getY()), mouseEvent, graphicsContext);
        } else
            drawNewShape(mouseEvent);
    }

    public void selectShapeToEdit(Shape shape, MouseEvent mouseEvent, GraphicsContext graphicsContext) {
        if (shape != null) {
            paintModel.editShapeOnCanvas(shape, graphicsContext, this);
        } else
            drawNewShape(mouseEvent);

    }

    private void drawNewShape(MouseEvent mouseEvent) {
        ShapeParameters shapeParameters = new ShapeParameters(mouseEvent.getX(), mouseEvent.getY(), paintModel.getColor(), paintModel.getSize());
        Shape shape = ShapeCreator.createShape(choiceBox.getValue(), shapeParameters);
        paintModel.addShapeToShapeList(shape, graphicsContext);
    }

    public void undoAction(ActionEvent actionEvent) {
        paintModel.undoShapeFromCanvas(graphicsContext);
    }


    public void saveAction(ActionEvent actionEvent) {
        //todo: metod för att spara
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save as");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().clear();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV", "*.csv"));

        File filePath = fileChooser.showSaveDialog(stage);
        if (filePath != null)
            paintModel.saveToFile(filePath.toPath());
    }

    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

}

