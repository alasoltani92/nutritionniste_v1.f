/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import org.controlsfx.control.Rating;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class AvisController implements Initializable {

    @FXML
    private Rating rating;
    @FXML
    private ComboBox<?> aviscombo;
    @FXML
    private Label labelrating;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void envoyer(ActionEvent event) {
    }
    
}
