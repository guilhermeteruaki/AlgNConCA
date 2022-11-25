/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Books {
    private String id;
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String genre;
    private boolean rent_status=false;
    
//    public Books() {
//        this.id = "";
//        this.title = "";
//        this.authorFirstName = "";
//        this.authorLastName = "";
//        this.genre = "";
//    }
    
    public Books (String id, String title, String authorFirstName, String authorLastName, String genre) {
        this.id = id;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
    }
    
    public void rent_book(boolean rented){
        this.rent_status = rented;
    }
    public String getId() {
        return id;
    }
    
    public boolean is_rented(){
        return rent_status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
}
