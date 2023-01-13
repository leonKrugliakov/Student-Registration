//*****************************************************************************************************
//
//      File:               ValidatorApp.java
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
//      3.  StudentRegistration.java  -  Contains the StudentRegistration class.
//
//*****************************************************************************************************

package student.registration;

//*****************************************************************************************************

public class ValidatorApp 
{
    //*****************************************************************************************************
    
    public ValidatorApp()
    {
        
    }
    
    //*****************************************************************************************************
    
    public String isPresent(String value, String name)
    {
        String errorMSG = "";
        
        if(value.isEmpty())
        {
            errorMSG = name + " is required.\n";
        }
        
        return errorMSG;
    }
    
    //*****************************************************************************************************
    
    public String isInteger(String value, String name)
    {
        String errorMSG = "";
        
        try
        {
            Integer.parseInt(value);
        }
        catch(NumberFormatException e)
        {
            errorMSG = name + " must be an integer.\n";
        }
        
        return errorMSG;
    }
    
    public String isDouble(String value, String name)
    {
        String errorMSG = "";
        
        try
        {
            Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            errorMSG = name + " must be a double.\n";
        }
        
        return errorMSG;
    }
}
