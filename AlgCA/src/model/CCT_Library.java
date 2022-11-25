/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import model.*;

/**
 *
 * @author guilh
 * 
 * This Is the CCT Library
 */
public class CCT_Library {
    
    // list of all books and students, needs to be static to be the same in all instances of the class
    private static HashMap<String,Books> All_Books = new HashMap<>();
    private static HashMap<String,Books> All_Students = new HashMap<>();
    
    /**
     * Add a book to all books list
     * @param id
     * @param book 
     */
    public void add_Book_to_Library(String id, Books book){
        All_Books.put(id,book);
    }
    
    /**
     * print test
     */
    public void PrintAllBooks(){
        All_Books.forEach((Key, Value)->{ 
        System.out.println(Key +" "+Value);
        });
    }
    
    /**
     * print test
     */
    public void PrintAllStudents(){
        All_Students.forEach((Key, Value)->{ 
        System.out.println(Key +" "+Value);
        });
    }
    
    /**
     * Creates new books to the library and add to all book list 
     * @param book 
     */
    public void Create_Books(String[] book){
                
        Books bk = new Books(book[0], book[3], book[1], book[2], book[4]);
        add_Book_to_Library(bk.getId(), bk);
        
        
    }
    
}
