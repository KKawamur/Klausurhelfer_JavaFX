package Controllers;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Affine;

public class CanvasController {
    Canvas viewCanvas;
    GraphicsContext gc;
    double halfWindowHeight;
    double halfWindowWidth;
    double coordinateLineLengthFactor = 40;
    int numberOfCoordinateIndices = 2;
    int scale;

    public CanvasController(Canvas viewCanvas, int scale){
        this.viewCanvas = viewCanvas;
        gc = viewCanvas.getGraphicsContext2D();
        this.scale = scale;
    }

    public void drawCanvas(){
        initializeCanvas();
        updateHalfHeightAndWidth();
    }

    public void initializeCanvas(){
        updateHalfHeightAndWidth();
        gc.setFill(Color.BLACK);
        gc.fillRect(0.0,0.0, viewCanvas.getWidth(), viewCanvas.getHeight());
        setOrigin(halfWindowWidth, halfWindowHeight);
        gc.setTextAlign(TextAlignment.CENTER);
        drawCartesianAxis();
        drawCoordinateLinesAndIndices();
    }

    private void setOrigin(double x, double y){
        GraphicsContext gc = viewCanvas.getGraphicsContext2D();
        Affine affine = new Affine();
        affine.appendTranslation(x,y);
        gc.setTransform(affine);
    }

    private void updateHalfHeightAndWidth(){
        halfWindowHeight = viewCanvas.getHeight()/2;
        halfWindowWidth = viewCanvas.getWidth()/2;
    }

    private void drawCartesianAxis(){
        gc.setLineWidth(1);
        gc.setStroke(Color.WHITE);
        //x-axis
        gc.strokeLine(-halfWindowHeight,0.0, halfWindowHeight,0.0);
        //y-axis
        gc.strokeLine(0.0, -halfWindowHeight,0.0, halfWindowHeight);
    }

    private void drawCoordinateLinesAndIndices(){
        double coordinateLineLength = halfWindowHeight/coordinateLineLengthFactor;
        double indexCounter= 1;
        for (int i = 0; i < halfWindowHeight; i+=(int)halfWindowHeight/(scale)){
            gc.strokeLine(i,    0,          i,          coordinateLineLength);    //positive x-axis lines
            gc.strokeLine(0,    -i, -coordinateLineLength,      -i);               //positive y-axis lines
            gc.strokeLine(-i,   0,          -i,         coordinateLineLength);    //positive x-axis lines
            gc.strokeLine(0,    i,  -coordinateLineLength,      i);                //positive y-axis lines

            if(i == halfWindowHeight/numberOfCoordinateIndices*indexCounter){
                gc.strokeText(String.valueOf((double) scale/numberOfCoordinateIndices*indexCounter), i, 0.0); // positive x-axis indices
                gc.strokeText(String.valueOf((double) scale/numberOfCoordinateIndices*indexCounter), 0.0, -i); // positive y-axis indices
                gc.strokeText(String.valueOf((double) scale/numberOfCoordinateIndices*indexCounter), -i, 0.0); // negative x-axis indices
                gc.strokeText(String.valueOf((double) scale/numberOfCoordinateIndices*indexCounter), 0.0, i); // negative y-axis indices

                indexCounter++;
            }
        }
    }
}
