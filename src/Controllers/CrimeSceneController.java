package Controllers;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.logging.Logger;
import java.util.logging.Level;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import jeu_de_tribunal_.Jeu_de_tribunal_;




public class CrimeSceneController {

    @FXML
    private AnchorPane an1;
   
    public void initialize() {
    }

    
    
    

    @FXML
    private void next(ActionEvent event) {
         an1.getScene().getWindow().hide();
        try {
            Stage st=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Views/Coordonnee.fxml"));
            Scene scene = new Scene(root);
            
            st.setTitle("preuves");
            st.setScene(scene);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(Jeu_de_tribunal_.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}