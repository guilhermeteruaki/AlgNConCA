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
    
    public Books() {
        this.id = "";
        this.title = "";
        this.authorFirstName = "";
        this.authorLastName = "";
        this.genre = "";
    }
    
    public Books (String id, String title, String authorFirstName, String authorLastName, String genre) {
        this.id = "";
        this.title = "";
        this.authorFirstName = "";
        this.authorLastName = "";
        this.genre = "";
    }

    public String getId() {
        return id;
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
    
    public Books[] readBooks (String fileName) {
        File file = new File(fileName);
        Books book;
        Books[] books;
        Operations function = new Operations();
        books = new Books[function.countRows(file)];
        
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bf = new BufferedReader(isr);
            String row;
            row = bf.readLine();
            int rows = 0;
            while (true) {
                row = bf.readLine();
                if (row == null)
                    break;
                String [] data = row.split(",");
                book = new Books();
                book.setId(data[0]);
                book.setTitle(data[1]);
                book.setAuthorFirstName(data[2]);
                book.setAuthorLastName(data[3]);
                book.setGenre(data[4]);
                books[rows] = book;
                rows++;
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
    
    public int listBooks(Books[] books) {
        int total = 0;
        System.out.println("Listing Books");
        for (Books book : books) {
            System.out.println("Title....:"+book.getTitle());
            System.out.println("Author...:"+ book.authorFirstName + " " + book.authorLastName);
            System.out.println("Genre....:"+ book.genre);
            System.out.println("----------------------------------");
            total++;
        }
        return total;
    }
}
