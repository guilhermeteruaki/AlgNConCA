/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author guilh
 */
public class Students {
    
    private int id;
    private String name;
    private String nationality;

    public Students(int id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
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
    
    public String[] getStudentArray(){
        String csv[] = new String[3];
        csv[0] = Integer.toString(id);
        csv[1] = name;
        csv[2] = nationality;
       
        return csv;
    }
    
    
      
}
