/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationRDV;

import com.jfoenix.controls.JFXTextField;
import helpers.DbConnect;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import models.Nutritionniste;
import models.Rendvous;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class AddRdvController implements Initializable {

    @FXML
    private JFXTextField Nid;
    @FXML
    private JFXTextField Userid;
    @FXML
    private JFXTextField Dateid;
    
    
    
     String query = null;
    Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement;
     Rendvous Rendvous = null ;

     
    private boolean update;
    int id_rdv;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void save(MouseEvent event) {
        connection = DbConnect.getConnect();
         String Iduser = Userid.getText();
        String Nutid = Nid.getText();
        String date = Dateid.getText();
        

        if (Iduser.isEmpty()  || Nutid.isEmpty()|| date.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Veuillez remplir tout les champs");
            alert.showAndWait();
           notificationerr();
        } else  {
            if (validation_ajout()==1) {
            
            getQuery();
             insert();
             notification();
             clean();
            }else{
            getQuery();
             insert();
                     }
             
                        
                   }
        
    }

    private void getQuery() {
        if(validation_ajout()==1){
        if (update == false) {
        query = "INSERT INTO `rdv`(`id_user`,`id_nut`,`date_rdv`) VALUES (?,?,?)";   
      
        }else if(update==true) {
            query = "UPDATE `rdv` SET "
                    + "`id_user`=?,"
                    + "`id_nut`=?,"
                    + "`date_rdv`=?"
                    +" WHERE id_rdv = '"+id_rdv+"'";
          notificationmod();
           

        }}
    }

    private void insert() {
           try {
preparedStatement = connection.prepareStatement(query);
 
preparedStatement.setString(1,Userid.getText());
 preparedStatement.setString(2, Nid.getText());
 preparedStatement.setString(3, Dateid.getText());
               System.out.println(""+preparedStatement.toString());
      preparedStatement.execute();
        }
            catch (SQLException ex) {
            
        }
    }

    @FXML
    private void clean() {
        
        Userid.setText(null);
        Nid.setText(null);
        Dateid.setText(null);  
   
    }
     void setUpdate(boolean b) {
        this.update = b;

    }
        void setTextField(int id, String user,String nut, String date) {

       id_rdv = id;
        Userid.setText(user);
        Nid.setText(nut);
        Dateid.setText(date);
       

    } private int validation_ajout() {
        int a=1;
         if(!Userid.getText().matches("[0-9]+") ) {
            Userid.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Attention");
                    alert.setContentText("veuillez saisir ID utulisateur Valide");
                   alert.showAndWait();
                   a=0;

    }
         else if(!Nid.getText().matches("[0-9]+") ) {
            Nid.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Attention");
                    alert.setContentText("veuillez saisir ID Nutritionniste Valide");
                   alert.showAndWait();
                   a=0;

             
    }
return a;
}
        public void notificationmod(){
     String title = "REGIME MODIFIER! ";
            String messagee = "Regime a été modifier avec succés!";
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(messagee);
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.seconds(4));
            
    }
            public void notification(){
     String title = "REGIME AJOUTER! ";
            String messagee = "Regime a été ajouter avec succés!";
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(messagee);
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.seconds(4));
            
    }
   
   
            public void notificationerr(){
     String title = "REGIME NON AJOUTER! ";
            String messagee = "Regime n'est pas été ajouter!";
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(messagee);
            tray.setNotificationType(NotificationType.ERROR);
            tray.showAndDismiss(Duration.seconds(4));
            }
      public void notifmodalert(){
     String title = "nuyritionniste NON MODIFIER! ";
            String messagee = "nutritionniste ne pas été MODIFIER !";
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(messagee);
            tray.setNotificationType(NotificationType.ERROR);
            tray.showAndDismiss(Duration.seconds(4));
      }
             public void notificationalert(){
     String title = "nuyritionniste NON ajouter! ";
            String messagee = "nutritionniste ne pas été ajouter !";
            TrayNotification tray = new TrayNotification();
            tray.setTitle(title);
            tray.setMessage(messagee);
            tray.setNotificationType(NotificationType.ERROR);
            tray.showAndDismiss(Duration.seconds(4));
}   
}
