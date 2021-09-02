
/* Katie Klein
 * CSD 405
 * 9 July 2021
 * Assignment 8: Random Card Selection (JavaFX Images)
 */

/* This program takes four random images from a deck of cards
   and displays them using JavaFX. */



// import statements
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class RandomCards extends Application {
    @Override
    public void start(Stage primaryStage) {
       
        // create array of card numbers 1-52
        int[] cardNumbers = new int[52];
        for (int i = 0; i < cardNumbers.length; i++) {
            cardNumbers[i] = i + 1;
        }

        // shuffle card numbers
        for (int i = 0; i < cardNumbers.length - 1; i++) {
            // get random index from cardNumbers
            int j = (int)(Math.random() * cardNumbers.length);
            //swap number at random index with current index
            int temp = cardNumbers[i];
            cardNumbers[i] = cardNumbers[j];
            cardNumbers[j] = temp;
        }

        // create Images and ImageViews for first 4 cards in shuffled deck
        ArrayList<ImageView> cardsSelected = new ArrayList<>(); // create empty list of ImageViews
        for(int i = 0; i < 4; i++) {
            Image newImage = new Image("/cards/" + cardNumbers[i] + ".png"); // create Image object from file
            cardsSelected.add(new ImageView(newImage)); // create ImageView object from Image and add to list
        }

        // create pane and add selected cards
        StackPane pane = new StackPane();
        pane.setPadding(new Insets(20));
        pane.getChildren().add(getHBox(cardsSelected)); // call getHBox method with cardsSelected as parameter

        // set pane in scene and scene on stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // method to create HBox and populate with selected ImageViews
    private HBox getHBox(ArrayList<ImageView> cardsSelected) {
        HBox hbox = new HBox(20);
        for(ImageView card : cardsSelected) {
            hbox.getChildren().add(card);
        }
        return hbox;
    }

    // main method to launch in IDE
    public static void main(String[] args) {
        launch(args);
    }
}