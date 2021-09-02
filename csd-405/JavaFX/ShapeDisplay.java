// Katie Klein
// CSD 405
// 28 July 2021
// Assignment 11: Shape Display with JavaFX

/* This program creates a JavaFX GUI which displays a shape.
 * The user selects the kind of shape using radio buttons, and
 * whether or not the shape is filled with a random color using a checkbox.
 */


/* Import statements */

// layout
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

// figures
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;

// controls
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;

// styling
import javafx.scene.paint.Color;



public class ShapeDisplay extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // create BorderPane to hold all content
        BorderPane pane = new BorderPane();

        // create StackPane to hold shape
        StackPane figurePane = new StackPane();
        figurePane.setPadding(new Insets(20, 20, 20, 20)); 
        
        
        /* Figures */
        
        // create Circle
        Circle circle = new Circle(100);
        circle.setStroke(Color.NAVY);
        circle.setFill(Color.TRANSPARENT);

        // create Rectangle
        Rectangle rectangle = new Rectangle(200, 100);
        rectangle.setStroke(Color.NAVY);
        rectangle.setFill(Color.TRANSPARENT);

        // create Ellipse
        Ellipse ellipse = new Ellipse(100, 50);
        ellipse.setStroke(Color.NAVY);
        ellipse.setFill(Color.TRANSPARENT);


        /* Radio buttons */

        // create a set of radio buttons
        RadioButton rbCircle = new RadioButton("Circle");
        rbCircle.setSelected(true); // circle is selected by default
        figurePane.getChildren().add(circle); // circle is displayed by default
        RadioButton rbRectangle = new RadioButton("Rectangle");
        RadioButton rbEllipse = new RadioButton("Ellipse");

        // add radio buttons to a toggle group
        ToggleGroup group = new ToggleGroup();
        rbCircle.setToggleGroup(group);
        rbRectangle.setToggleGroup(group);
        rbEllipse.setToggleGroup(group);

        // register event handlers
        rbCircle.setOnAction(e -> {
            if (rbCircle.isSelected()) {
                figurePane.getChildren().clear();
                figurePane.getChildren().add(circle);
            }
        });

        rbRectangle.setOnAction(e -> {
            if (rbRectangle.isSelected()) {
                figurePane.getChildren().clear();
                figurePane.getChildren().add(rectangle);
            }
        });

        rbEllipse.setOnAction(e -> {
            if (rbEllipse.isSelected()) {
                figurePane.getChildren().clear();
                figurePane.getChildren().add(ellipse);
            }
        });


        /* Checkbox */
        
        // create a checkbox
        CheckBox cbColor = new CheckBox("Fill shape");

        // register event handler
        cbColor.setOnAction(e -> {
            if (cbColor.isSelected()) {
                circle.setFill(Color.color(Math.random(), Math.random(), Math.random())); // fill shapes with random RGB color
                rectangle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                ellipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            }
            else {
                circle.setFill(Color.TRANSPARENT); // if unchecked, make transparent
                rectangle.setFill(Color.TRANSPARENT);
                ellipse.setFill(Color.TRANSPARENT);
            }
        });


        /* Panes */
        
        // create HBox to hold all controls (radio buttons and checkbox)
        HBox controlPane = new HBox(30);
        controlPane.setAlignment(Pos.CENTER);
        controlPane.setPadding(new Insets(30, 30, 30, 30));

        // create HBox to hold radio buttons
        HBox radioHbox = new HBox(10);
        radioHbox.getChildren().addAll(rbCircle, rbRectangle, rbEllipse);

        // create VBox to hold shape-select radio buttons and text
        VBox shapeSelectPane = new VBox(10);
        shapeSelectPane.setPadding(new Insets(15, 15, 15, 15));
        shapeSelectPane.setStyle("-fx-border-width: 1px; -fx-border-color: navy");
        shapeSelectPane.getChildren().addAll(new Text("Select a shape to display:"), radioHbox); // add text and radio buttons to pane

        // create VBox to hold color select checkbox with text
        VBox colorSelectPane = new VBox(10);
        colorSelectPane.setPadding(new Insets(15, 15, 15, 15));
        colorSelectPane.getChildren().addAll(new Text("Select styling:"), cbColor);
        colorSelectPane.setStyle("-fx-border-width: 1px; -fx-border-color: navy");

        // place controls in single pane
        controlPane.getChildren().addAll(shapeSelectPane, colorSelectPane);

        // place figure and control panes in main pane
        pane.setCenter(figurePane);
        pane.setBottom(controlPane);


        /* Set scene and stage */
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("Shape Display with JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /* main method to launch in IDE */
    public static void main(String[] args) {
        launch(args);
    }
}
