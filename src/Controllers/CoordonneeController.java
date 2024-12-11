/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CoordonneeController implements Initializable {

    @FXML
    private ImageView next;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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

    @FXML
    private void next(MouseEvent event) {
        
    }
    
}
