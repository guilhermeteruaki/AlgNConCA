/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.util.HashMap;
import model.*;
import model.CCT_Library;



/**
 *
 * @author guilh
 */
public class Library_Functions {
    CCT_Library cct= new CCT_Library();
     
    public void Library_Functions(){
        
    }
    
    //for each from https://www.programiz.com/java-programming/library/hashmap/foreach#:~:text=the%20forEach()%20method%20performs,the%20keys%20and%20reduced%20values
    public void print_All_Books_Titles(HashMap books){
       
        books.forEach((Key, Value)->{ 
        System.out.println(((Books)Value).getTitle());
        });
    
    }
    
    public void print_All_Students_Names(HashMap Students){
       
        Students.forEach((Key, Value)->{ 
        System.out.println(((Students)Value).getName());
        });
    
    }
    
    public void search_Book_By_Name(HashMap books, String name){
    
        books.forEach((Key, Value)->{
            if(((Books)Value).getTitle().toLowerCase().contains(name.toLowerCase())){
                System.out.println(((Books)Value).getTitle());
            }
        }); 
    }
    
    public void search_Book_By_Author(HashMap books, String name){
    
        books.forEach((Key, Value)->{
            if(((Books)Value).getAuthorFirstName().toLowerCase().contains(name.toLowerCase()) ||
                    ((Books)Value).getAuthorLastName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(((Books)Value).getTitle() + " Writem by: " + ((Books)Value).getAuthorFirstName()
                      +" "  + ((Books)Value).getAuthorLastName());
            }
        }); 
    }
 
    public void search_Book_By_ID(HashMap book, String id){
        book.forEach((Key, Value)->{
            if(((Books)Value).getId().toLowerCase().contains(id.toLowerCase())){
                System.out.println(((Books)Value).getTitle() + " Book ID:" + Key);
            }
        });
        
    }    
    
     public void search_Student_By_Name(HashMap student, String name){
    
        student.forEach((Key, Value)->{
            if(((Students)Value).getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(((Students)Value).getName());
            }
        }); 
    }
    
     public void search_Student_By_ID(HashMap student, String id){
    
        student.forEach((Key, Value)->{
            if(Integer.toString(    ((Students)Value).getId())    .toLowerCase().contains(id.toLowerCase())){
                System.out.println(((Students)Value).getName() + " Student ID: " + Key );
            }
        }); 
    }
     
     public void add_To_Waiting_List(String bookId, String StudentID){
        ((Books)cct.getAllBooks().get(bookId)).add_Student_To_Queue(StudentID);
         
     }
    
    public void order_Books_Name (HashMap books){
        
        for (int i=0; i < books.size() -1; i++) {
            
            boolean order = true;
            
            for (int j=0; j < books.size() -1 -i; j++) {
                
                if(books[j].getTitle().compareToIgnoreCase(books[j + 1].getTitle()) > 0) {
                    Books swap = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = swap;
                    order = false;
                }
            }
            
            if (order)
                break;
        }
    }
    
}
