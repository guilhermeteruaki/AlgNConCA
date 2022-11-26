/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import controler.CSV_Control;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author guilh
 */
public class Library_database_saver {
    
    CCT_Library cct = new CCT_Library();
    CSV_Control csv = new CSV_Control();
        
    public void Library_database_saver(){
    Save_Books();
    Save_Students();
                
    }
    
    private void Save_Books(){
        
        ArrayList<String[]> arrayOfBooks = new ArrayList<>();
        
        cct.getAllBooks().forEach((Key, Value)->{ 
                     arrayOfBooks.add(((Books)Value).getBookArray());
                });
        
        csv.convertToCSV(arrayOfBooks, "src\\database\\Books\\book.txt");
    }
    
    private void Save_Students(){
        
        ArrayList<String[]> arrayOfStudents = new ArrayList<>();
        
        cct.getAllStudents().forEach((Key, Value)->{ 
                     arrayOfStudents.add(((Students)Value).getStudentArray());
                });
        
        csv.convertToCSV(arrayOfStudents, "src\\database\\Students\\student.txt");
    }
    
  
    
}
