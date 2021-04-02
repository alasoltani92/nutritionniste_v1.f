/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tableView.TableViewController;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class HomeController implements Initializable {

    @FXML
    private Button nutId;
    @FXML
    private Button conf;
    @FXML
    private Button avisid;
    @FXML
    private Label nut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void close(MouseEvent event) {
               Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void nutAction(ActionEvent event) {
         
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("/tableView/tableView.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            Stage current = (Stage)((Node) event.getSource()).getScene().getWindow();
           current.close();
        } catch (IOException ex) {
            Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  /*  private void imcAction(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/IMC/CalculeIMC.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            Stage current = (Stage)((Node) event.getSource()).getScene().getWindow();
           current.close();
        } catch (IOException ex) {
            Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

   /* private void rdvAction(ActionEvent event) {
           try {
            Parent parent = FXMLLoader.load(getClass().getResource("/RDV/DemandeRDV.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            Stage current = (Stage)((Node) event.getSource()).getScene().getWindow();
           current.close();
        } catch (IOException ex) {
            Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

   /* private void AvisEvent(ActionEvent event) {
           try {
            Parent parent = FXMLLoader.load(getClass().getResource("/Avis/avis.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            Stage current = (Stage)((Node) event.getSource()).getScene().getWindow();
           current.close();
        } catch (IOException ex) {
            Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    @FXML
    private void confirme(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("/OperationRDV/Rdv.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            Stage current = (Stage)((Node) event.getSource()).getScene().getWindow();
           current.close();
        } catch (IOException ex) {
            Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void afficheavis(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("/ReclamationAvis/avis.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            Stage current = (Stage)((Node) event.getSource()).getScene().getWindow();
           current.close();
        } catch (IOException ex) {
            Logger.getLogger(TableViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void eventRedirect(MouseEvent event) {
    }

    @FXML
    private void redirectevent(MouseEvent event) {
    }

    @FXML
    private void nut_login(MouseEvent event) {
    }

    @FXML
    private void coursRedirect(MouseEvent event) {
    }

    @FXML
    private void promoRedirect(MouseEvent event) {
    }

    @FXML
    private void coachRedirect(MouseEvent event) {
    }

    @FXML
    private void abonnementRedirect(MouseEvent event) {
    }

    @FXML
    private void userRedirect(MouseEvent event) {
    }

 
    
}
