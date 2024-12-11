/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jeu_de_tribunal_.Jeu_de_tribunal_;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AccueilController implements Initializable {

    @FXML
    private AnchorPane an1;
    
    @FXML
    private ImageView im1;
    @FXML
    private Button M;
    @FXML
    private Button V;
    @FXML
    private ImageView imm;
    @FXML
    private ImageView imv;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    @FXML
    private void gotointerfacem(ActionEvent event) 
    {
         an1.getScene().getWindow().hide();
        try {
            Stage st=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Views/CrimeSceneV.fxml"));
            Scene scene = new Scene(root);
            
            st.setTitle("preuves");
            st.setScene(scene);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(Jeu_de_tribunal_.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void gotointerfacev(ActionEvent event) 
    {
         an1.getScene().getWindow().hide();
        try {
            Stage st=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Views/CrimeSceneM.fxml"));
            Scene scene = new Scene(root);
            
            st.setTitle("preuves");
            st.setScene(scene);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(Jeu_de_tribunal_.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
