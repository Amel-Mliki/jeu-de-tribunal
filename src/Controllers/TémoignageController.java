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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jeu_de_tribunal_.Jeu_de_tribunal_;

/**
 * FXML Controller class
 *
 * @author user
 */
public class TémoignageController implements Initializable {

    @FXML
    private AnchorPane an;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Next(ActionEvent event) {
         an.getScene().getWindow().hide();
        try {
            Stage st=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Views/CrimeScene.fxml"));
            Scene scene = new Scene(root);
            
            st.setTitle("Calcul de score");
            st.setScene(scene);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(Jeu_de_tribunal_.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
