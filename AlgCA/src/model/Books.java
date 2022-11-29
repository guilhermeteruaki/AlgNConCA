/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Utilities.MyOwnQueue;




public class Books {
    private String id;
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String genre;
    private boolean rent_status=false;
    private MyOwnQueue student_queue=new MyOwnQueue();
    
    

    
    public Books (String id, String title, String authorFirstName, String authorLastName, String genre, String rentstat) {
        this.id = id;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.rent_status = Boolean.parseBoolean(rentstat);
    }
    
    public void set_rent_book(boolean rented){
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
        String csv[] = new String[6+student_queue.size()];
        csv[0] = id;
        csv[1] = authorFirstName;
        csv[2] = authorLastName;
        csv[3] = title;
        csv[4] = genre;
        csv[5] = String.valueOf(rent_status);
        if(!student_queue.isEmpty()){
            String[] arrayQueue = new String[student_queue.size()];
            arrayQueue = student_queue.get_Full_Queue();
            for(int i=6; i<arrayQueue.length+6; i++){
                csv[i] = arrayQueue[i-6];
            }
        }
        return csv;
    }
    
    public void add_Student_To_Queue(String id){
    this.student_queue.Enqueue(id);
    }
   
    /**
     * rent the book to the next in Queue
     * @return return the Id of the student to which book was rented
    */
    public String Rent_To_Queue(){
        set_rent_book(true);
        String r = this.student_queue.First();
        this.student_queue.Dequeue();
        return r;
    }
    
   public void get_next_in_queue(){
       System.out.println(student_queue.First());
   }
    
    public String[] get_Waiting_List(){
        return this.student_queue.get_Full_Queue();
    } 
}    
