/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula3_2Controller implements Initializable {

    @FXML
    private RadioButton radio1;
    @FXML
    private ToggleGroup periodo;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private RadioButton radio4;
    @FXML
    private Label dados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
       String m = "";
       String n=" ";
       //para verificar se um radiobutton está selecionado 
       //utiliza-se o metodo 
       //osSelected()
       if(radio1.isSelected()){
           //getText();
           //tambem retorna o texto do radio
           m= radio1.getText();
       }
         if(radio2.isSelected()){
           //getText();
           //tambem retorna o texto do radio
           m= radio2.getText();
       }
          if(radio3.isSelected()){
           //getText();
           //tambem retorna o texto do radio
           m= radio3.getText();
       }
           if(radio4.isSelected()){
           //getText();
           //tambem retorna o texto do radio
           m= radio4.getText();
           
       }
            //jogar os dados no label
           dados.setText(m+n);
    
    }
          
}
