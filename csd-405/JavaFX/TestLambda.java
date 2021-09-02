/*
 * Katie Klein
 * CSD 405
 * 13 July 2021
 * Assignment 9
 * Lambda Expressions
 */

 /* This program demonstrates the use of a lambda expression to handle JavaFX event. */

 // import statements
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TestLambda extends Application {
   @Override
   public void start(Stage primaryStage) {

       //create Button node and set properties
       Button myButton = new Button("My Button");
       myButton.setStyle("-fx-border-color: LIMEGREEN; -fx-background-color: GREEN; -fx-text-fill: WHITE");
       StackPane pane = new StackPane(myButton); // place button in pane

       /* Handler for button ActionEvent using lambda expression */
       //   Variable e (below) is inferred to be an instance of an ActionEvent,
       //   which is the parameter of the one method found within an EventHandler<ActionEvent> object,
       //   which is implied because it's required by the setOnAction method.
                                 // the code below states what happens on event execution; no brackets needed because it's a single statement
       myButton.setOnAction(e -> myButton.setStyle("-fx-border-color: GRAY; -fx-background-color: GRAY"));

       //display scene/stage
       Scene scene = new Scene(pane, 400, 200);
       primaryStage.setTitle("Test Lambda Expression");
       primaryStage.setScene(scene);
       primaryStage.show();

   }   


    public static void main(String[] args) {
        launch(args);
    }
}
