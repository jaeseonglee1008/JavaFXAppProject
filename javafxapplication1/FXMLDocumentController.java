
package javafxapplication1;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author JasonLee
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField job;
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          //validator instance for the textfields
        RequiredFieldValidator validator = new RequiredFieldValidator();
        NumberValidator numValidator = new NumberValidator();
        
        name.getValidators().add(validator);
        job.getValidators().add(numValidator);
       
        validator.setMessage("No Input Given!");
        numValidator.setMessage("Only numbers are supported");
        
  
  //changeListener updates the setMessage for the field  
        name.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue)
                {
                    name.validate(); 
               //     job.validate();
                }
            }
        });
        
        job.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue)
                {
                    job.validate(); 
                }
            }
        });
        
        
//                    String pathOfTheCurrentClass = this.getClass().getResource(".").getPath();     
//            Image icon = new Image(new FileInputStream(pathOfTheCurrentClass + "\\.."+"Xicon.png"));
        try {
            Image icon = new Image(new FileInputStream("C:\\Users\\JasonLee\\Documents\\NetBeansProjects\\JavaFXApplication1\\src\\Xicon.png"));
            validator.setIcon(new ImageView(icon));
            numValidator.setIcon(new ImageView(icon));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
        
        
    }    
    
}
