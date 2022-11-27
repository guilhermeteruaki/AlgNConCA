/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import controler.CSV_Control;
import java.util.ArrayList;
import model.*;




/**
 *
 * @author guilh
 * Initializes the Library, reading all relevant CSV and creating relevant objects
 */
public class Library_initializer {
    CCT_Library cct = new CCT_Library();
    CSV_Control csv = new CSV_Control();
        
    public void Library_initializer(){
      init_Books();
      init_Students();
        
        
    }
    private void init_Books(){
        ArrayList<String[]> list = csv.readCSV("src\\database\\Books\\book.txt");
        
        for(int i=0; i<list.size();i++){
           
            cct.Create_Books(list.get(i));    
        }
    }
    
    private void init_Students(){
        ArrayList<String[]> list = csv.readCSV("src\\database\\Students\\student.txt");
        
        for(int i=0; i<list.size();i++){
            
            cct.Create_Students(list.get(i));    
        }
    }
    
}
