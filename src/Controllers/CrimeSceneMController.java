/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class CrimeSceneMController {

    @FXML
    private ImageView animatedImage;
    @FXML
    private ImageView animatedImage1;
    @FXML
    private ImageView animatedImage2;
    private boolean scoreIncremented = false;
    private boolean scoreIncremented1 = false;
    private boolean scoreIncremented2 = false;
   

    private TranslateTransition translateTransition;
    private TranslateTransition translateTransition1;
    private TranslateTransition translateTransition2;
    @FXML
    private Label scoreLabel;

    private int score;
    private Timeline scoreAnimation;
    @FXML
    private AnchorPane an;
    @FXML
    private ImageView bg;
    @FXML
    private ImageView next;
    @FXML
    private void initialize() {
        
        translateTransition = new TranslateTransition(Duration.seconds(2), animatedImage);
        translateTransition1 = new TranslateTransition(Duration.seconds(2), animatedImage1);
        translateTransition2 = new TranslateTransition(Duration.seconds(2), animatedImage2);
        next.setOnMouseClicked(event -> {
            try {
                passerALaDeuxiemeInterface();
            } catch (IOException ex) {
                Logger.getLogger(Annance1Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
     private void passerALaDeuxiemeInterface() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Preuve.fxml"));
        Parent deuxiemeInterface = loader.load();
        Scene scene = next.getScene();
        scene.setRoot(deuxiemeInterface);
    }

    // Method to start the translation animation
    @FXML
    public void startAnimation() {
        // Set the destination position for the animation
        translateTransition.setToX(275);
        translateTransition.setToY(90);

        // Start the animation
        translateTransition.play();
    }
    @FXML
     public void startAnimation1() {
        // Set the destination position for the animation
        translateTransition1.setToX(-90);
        translateTransition1.setToY(180);

        // Start the animation
        translateTransition1.play();
    }
    @FXML
     public void startAnimation2() {
        // Set the destination position for the animation
        translateTransition2.setToX(255);
        translateTransition2.setToY(160);

        // Start the animation
        translateTransition2.play();
    }
    

    // Method to stop the translation animation
    @FXML
    public void stopAnimation() {
      
        // Stop the animation
        translateTransition.stop();
    }
    @FXML
    public void stopAnimation1() {
      
        // Stop the animation
        translateTransition1.stop();
    }
    @FXML
    public void stopAnimation2() {
      
        // Stop the animation
        translateTransition2.stop();
    }

    void setTransitions(List<TranslateTransition> transitions) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public CrimeSceneMController() {
        // Configuration de l'animation du score
        scoreAnimation = new Timeline(
            new KeyFrame(Duration.ZERO, event -> updateScoreLabel())
            //new KeyFrame(Duration.seconds(1), event -> incrementScore())
        );
        scoreAnimation.setCycleCount(Timeline.INDEFINITE);
    }
    

    @FXML
    public void startScoreAnimation() {
        scoreAnimation.play();
    }

    public void stopScoreAnimation() {
        scoreAnimation.stop();
    }

    //private void incrementScore() {
    //    score += points;
    //    updateScoreLabel();}

    
    @FXML
    public void incrementScore() {
        if (!scoreIncremented) {
        score += 5;
        updateScoreLabel();
        scoreIncremented = true;
    }
    }
    @FXML
    public void incrementScore1() {
        if (!scoreIncremented1) {
        score += 10;
        updateScoreLabel();
        scoreIncremented1 = true;
    }
    }
    @FXML
    public void incrementScore2() {
        if (!scoreIncremented2) {
        score += 15;
        updateScoreLabel();
        scoreIncremented2 = true;
    }
    }
    private void updateScoreLabel() {
        scoreLabel.setText("Score: " + score);
    }
}