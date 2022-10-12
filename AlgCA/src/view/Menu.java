/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Utilities.Utilities;


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
        while (exitMenu == false){
            userChoice = util.askForInt("""
                                     ************* MAIN MENU ***********
                                     Please select one of these options:
                                     1- aaaaaaaaaaa
                                     2- bbbbbbbbbbb
                                     3- ccccccccccccccccc
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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
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
                    exitMenu=true;
                            
                    break;
                default:
                   System.out.print("That was not a valid option, please try again\n");
                          
            } 
        }
    }
    
        
}
