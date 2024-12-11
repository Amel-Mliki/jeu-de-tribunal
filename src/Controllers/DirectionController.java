/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;


public class DirectionController implements Initializable {

    @FXML
    private AnchorPane an2;
    @FXML
    private ImageView policeCar;

    private AudioClip audioClip;

    public void initialize()
    {
         an2.setOnMouseClicked(event -> {
            try {
                passerALaDeuxiemeInterface();
            } catch (IOException ex) {
                Logger.getLogger(Annance1Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         initSon();
        
    }
    private void initSon() {
        String cheminSon = getClass().getResource("son_police.mp3").toString();
        audioClip = new AudioClip(cheminSon);
        
        Duration dureeLecture = Duration.seconds(3);
        Timeline timeline = new Timeline(new KeyFrame(dureeLecture, event -> audioClip.stop()));
        timeline.play();
        audioClip.play();
        
    }
     
    private void passerALaDeuxiemeInterface() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Accueil.fxml"));
        Parent deuxiemeInterface = loader.load();
        Scene scene = an2.getScene();
        scene.setRoot(deuxiemeInterface);
    }
   
}




