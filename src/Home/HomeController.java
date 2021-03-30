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
    private Button imcId;
    @FXML
    private Button rdvId;
    @FXML
    private Button contactId;

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

    @FXML
    private void imcAction(ActionEvent event) {
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
    }

    @FXML
    private void rdvAction(ActionEvent event) {
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
    }

    @FXML
    private void ContactEvent(ActionEvent event) {
    }
    
}
