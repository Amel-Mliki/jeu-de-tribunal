package Controllers;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class CrimeSceneVController {

    @FXML
    private ImageView ai;
    @FXML
    private ImageView ai1;
    @FXML
    private ImageView ai2;
    private boolean scoreIncremented = false;
    private boolean scoreIncremented1 = false;
    private boolean scoreIncremented2 = false;
    
    @FXML
    private Label scoreLabel;

    private int score;
    private Timeline scoreAnimation;
   
   

    private TranslateTransition translateTransition;
    private TranslateTransition translateTransition1;
    private TranslateTransition translateTransition2;
    @FXML
    private ImageView bg;
    @FXML
    private ImageView next;
    @FXML
    private void initialize() {
        
        translateTransition = new TranslateTransition(Duration.seconds(2), ai);
        translateTransition1 = new TranslateTransition(Duration.seconds(2), ai1);
        translateTransition2 = new TranslateTransition(Duration.seconds(2), ai2);
      next.setOnMouseClicked(event -> {
            try {
                passerALaDeuxiemeInterface();
            } catch (IOException ex) {
                Logger.getLogger(Annance1Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    private void passerALaDeuxiemeInterface() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Témoignage.fxml"));
        Parent deuxiemeInterface = loader.load();
        Scene scene = next.getScene();
        scene.setRoot(deuxiemeInterface);
    }

    // Method to start the translation animation
    @FXML
    public void startAnimation() {
        // Set the destination position for the animation
        translateTransition.setToX(140);
        translateTransition.setToY(185);

        // Start the animation
        translateTransition.play();
    }
    @FXML
     public void startAnimation1() {
        // Set the destination position for the animation
        translateTransition1.setToX(-210);
        translateTransition1.setToY(335);

        // Start the animation
        translateTransition1.play();
    }
    @FXML
     public void startAnimation2() {
        // Set the destination position forthe animation
        translateTransition2.setToX(165);
        translateTransition2.setToY(195);

        // Start the animation
        translateTransition2.play();
    }
    

    // Method to stop the translation animation
    public void stopAnimation() {
      
        // Stop the animation
        translateTransition.stop();
    }
    public void stopAnimation1() {
      
        // Stop the animation
        translateTransition1.stop();
    }
    public void stopAnimation2() {
      
        // Stop the animation
        translateTransition2.stop();
    }
    public CrimeSceneVController() {
        // Configuration de l'animation du score
        scoreAnimation = new Timeline(
            new KeyFrame(Duration.ZERO, event -> updateScoreLabel())
            //new KeyFrame(Duration.seconds(1), event -> incrementScore())
        );
        scoreAnimation.setCycleCount(Timeline.INDEFINITE);
    }
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