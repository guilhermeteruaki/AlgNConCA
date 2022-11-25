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
    private static HashMap<Integer,Students> All_Students = new HashMap<>();
    
    /**
     * Add a book to all books list
     * @param id
     * @param book 
     */
    public void add_Book_to_Library(String id, Books book){
        All_Books.put(id,book);
    }
    
    public void add_Student_to_Library(Integer id, Students student){
        All_Students.put(id,student);
    }
    /**
     * print test
     */
    //for each from https://www.programiz.com/java-programming/library/hashmap/foreach#:~:text=the%20forEach()%20method%20performs,the%20keys%20and%20reduced%20values
    
    public void PrintAllBooks(){ 
        All_Books.forEach((Key, Value)->{ 
        System.out.println(Key +" "+Value.getTitle());
        });
    }
    
    /**
     * print test
     */
    public void PrintAllStudents(){
        All_Students.forEach((Key, Value)->{ 
        System.out.println(Key +" "+Value.getName());
        });
    }
    
    /**
     * Creates new books to the library and add to all book list 
     * @param book 
     */
    public void Create_Books(String[] book){
                
        Books bk = new Books(book[0], book[3], book[1], book[2], book[4]);
        add_Book_to_Library(bk.getId(), bk);
        
        
    }public void Create_Students(String[] student){
                
        Students st = new Students(Integer.parseInt(student[0]), student[1], student[2]);
        add_Student_to_Library(st.getId(), st);
        
        
    }
    
}
