/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author guilh
 */
public class Students {
    
    private int id;
    private String name;
    private String nationality;

    public Students() {
        this.id = 0;
        this.name = "";
        this.nationality = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public Students[] readStudents(String fileName){
        File file = new File(fileName);
        Students student = new Students();
        Students[] students;
        Operations function = new Operations();
        students = new Students[function.countRows(file)];
        
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bf = new BufferedReader(isr);
            String row = bf.readLine();
            int rows = 0;
            
            while (true) {                
                row = bf.readLine();
                if (row == null)
                    break;
                String[] data = row.split(",");
                student = new Students();
                student.setId(Integer.parseInt(data[0]));
                student.setName(data[1]);
                student.setNationality(data[2]);
                students[rows] = student;
                rows++;
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    
    public int listingStudents(Students[] students){
        int total = 0;
        System.out.println("Listing Students");
        for (Students student : students) {
            System.out.println("ID.....:" + student.getId());
            System.out.println("Name...:" + student.getName());
            System.out.println("Nationality..:" + student.getNationality());
            System.out.println("------------------------------------");
            total++;
        }
        return total;
    }
    
}
