/* Katie Klein
 * CSD 405
 * Assignment 7
 * ScrollPane example
 */ 

// import statements
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class TestScrollPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create ScrollPane and set properties
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPadding(new Insets(20, 20, 20, 20));
        scrollPane.pannableProperty().set(true); // allows simultaneous x- and y-direction scrolling with mouse click & hold

        // create large circle and add to ScrollPane
        Circle myCircle = new Circle(250, 250, 500);
        myCircle.setFill(Color.ORANGE);
        myCircle.setStroke(Color.YELLOW);
        myCircle.setStrokeWidth(10);
        scrollPane.setContent(myCircle); // syntax for adding content to ScrollPane

        // add pane to scene
        Scene scene = new Scene(scrollPane, 700, 500);

        // add scene to stage and display it
        primaryStage.setTitle("Test ScrollPane");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}