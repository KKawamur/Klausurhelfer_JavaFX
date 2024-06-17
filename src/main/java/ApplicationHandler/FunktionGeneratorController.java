package ApplicationHandler;

import Controllers.CanvasController;
import Controllers.FunctionGenerationController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.transform.Affine;

import java.net.URL;
import java.util.ResourceBundle;

public class FunktionGeneratorController implements Initializable {

    @FXML
    private ListView<String> funktionSelectionList;
    @FXML
    private Canvas viewCanvas;
    @FXML
    private Button funktionAddButton;
    CanvasController canvasController;
    FunctionGenerationController functionGenerationController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        canvasController = new CanvasController(viewCanvas, 10);
        functionGenerationController = new FunctionGenerationController(funktionSelectionList,funktionAddButton);
        functionGenerationController.initializeFunktionList();
        canvasController.drawCanvas();
    }

    private void addFunktionToHolder(){}
}