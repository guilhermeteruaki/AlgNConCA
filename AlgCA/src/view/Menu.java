/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Utilities.*;
import controler.Library_Functions;
import java.util.ArrayList;

import model.*;


/**
 *
 * @author guilh
 */
public class Menu {
    private boolean exitMenu;
    int userChoice; 
    Utilities util = new Utilities();
    public Menu() {
    }
    
    
  
    public void mainMenu(){
        CCT_Library cct = new CCT_Library();
        Library_Functions cct_F = new Library_Functions();
        exitMenu=false;
        String userStrChoice;
        while (exitMenu == false){
            userChoice = util.askForInt("""
                                        Welcome to CCT library app!
                                     ************* MAIN MENU ***********
                                     Please select one of these options:
                                     1- List All Books
                                     2- List All Students
                                     3- Search a Book by Title
                                     4- Search Book By Id
                                     5- Search Book by Author
                                     6- Student by Name
                                     7- Search Student by ID
                                     8- Rent a Book to Queue
                                     9- Show waiting list for a specific book
                                     10- All Books by Title alphabetical order
                                     11- All Books by Author alphabetical order
                                     12- All Students by Name alphabetical order
                                     13- All Students by ID order
                                     14- Get list of Books rented by a Student
                                     15- Get next Student in queue
                                     16- Rent Book to Student 
                                     17- Return a book rented by a Student
                                        
                                     999- Save and Exit
                                     *************************************
                                     """);
            
            
            switch(userChoice){
                case 1:
                    cct_F.print_All_Books_Titles(cct.getAllBooks());
                    break;
                case 2:
                   cct_F.print_All_Students_Names(cct.getAllStudents());
                    break;
                case 3:
                    String Book_name = util.askForString("Please Insert Title of the Book");
                    cct_F.search_Book_By_Name(cct.getAllBooks(), Book_name);
                    break;
                case 4:
                    String Book_id = util.askForString("Please Insert ID of the Book");
                    cct_F.search_Book_By_ID(cct.getAllBooks(), Book_id);
                    break;
                case 5:
                   String Book_Author = util.askForString("Please Insert Author of the Book");
                    cct_F.search_Book_By_Author(cct.getAllBooks(), Book_Author);
                    break;
                case 6:
                    String Student_name = util.askForString("Please Insert name of the Student");
                    cct_F.search_Student_By_Name(cct.getAllStudents(), Student_name);
                      
                    break;
                case 7:
                    String Student_id = util.askForString("Please Insert ID of the Student");
                    cct_F.search_Student_By_ID(cct.getAllStudents(), Student_id);
                      
                    break;                            
                case 8:   
                    String bk = util.askForString("Please Provide the EXACT ID of the book");
                    cct_F.lend_Book_To_Queue(bk);
                    
                    break;
                    
                case 9:
                    userStrChoice = util.askForString("Please Provide the EXACT ID of the book" );
                    System.out.println("The Id of the students in the waiting list of the book: " +
                             (((Books)cct.getAllBooks().get(userStrChoice)).getTitle()));
                    for (int i=0; i<( (((Books)cct.getAllBooks().get(userStrChoice)).get_Waiting_List())).length;i++){
                       System.out.println((((Books)cct.getAllBooks().get(userStrChoice)).get_Waiting_List())[i]);
                   }
                    break;
                    
                case 10:
                    
                    System.out.println("Printing Books Title Alphabetical order");
                    cct_F.order_Books_Name(cct.getAllBooks());
                    break;
                    
                case 11:
                    
                    System.out.println("Printing Books Title Alphabetical order");
                    cct_F.order_Books_Author(cct.getAllBooks());
                    break;
                
                case 12:
                    
                    System.out.println("Printing Students by Name Alphabetical order");
                    cct_F.order_Students_Name(cct.getAllStudents());
                    break;
                
                case 13:
                    
                    System.out.println("Printing Students by ID order");
                    cct_F.order_Students_Id(cct.getAllStudents());
                    break;
                
                case 14:
                    int _id = util.askForInt("Please Insert ID of the Student");
                    cct_F.list_Of_Book_Rented(_id);
                    
                    break;
                    
                case 15:
                    userStrChoice = util.askForString("Please Provide the EXACT ID of the book" );
                    ((Books)cct.getAllBooks().get(userStrChoice)).get_next_in_queue();
                    break;
                    
                case 16:
                    _id = util.askForInt("Please Insert ID of the Student");
                    userStrChoice = util.askForString("Please Provide the EXACT ID of the book" );
                    cct_F.rent_Book_To_Student(_id, userStrChoice);
                    
                    break;
                    
                case 17:
                    _id = util.askForInt("Please Insert ID of the Student");
                    ((Students)cct.getAllStudents().get(_id)).returnBook();
                    
                    break;
                        
                case 999:
                    System.out.println("Thank You for using the app. Please come back again !");
                    exitMenu=true;
                            
                    break;
                default:
                   System.out.print("That was not a valid option, please try again\n");
                          
            } 
        }
    }
    
        
}
