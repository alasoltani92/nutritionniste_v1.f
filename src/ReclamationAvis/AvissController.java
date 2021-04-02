/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReclamationAvis;

import Home.HomeController;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.controlsfx.control.Rating;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class AvissController implements Initializable {

    @FXML
    private TextArea desc;
    @FXML
    private Button Envoyer;
    @FXML
    private Rating rating;
    @FXML
    private FontAwesomeIconView homePage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goHome(MouseEvent event) {
          try {
            Parent parent = FXMLLoader.load(getClass().getResource("/Adherent/Homeadhe.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(parent);
                mainStage.setScene(scene);
                mainStage.show();
//          
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
