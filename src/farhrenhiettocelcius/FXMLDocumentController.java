/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farhrenhiettocelcius;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author acer
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField fahrenheitField;
    @FXML
    private TextField celciusField;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleConvertAction(ActionEvent event) {
        double temperatureInFahrenheit = Double.parseDouble(fahrenheitField.getText());
        double temperatureInCelcius = ((temperatureInFahrenheit - 32)/9)*5;
        celciusField.setText("" + temperatureInCelcius);
        
        
    }
    
}
