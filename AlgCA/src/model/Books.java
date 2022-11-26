/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;




public class Books {
    private String id;
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String genre;
    private boolean rent_status=false;
    

    
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

    public String[] getBookArray(){
        String csv[] = new String[6];
        csv[0] = id;
        csv[1] = authorFirstName;
        csv[2] = authorLastName;
        csv[3] = title;
        csv[4] = genre;
        csv[5] = String.valueOf(rent_status);
        return csv;
    }
}    
