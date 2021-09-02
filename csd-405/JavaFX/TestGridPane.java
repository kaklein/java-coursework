/* Katie Klein
 * CSD 405
 * Assignment 7
 * GridPane example
 */ 


/* This program demonstrates use of a JavaFX GridPane by creating
a simple form organized in a grid. */

// import statements
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class TestGridPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create GridPane instance
        GridPane gridPane = new GridPane();

        // set gridPane properties
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(15); // vgap and hgap create space between grid cells
        gridPane.setHgap(15);

        // create text nodes and add to gridPane
        Text text1 = new Text("First Name:");
        text1.setFill(Color.NAVY);
        gridPane.add(text1, 0, 0); // added to column 0, row 0

        Text text2 = new Text("Last Name:");
        text2.setFill(Color.NAVY);
        gridPane.add(text2, 0, 1); // added to column 0, row 1

        // create text field nodes and add to gridPane
        TextField textField1 = new TextField();
        gridPane.add(textField1, 1, 0); // added to column 1, row 0

        TextField textField2 = new TextField();
        gridPane.add(textField2, 1, 1); // added to column 1, row 1

        // create button node and add to gridPane
        Button button1 = new Button("Submit");
        button1.setStyle("-fx-border-color: NAVY; -fx-background-color: AZURE");
        gridPane.add(button1, 1, 2); // added to column 1, row 2
        GridPane.setHalignment(button1, HPos.RIGHT);

        // place gridPane in scene
        Scene scene = new Scene(gridPane);

        // place scene on stage and display
        primaryStage.setTitle("Test GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
