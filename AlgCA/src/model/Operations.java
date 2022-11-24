/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author dvsdo
 */
public class Operations {
    Books books;
    
    public int countRows(File file){
        int total=0;
        try {
            FileReader read = new FileReader(file);
            BufferedReader bf = new BufferedReader(read);
            String row;
            row = bf.readLine();
            int rows = 0;
            while(true) {
                row = bf.readLine();
                if(row==null)
                    break;
                rows++;
            }
            total=rows;
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
    
}
