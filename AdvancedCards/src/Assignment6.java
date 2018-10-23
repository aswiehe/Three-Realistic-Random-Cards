// Avery Wiehe

import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Assignment6 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  
	// Declare final variable that represents the number of cards to display at any given time during program
	final int NUMBER_OF_CARDS = 3;
	  
    // Create a pane to hold the image views and set padding
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    
    // Create an ArrayList to hold the String url's for each .png file that contains an image of a card.
    // File URLs are hard-coded in, and therefore must be copy/pasted to match the file locations on the users machine
    ArrayList <String> unusedCardURLs = new ArrayList<>(
    		Arrays.asList(
    				"1.png", 
    				"2.png", 
    				"3.png", 
    				"4.png", 
    				"5.png", 
    				"6.png", 
    				"7.png", 
    				"8.png", 
    				"9.png", 
    				"10.png", 
    				"11.png", 
    				"12.png", 
    				"13.png", 
    				"14.png", 
    				"15.png", 
    				"16.png", 
    				"17.png", 
    				"18.png", 
    				"19.png", 
    				"20.png", 
    				"21.png", 
    				"22.png", 
    				"23.png", 
    				"24.png", 
    				"25.png", 
    				"26.png", 
    				"27.png", 
    				"28.png", 
    				"29.png", 
    				"30.png", 
    				"31.png", 
    				"32.png", 
    				"33.png", 
    				"34.png",
    				"35.png", 
    				"36.png", 
    				"37.png", 
    				"38.png", 
    				"39.png", 
    				"40.png", 
    				"41.png", 
    				"42.png", 
    				"43.png", 
    				"44.png", 
    				"45.png", 
    				"46.png", 
    				"47.png", 
    				"48.png", 
    				"49.png", 
    				"50.png", 
    				"51.png", 
    				"52.png"));
    
    // Create an ArrayList that will hold card URLs after they are used. This array will be checked each time new cards are drawn.
    // The size of the ArrayList is initialized to zero, because zero cards have been drawn at the beginning of the program
    ArrayList<String> usedCardURLs = new ArrayList<>();
        
    // A kind of "counter" that will serve as parameter for add(), when used to place card in array of used cards. Will also be
    // used to indicate how far through the used card array the loop that checks if the card is used needs to check. This value
    // will be incremented.
//    int insertPositionForNextUsedCard = 0;
    
    // Create ArrayList to hold the cards to be displayed in the panes
    ArrayList<ImageView> cardsToDisplay = new ArrayList<>();
    
    // Call method to get cards as Image Objects???
    for(int i = 0; i < NUMBER_OF_CARDS; i++) {
    	String randomCardURL = addCardToPane(unusedCardURLs);
    	unusedCardURLs.remove(randomCardURL);
    	Image randomCardImage = new Image(randomCardURL);
    	ImageView randomCardImgView = new ImageView(randomCardImage);
    	pane.getChildren().add(randomCardImgView);
    }
    
    /* CODE FOR DOING STUFF THREE TIMES ONE FOR EACH CARD. REPLACED WITH FOR LOOP ABOVE.
    // Randomly pick an index of cardURLs in the unused card ArrayList
    int firstRandCardNum = (int) (Math.random() * 52) + 1;
    int secondRandCardNum = (int) (Math.random() * 52) + 1;
    int thirdRandCardNum = (int) (Math.random() * 52) + 1;
    
    // Set each string at that random index to a String variable
    String firstRandImgURL = unusedCardURLs.get(firstRandCardNum);
    String secondRandImgURL = unusedCardURLs.get(secondRandCardNum);
    String thirdRandImgURL = unusedCardURLs.get(thirdRandCardNum);
    
    // Pull each of those string URLs out of the unused card ArrayList
    unusedCardURLs.remove(firstRandImgURL);
    unusedCardURLs.remove(secondRandImgURL);
    unusedCardURLs.remove(thirdRandImgURL);
    
    // Add each of those string URLs to the used card ArrayList
    //// NOT INCLUDED IN FOR LOOP, SEE DOUBLE COMMENT BELOW
    usedCardURLs.add(firstRandImgURL);
    usedCardURLs.add(secondRandImgURL);
    usedCardURLs.add(thirdRandImgURL);
    //// WHY ARE WE CREATING A LIST OF UNUSED CARDS? NO IDEA, BUT NOT REMOVING CODE UNTIL I KNOW IT'S UNNECESSARY, SINCE I ALREADY TYPED IT UP
    
    // Create three new Image objects, one for each card to be displayed
    Image firstCardImage = new Image(firstRandImgURL);
    Image secondCardImage = new Image(secondRandImgURL);
    Image thirdCardImage = new Image(thirdRandImgURL);
    
    // Use card Image object to create new ImageViews so they can be added to pane
    ImageView firstCardImgView = new ImageView(firstCardImage);
	ImageView secondCardImgView = new ImageView(secondCardImage);
	ImageView thirdCardImgView = new ImageView(secondCardImage);
	
	// Add ImageView objects to pane
    pane.getChildren().add(firstCardImgView);
    pane.getChildren().add(secondCardImgView);
    pane.getChildren().add(thirdCardImgView);
    
    */
    
//    firstCardImgView.setOnMousePressed(e -> {
//    	
//    });
    
    // Make images clickable
    
//    firstCardImage.setOnMousePressed(e -> {       
//        text.setX(e.getX());
//        text.setY(e.getY());
//      });
    
    
    
    
    // *** Alternatively you could pass the URL of the .png file directly into the ImageView constructor as
    // *** is done below. However, the instructions mention using the image constructor
    
    /*
    // Create a new ImageView(String url) object, by passing the nThRandImgURL to the constructor
    // Add that ImageView as a child to the pane
    // Do this three times (one for each card)
    pane.getChildren().add(new ImageView(firstRandImgURL));
    pane.getChildren().add(new ImageView(secondRandImgURL));
    pane.getChildren().add(new ImageView(thirdRandImgURL));
    */
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    // Set the title as it appears to be set in instructions demo image
    primaryStage.setTitle("Assignment 5");
    // set the scene for the stage
    primaryStage.setScene(scene);
    // show the stage
    primaryStage.show();
  }

  public String addCardToPane(ArrayList<String> unusedCardURLs) {
	  int randomCardNum = (int) (Math.random() * 52) + 1;
	  String randomCardURL = unusedCardURLs.get(randomCardNum);
	  return randomCardURL;
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}