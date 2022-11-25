/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Utilities.Utilities;
import model.Books;
import model.Students;
import controler.CSV_Control;
import java.util.ArrayList;


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
        exitMenu=false;
        Books[] books;
        Books book = new Books();
        books = book.readBooks("MOCK_DATA.csv");
        
        Students[] students;
        Students student = new Students();
        students = student.readStudents("student.txt");
        
        while (exitMenu == false){
            userChoice = util.askForInt("""
                                        Welcome to CCT library app!
                                     ************* MAIN MENU ***********
                                     Please select one of these options:
                                     1- List All Books
                                     2- List All Students
                                     3- test
                                     4- ddddddddddddd
                                     5- eeeeeeeeee
                                     6- ffffffffffffffff
                                     7- gggggggggggggggggggg
                                     8- hhhhhhhhhhhhhhhhh  
                                     999- Exit
                                     *************************************
                                     """);
            
            
            switch(userChoice){
                case 1:
                    book.listBooks(books);
                    break;
                case 2:
                    student.listingStudents(students);
                    break;
                case 3:
                    CSV_Control csv = new CSV_Control();
                    
                    ArrayList<String[]> file = csv.readCSV("src\\database\\Books\\MOCK_DATA.csv");
                    
                    for(int i=0; i<file.size(); i++){
                        
                        System.out.println(file.get(i)[1]);
                    } 
                    break;
                case 4:
                    break;
                case 5:
                   
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;                            
                case 8:   
                    
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
