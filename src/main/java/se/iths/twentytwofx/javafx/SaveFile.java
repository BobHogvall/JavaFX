package se.iths.twentytwofx.javafx;

import javafx.stage.FileChooser;

import javafx.stage.Stage;
import se.iths.twentytwofx.javafx.Shapes.Shape;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SaveFile {
    private static final double SVG_WIDTH = 600.0;
    private static final double SVG_HEIGHT = 600.0;
    private final FileChooser fileChooser;

    public SaveFile() {
        fileChooser = createFileChooser();
    }

    private FileChooser createFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save as");
        fileChooser.getExtensionFilters().clear();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("SVG", "*.svg"));
        return fileChooser;
    }

    public void save(PaintModel paintModel, Stage stage, File file) {
        Path path = getPath(stage);
        if (path != null) {
            setSVGtoPath(paintModel, path);
        }
    }

    private Path getPath(Stage stage) {
        File file = fileChooser.showSaveDialog(stage);
        return file != null ? file.toPath() : null;
    }

    private void setSVGtoPath(PaintModel paintModel, Path path) {
        try {
            List<String> svg = new ArrayList<>();
            addSvgToShape(svg, paintModel);
            Files.write(path, svg);
        } catch (IOException e) {
            System.err.println("Error while saving SVG: " + e.getMessage());
        }
    }

    private void addSvgToShape(List<String> svg, PaintModel paintModel) {
        svg.add("<svg width=\"" + SVG_WIDTH + "\" height=\"" + SVG_HEIGHT + "\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">");
        for (Shape shape : paintModel.getShapeList()) {
            svg.add(shape.svgFormat());
        }
        svg.add("</svg>");
    }

}
