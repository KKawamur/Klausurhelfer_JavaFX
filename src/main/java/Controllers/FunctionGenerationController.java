package Controllers;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class FunctionGenerationController {
    private ListView<String> funktionSelectionList;
    private Button funktionAddButton;

    public FunctionGenerationController(ListView<String> funktionSelectionList, Button funktionAddButton){
        this.funktionSelectionList = funktionSelectionList;
        this.funktionAddButton = funktionAddButton;
    }

    public void initializeFunktionList(){
        String[] funktionTypes = {
                "Lineare Funktionen",
                "Quadratische Funktionen",
                "Exponentialfunktionen",
                "Ganzrationale Funktionen"
        };

        funktionSelectionList.getItems().addAll(funktionTypes);
    }

}
