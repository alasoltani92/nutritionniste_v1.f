/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RDV;

import Home.HomeController;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class RDVController implements Initializable {

    @FXML
    private FontAwesomeIconView homePage;
    @FXML
    private FontAwesomeIconView goRDV;
    @FXML
    private HBox send;
    @FXML
    private TextField nomId;
    @FXML
    private TextField prenomId;
    @FXML
    private TextArea DescId;
    @FXML
    private TextField emailId;
    @FXML
    private DatePicker dateId;
    @FXML
    private Button sendId;

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
            Parent parent = FXMLLoader.load(getClass().getResource("/Home/Home.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(parent);
                mainStage.setScene(scene);
                mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     @FXML
    private void goRDV(MouseEvent event) {
           try {
            Parent parent = FXMLLoader.load(getClass().getResource("/RDV/DemandeRDV.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(parent);
                mainStage.setScene(scene);
                mainStage.show();
//           
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void setTextField(String emailCol){
        this.emailId.setText(emailCol);
        
    }

    @FXML
    private void sendMail(ActionEvent event) {
        String name=nomId.getText();
        String prenom =prenomId.getText();
        String Des =DescId.getText();
      // String date=dateId.getValue().toString();

        if (name.isEmpty()  || prenom.isEmpty()||Des.isEmpty()/*||date.isEmpty()*/) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Veuillez remplir tout les champs");
            alert.showAndWait();
        } else{
        sendEmail();  
        clean();
        }
    }
    private void clean(){
        nomId.setText(null);
        prenomId.setText(null);
        DescId.setText(null);
       
}

    private void sendEmail() {
       	String Msg;
    
        final String username = "nsporify@gmail.com";
        final String password = "esprit123*";

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("nsporify@gmail.com"));//ur email
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(/*"nessrineselmi215@gmail.com"*/emailId.getText()));//u will send to
            message.setSubject("DEMANDE RENDEZ-VOUS");
            String msge=nomId.getText()+
                    prenomId.getText()+
                    DescId.getText();
            message.setText(msge);
            Transport.send(message);
           /* message.setText(prenomId.getText());
            Transport.send(message);
            message.setText(DescId.getText());
             Transport.send(message);*/
           // message.setText(dateId.getValue().toString());
           // Transport.send(message);
            Msg="true";
    	   // return "ff";

        } catch (Exception e) {
          //  return e.toString();
        }
    
    }
}
