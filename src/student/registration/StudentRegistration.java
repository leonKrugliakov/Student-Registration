//*****************************************************************************************************
//
//      File:               StudentRegistration.java
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
//      2.  FXMLDocumentController.java  -  Contains the FXMLDocumentController class.
//      3.  ValidatorApp.java  -  Contains the ValidatorApp class.
//
//*****************************************************************************************************

package student.registration;

//*****************************************************************************************************

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//*****************************************************************************************************

public class StudentRegistration extends Application 
{
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Student Registration");
        
        stage.setScene(scene);
        stage.show();
    }

    //*****************************************************************************************************
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
