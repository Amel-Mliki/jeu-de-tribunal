/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FinController implements Initializable {

    @FXML
    private AnchorPane an;
    @FXML
    private ImageView im;
   private AudioClip audioClip;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initSon();
    }   
     private void initSon() {
        String cheminSon = getClass().getResource("Félicitation.mp3").toString();
        audioClip = new AudioClip(cheminSon);
        
        Duration dureeLecture = Duration.seconds(4);
        Timeline timeline = new Timeline(new KeyFrame(dureeLecture, event -> audioClip.stop()));
        timeline.play();
        audioClip.play();
        
    }
    
}
