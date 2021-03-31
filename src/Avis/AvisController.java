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
import javafx.util.Duration;
import org.controlsfx.control.Rating;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

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
       notification(); 
    
    }
    
    
     public void notification(){
     String title = "MERCI POUR VOTRE AVIS! ";
            String messagee = "avis envoyer!";
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(messagee);
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.seconds(4));
            
}
}