
/* Katie Klein
 * CSD 405
 * 21 July 2021
 * Assignment 10: Random Card Selection + Refresh
 */

/* This program takes four random images from a deck of cards
   and displays them using JavaFX. It also has a Refresh button
   which, when pressed, displays four new random cards. */


// import statements
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class RandomCardsRefresh extends Application {
    // create border pane
    private BorderPane borderPane = new BorderPane();

    // get initial random cards to be displayed
    private int[] cardNumbers = shuffleDeck(); // create array of shuffled card numbers
    private ArrayList<ImageView> cardsSelected = getCardImages(cardNumbers); // get images of the first 4 cards
    
    @Override
    public void start(Stage primaryStage) {
       
        // create Refresh button
        Button btRefresh = new Button("Refresh");
        btRefresh.setStyle("-fx-border-color: red");
        btRefresh.setOnAction(new RefreshHandler()); // register handler to refresh button
        StackPane stackPane = new StackPane(btRefresh); // place in stack pane
        stackPane.setPadding(new Insets (30,30, 30, 30));

        // add contents to border pane
        borderPane.setPadding(new Insets(15, 15, 15, 15));
        borderPane.setTop(getHBox(cardsSelected)); // add Hbox containing card images to top of border pane
        borderPane.setCenter(stackPane); // add stack pane containing refresh button to center of border pane

        // set pane in scene and scene on stage
        Scene scene = new Scene(borderPane, 430, 190);
        primaryStage.setTitle("Random Cards Refresh");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /* handler class for refresh button */
    class RefreshHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            cardNumbers = shuffleDeck(); // reshuffle deck
            cardsSelected = getCardImages(cardNumbers); // get new first 4 images
 
            // place new images in Hbox
            borderPane.setTop(getHBox(cardsSelected));
        }
    }

    /* method to create shuffled deck of cards */
    private int[] shuffleDeck() { 
        
        // create deck of cards numbered 1-52
        int[] cardNumbers = new int[52];
        for (int i = 0; i < cardNumbers.length; i++) {
            cardNumbers[i] = i + 1;
        }
        
        // shuffle deck
        for (int i = 0; i < cardNumbers.length - 1; i++) {
            // get random index from cardNumbers
            int j = (int)(Math.random() * cardNumbers.length);
            //swap number at random index with current index
            int temp = cardNumbers[i];
            cardNumbers[i] = cardNumbers[j];
            cardNumbers[j] = temp;
        }

        return cardNumbers;
    }

    /* method to create Images and ImageViews from first 4 cards in shuffled deck */
    private ArrayList<ImageView> getCardImages(int[] cardNumbers) {    
        ArrayList<ImageView> cardsSelected = new ArrayList<>(); // create empty list of ImageViews

        for(int i = 0; i < 4; i++) { // iterate through first 4 cards in shuffled deck
            Image newImage = new Image("/cards/" + cardNumbers[i] + ".png"); // create Image object from file
            cardsSelected.add(new ImageView(newImage)); // create ImageView object from Image and add to list
        }

        return cardsSelected;
    }

    /* method to create HBox and populate with selected ImageViews */
    private HBox getHBox(ArrayList<ImageView> cardsSelected) {
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        for(ImageView card : cardsSelected) {
            hbox.getChildren().add(card);
        }
        return hbox;
    }

    /* main method to launch in IDE */
    public static void main(String[] args) {
        launch(args);
    }
}