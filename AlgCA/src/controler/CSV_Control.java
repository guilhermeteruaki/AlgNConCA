/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author guilh
 * Contains the methods to control CSV files
 * 
 */
public class CSV_Control {
    
    private String CSV_Separator=",";
    
    
    /** 
     * 
     * @param file path
     * @return an ArrayList containing  String[]s with all the attributes of each line in the CSV
     */
    public ArrayList<String[]> readCSV(String file){ // Code adapted from https://www.javatpoint.com/how-to-read-csv-file-in-java
        
        String line = ""; 
        
        //array list that holds String arrays
        ArrayList<String[]> result= new ArrayList<>();
        
            try{
                //Add the file to the buffered reader
                
                BufferedReader br = new BufferedReader(new FileReader(file)); 
                
                //Checks there is still lines in the file to be read
                while ((line = br.readLine()) != null){
                                        
                    //add each attribute of the file line to the temp array
                    String[] temp = line.split(CSV_Separator);
                    //add temp array to the arraylist
                    result.add(temp);
                }
            }
      
            catch(IOException e){
                System.out.println("Error in readCSV method\n");
                System.out.println(e.toString());
            }
        
        return result;
    }
    
    
      
    
    
    
    
    
    
    
}
