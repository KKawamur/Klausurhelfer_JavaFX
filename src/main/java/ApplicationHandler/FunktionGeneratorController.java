package ApplicationHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class FunktionGeneratorController implements Initializable {

    @FXML
    private ListView<String> funktionSelectionList;
    @FXML
    private Canvas viewCanvas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeFunktionList();
        initializeCanvas();
    }

    private void initializeFunktionList(){
        String[] funktionTypes = {
                "Lineare Funktionen",
                "Quadratische Funktionen",
                "Exponentialfunktionen",
                "Ganzrationale Funktionen"
        };

        funktionSelectionList.getItems().addAll(funktionTypes);
    }

    private void initializeCanvas(){
        GraphicsContext canvasGraphics = viewCanvas.getGraphicsContext2D();
        canvasGraphics.setFill(Color.BLACK);
        canvasGraphics.fillRect(0.0,0.0, viewCanvas.getWidth(), viewCanvas.getHeight());
    }
}