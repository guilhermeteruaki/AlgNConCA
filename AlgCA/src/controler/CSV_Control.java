/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;



/**
 *
 * @author guilh
 * Contains the methods to control CSV files
 * 
 */
public class CSV_Control {
    
    private final String CSV_Separator=",";
    
    
    /** 
     * 
     * @param file path
     * @return an ArrayList containing  String[]s with all the attributes of each line in the CSV
     */
    public ArrayList<String[]> readCSV(String file){ // Code adapted from https://www.javatpoint.com/how-to-read-csv-file-in-java
        
        String line; 
        
        //array list that holds String arrays
        ArrayList<String[]> result= new ArrayList<>();
        
            try{
                //Add the file to the buffered reader
                
                BufferedReader br = new BufferedReader(new FileReader(file)); 
                
                //Checks there is still lines in the file to be read
                while ((line = br.readLine()) != null){
                    
                    //add each attribute of the file line to the temp array
                    String[] temp = line.replaceAll("[\"]" , " ").split(CSV_Separator);
                    //add temp array to the arraylist
                    result.add(temp);
                }
                br.close();
            }
            catch(FileNotFoundException e){
                System.out.println("File Not found, please check that your file has the correct name: " +file+ "\n");
                System.out.println(e.toString());
            }
        
            catch(IOException e){
                System.out.println("Error in readCSV method\n");
                System.out.println(e.toString());
            }
        
        return result;
        
    }
    

    /**
     * Method to write data file as CSV
     * @param data Data should be in the form of ArrayList<String[]>
     * @param path path with name of desired file
     */
    public void convertToCSV(ArrayList<String[]> data, String path) {
        /* 
        This part of the code was addapted from:
        https://stackoverflow.com/questions/52436120/cannot-find-symbol-error-when-attempting-to-use-stream-on-array-in-java
        https://www.geeksforgeeks.org/different-ways-for-integer-to-string-conversions-in-java/
        https://stackoverflow.com/questions/72297709/writing-arraylist-to-csv-file-in-java
        */
        try{
            FileWriter writer = new FileWriter(path);
            
            for(int i=0; i<data.size();i++){
                
            //collects all the data in the array as a single String seaparating values with a comma
                String collect = Arrays.stream(data.get(i)).collect(Collectors.joining(","));
                
            writer.write(collect);
            writer.write(System.lineSeparator());
            
            }writer.close();    
        }catch (IOException ex){
            System.out.println("Error in covert to CSV method\n " +ex );
        
        }catch(Exception e){
            System.out.println("Error in covert to CSV method\n " +e );
        
        } 
            
    }
    
    
    
    
    
    
        
     
        
}       
