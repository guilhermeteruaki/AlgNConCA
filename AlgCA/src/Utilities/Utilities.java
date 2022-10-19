package Utilities;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 
 * @author guilh
 */
public class Utilities {
   
    public Utilities() {
    //Standard constructor 
    }
    
    /**
     * 
     * @param print message displayed to the user
     * @return return the String user inputs
     */
    public String askForString(String print){
        String userString="";
        Scanner userInput = new Scanner(System.in);
        System.out.println(print);
        
        try {
            userString = userInput.nextLine(); //Try to read user input
            
            
        } catch (Exception e) { // catches unexpected errors
            System.out.println("There was an unexpected error, please try again");
            
        }
        return userString;
    }

    
    
    /**
     * 
     * @param print Print the message to prompt the user to input something
     * @return the INT provided by the user
     * catch mismatch exception  if input is not an INT 
     */
    public int askForInt (String print){
        int userInt=0;
        Scanner userInput = new Scanner(System.in); 
        System.out.println(print);
        boolean valid=false; 
        do{ //loop to rerun the code if input is not valid
            
            try {
                userInt = userInput.nextInt(); //Try to read user input
                userInput.nextLine();
                valid=true;

            } catch (InputMismatchException e) {//display a message if input is not an INT
                System.out.println("This is not a Integer try again");
                userInput.nextLine();
            } 
        }while(!valid);//rerun if input is not valid
        
        return userInt;
    }
    
     public int askForMinInt(String print,int min){
        int userInt=0;
        Scanner userInput = new Scanner(System.in); 
        System.out.println(print);
        boolean valid=false; 
        do{ //loop to rerun the code if input is not valid
            
            try {
                userInt = userInput.nextInt(); //Try to read user input
                userInput.nextLine();
                if(userInt<min){
                    System.out.println("Please choose a number greater than "+ min);
                }else{                
                valid=true;}

            } catch (InputMismatchException e) {//display a message if input is not an INT
                System.out.println("This is not a Integer try again");
                userInput.nextLine();
            } 
        }while(!valid);//rerun if input is not valid
        
        return userInt;
    }
    
    /**
     * Ask the user to input a DOUBLE
     * @param print message asking for the number
     * @return the value inputted
     */
    public double askForDouble (String print){
        double userDouble=0;
        Scanner userInput = new Scanner(System.in); 
        System.out.println(print);
        boolean valid=false;
        do{
            try {
                userDouble = userInput.nextDouble(); //Try to read user input
                userInput.nextLine();
                valid = true;


            } catch (InputMismatchException e) {//display a message if input is not an Double
                System.out.println("This is not a number Try again");
                userInput.nextLine();
                
            }
        } while(!valid);//rerun if input is not valid
        
        return userDouble;
    }
    
    public String readFileLine(String filePath){
        String line="";
        try{
        Scanner fileReader = new Scanner(new FileReader(filePath));
        line = fileReader.nextLine();
        }
        catch(FileNotFoundException e) {
            System.out.println("Your file was not found, double check your path");
        }
        return line;
    }
    /**
     * 
     * @param print message displayed to user
     * reads the user input as string and get the char at position 0
     * @return 
     */
    public char askForChar (String print){
        char userChar='\u0000'; //This initializes userChar as NULL
        Scanner userInput = new Scanner(System.in);
        System.out.println(print);
        try {
            userChar = userInput.next().charAt(0); //Try to read user input and get the first Char
            
            
        } catch (Exception e) { // catches unexpected errors
            System.out.println("There was an unexpected error, please try again");
            
        }
        return userChar;
        
    }



}
