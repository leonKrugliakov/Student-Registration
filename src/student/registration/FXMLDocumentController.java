//*****************************************************************************************************
//
//      File:               FXMLDocumentController.java
//
//      Student:            Leon Krugliakov
//
//      Assignment:         Assignment #9
//
//      Course Name:        Java I
//
//      Course Number:      COSC 2050 - 01
//
//      Due:                April 8th, 2020
//
//
//      This is a program that displays the user with a GUI interface and
//      allows them to register as a student. The application takes in user
//      input for their first and last names as well as their year of birth.
//      The program then validates that the user did not enter empty strings
//      as well as that the user entered integer values for the year of birth
//      input string. Then the applicaiton displays the users with a temporary
//      password as well as a welcome message with their names.
//      The program then gives the user the option to close the application.
//
//      Other files required:
//      1.  FXMLDocument.java  -  Contains the application's controller.
//      2.  StudentRegistration.java  -  Contains the StudentRegistration method.
//      3.  ValidatorApp.java  -  Contains the ValidatorApp class.
//
//*****************************************************************************************************

package student.registration;

//*****************************************************************************************************

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

//*****************************************************************************************************

public class FXMLDocumentController implements Initializable 
{
    
    @FXML
    private TextField fNameInput;
    @FXML
    private TextField lNameInput;
    @FXML
    private TextField yearBirthInput;
    @FXML
    private TextField pswdInput;
    @FXML
    private Text outputText;
    @FXML
    private Button register;
    @FXML
    private Button exit;
    
    //*****************************************************************************************************
    
    @FXML
    private void buttonClicked(ActionEvent event) 
    {
        String fname, 
                lname, 
                yearBirth, 
                errorMSG = "";
        ValidatorApp validator = new ValidatorApp();
        
        if(event.getSource().equals(register))
        {
            fname = fNameInput.getText();
            lname = lNameInput.getText();
            yearBirth = yearBirthInput.getText();
            
            errorMSG += validator.isPresent(fname, "First Name");
            errorMSG += validator.isPresent(lname, "Last Name");
            errorMSG += validator.isPresent(yearBirth, "Year of Birth");

            if(validator.isPresent(yearBirth, "Year of Birth").isEmpty())
            {
                errorMSG += validator.isDouble(yearBirth, "Year of Birth");
            }
            
            if(errorMSG.equals(""))
            {
                pswdInput.setText(fname + "*" + yearBirth);
                outputText.setText("Welcome " + fname + " " + lname + "!");
            }
            else
            {
                pswdInput.setText("");
                outputText.setText(errorMSG);
            }
        }
        else if(event.getSource().equals(exit))
        {
            System.out.println("Goodbye!");
            System.exit(0);
        }
        
    }
    
    //*****************************************************************************************************
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        pswdInput.setEditable(false);
    }    
}
