
package javafxapplication1;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXColorPicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author JasonLee
 */
public class FXMLDocumentController implements Initializable {

     
    @FXML
    private JFXColorPicker colorPicker;

    @FXML
    private AnchorPane pane;
    @FXML
    private JFXCheckBox flag;
    
    @FXML
    void changeColor(ActionEvent event) {
        
        if(flag.isSelected()){
        
Color selectedColor = colorPicker.getValue();
pane.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        }
       
       
        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }}
