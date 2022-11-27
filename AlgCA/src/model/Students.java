/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;



/**
 *
 * @author guilh
 */
public class Students {
    
    private int id;
    private String name;
    private String nationality;
    private ArrayList<String> list_Of_borrowed_Books = new ArrayList<>();

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
        String csv[] = new String[3+list_Of_borrowed_Books.size()];
        csv[0] = Integer.toString(id);
        csv[1] = name;
        csv[2] = nationality;
        if(!list_Of_borrowed_Books.isEmpty()){
            for(int i=3; i<list_Of_borrowed_Books.size()+3; i++){
                csv[i] = list_Of_borrowed_Books.get(i-3);
            }
            
        }    
        return csv;
    }
    
    public void addBookToList(String bookID){
        this.list_Of_borrowed_Books.add(bookID);
    }
    
    public ArrayList get_List_of_Borrowed_Books(){
        return list_Of_borrowed_Books;
    }
    
      
}
