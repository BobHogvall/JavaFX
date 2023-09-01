package se.iths.twentytwofx.javafx;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;

public class PaintController {
    @FXML
    private Label welcomeText;

    public MenuBar menuBar;
    public Button circle;
    public Button Rectangle;
    public ColorPicker colorPicker;
    public Button undo;
    public Button redo;
    public Button save;
    public Canvas canvas;





    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}