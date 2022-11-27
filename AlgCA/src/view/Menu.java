/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Utilities.*;
import controler.Library_Functions;

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
                                     8- Add Student to Book waiting list
                                     9- Show waiting list for a specific book
                                     999- Exit
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
                    String st = util.askForString("Please Provide the EXACT ID of the Student");
                    cct_F.add_To_Waiting_List(bk, st);
                    
                    break;
                    
                case 9:
                    userStrChoice = util.askForString("Please Provide the EXACT ID of the book" );
                    System.out.println("The Id of the students in the waiting list of the book: " +
                             (((Books)cct.getAllBooks().get(userStrChoice)).getTitle()));
                    for (int i=0; i<( (((Books)cct.getAllBooks().get(userStrChoice)).get_Waiting_List())).length;i++){
                       System.out.println((((Books)cct.getAllBooks().get(userStrChoice)).get_Waiting_List())[i]);
                   }
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
