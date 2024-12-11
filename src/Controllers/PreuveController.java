/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
///importation de package views
import Models.Preuve;
import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;


import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jeu_de_tribunal_.Jeu_de_tribunal_;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PreuveController implements Initializable {

    @FXML
    private Button inserer;
    @FXML
    private Button next;
    @FXML
    private Button supprimer;
    @FXML
    private Button modifier;
    @FXML
    private TableView<Preuve> table_preuve;
    @FXML
    private TableColumn<Preuve, String> col_type;
    @FXML
    private TableColumn<Preuve, String> col_source;
   
    @FXML
    private TableColumn<Preuve, String> col_fiabilite;

    @FXML
    private ComboBox<String> types;
    
    @FXML
    private Label T;
    @FXML
    private Label S;
    @FXML
    private Label F;
    @FXML
    private TextField sources;
    @FXML
    private TextField fiabilites;
    
private final ObservableList<String> comboType = FXCollections.observableArrayList("Emprunt", "Temoignage" , "Objet physique","Document ecrit");
    @FXML
    private AnchorPane an;
    

     public void comboBox()
    {
        List<String> list = new ArrayList<>();
        for (String p : comboType) {
            list.add(p);
        }

        ObservableList datalist = FXCollections.observableArrayList(list);
        types.setItems(datalist);
    }
     
     
     
     
     
     
     
    @FXML
     public void textfieldDesign() {
        if (sources.isFocused()) {
            sources.setStyle("-fx-border-width:2px; -fx-background-color:#fff");
            fiabilites.setStyle("-fx-border-width:1px; -fx-background-color:#transparent");
            types.setStyle("-fx-border-width:1px; -fx-background-color:#transparent");
        } else if (fiabilites.isFocused()) {
            fiabilites.setStyle("-fx-border-width:2px; -fx-background-color:#fff");
            sources.setStyle("-fx-border-width:1px; -fx-background-color:#transparent");
            types.setStyle("-fx-border-width:1px; -fx-background-color:#transparent");
        } else if (types.isFocused()) {
            types.setStyle("-fx-border-width:2px; -fx-background-color:#fff");
            sources.setStyle("-fx-border-width:1px; -fx-background-color:#transparent");
            fiabilites.setStyle("-fx-border-width:1px; -fx-background-color:#transparent");
        }
    }
     

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {// for combo
        comboBox();
            types.setItems(comboType);
        String valeurComboBox = types.getValue();
         col_source.setCellValueFactory(new PropertyValueFactory<Preuve, String>("source"));
        col_fiabilite.setCellValueFactory(new PropertyValueFactory<Preuve, String>("fiabilite"));
        col_type.setCellValueFactory(new PropertyValueFactory<Preuve, String>("type"));
        
    }   

    @FXML
    private void insererpreuve(ActionEvent event) 
    {
     
         try {
        String valeurComboBox = types.getValue();
        Preuve preuve = new Preuve(sources.getText(), fiabilites.getText(), valeurComboBox);

        ObservableList<Preuve> preuves = table_preuve.getItems();
        preuves.add(preuve);
        table_preuve.setItems(preuves);

        // Rafraîchir la TableView
        table_preuve.refresh();
    } catch (Exception e) {
        e.printStackTrace();}
    }    
@FXML
    private void supprimerpreuve(ActionEvent event) 
    {
        
        Preuve preuveSelectionnee = table_preuve.getSelectionModel().getSelectedItem();

    if (preuveSelectionnee != null) {
        ObservableList<Preuve> preuves = table_preuve.getItems();

        preuves.remove(preuveSelectionnee);

        table_preuve.refresh();
   } else {
        System.err.println("Veuillez sélectionner une ligne à supprimer.");
    }
        
    }
    @FXML
    private void modifierpreuve(ActionEvent event) 
    {
        
    Preuve preuveSelectionnee = table_preuve.getSelectionModel().getSelectedItem();

    // Vérifier si un élément est sélectionné
    if (preuveSelectionnee != null) {
        // Modifier les propriétés de l'élément
        preuveSelectionnee.setSource(sources.getText());
        preuveSelectionnee.setFiabilite(fiabilites.getText());
        preuveSelectionnee.setType(types.getValue());

        // Rafraîchir la TableView
        table_preuve.refresh();
    } else {
        // Aucun élément sélectionné, afficher un message d'erreur ou de notification
        System.err.println("Veuillez sélectionner une ligne à modifier.");
    }
    }

    

   @FXML
    private void nextinterface(ActionEvent event)
    {
       an.getScene().getWindow().hide();
        try {
            Stage st=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Views/Fin.fxml"));
            Scene scene = new Scene(root);
            
            st.setTitle("Calcul de score");
            st.setScene(scene);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(Jeu_de_tribunal_.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
 }
