/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algca;

import Utilities.Library_database_saver;
import view.Menu;
import Utilities.Library_initializer;


/**
 *
 * @author guilh
 */
public class AlgCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        Library_initializer init = new Library_initializer();
        Library_database_saver save = new Library_database_saver();
        
        init.Library_initializer();
        menu.mainMenu();
        save.Library_database_saver();
    }
    
}
