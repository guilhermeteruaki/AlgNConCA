/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 * Code from material in class
 * The queue stores STRING elements so for this reason we will only store ID 
 * 
 * @author guilh
 */

public class MyOwnQueue implements ArrayQueue{
    
    private String [] data;
    private int capacity;
    private int queueSize;
    private int first;//pointer of the first element (index) --front
    private int last;//pointer of the last element (index) --back
    
    public MyOwnQueue (){
        this.capacity=10;
        this.data = new String[capacity];
        this.queueSize=0;
        //both pointers (first and last) should be outside the array, because 
        //this one is empty, and there is no first or last element yet
        this.last= -1; 
        this.first= -1;
    }
    
    @Override
    public boolean Enqueue(String newElement) {
       //changed the code for queue to automatically increase when array size reaches its limit
        if(queueSize>=capacity){
            
            this.capacity +=10;
            String[] temp= new String[capacity];
            System.arraycopy(data, first, temp, first, queueSize);
            data=temp;
                                  
        }       
        //if the array is empty, we need to move the front pointer
        if(first==-1){
            first++;            
        }
        
        last++; //We move the last pointer one position
        data[last]=newElement; //we allocate the new element in the new-last position
        queueSize++;//we increase the queue size
        return true;
    }

   
    @Override
    public String Dequeue() {
        //checks if queue is empty (works for both approaches)
        if(queueSize==0){
            return null;            
        }
        
        
        if(queueSize==1){
            String elementReturn = data[first];
            first--;
            last--;
            queueSize--;
            return elementReturn;
        }
        
        //Save the element in one variable (works for both approaches)
        String elementReturn = data[first];
                
        
        for (int i = 0; i < queueSize; i++) {
            if (i+1 <= queueSize-1) {
                data[i] = data[i + 1];
            }
        }
        last--;
        queueSize--;
        return elementReturn;
    }

    @Override
    public String First() {
        //works with both approaches
        if(queueSize==0){
        //only works with approach 1    
        //if(first<0){
            return null;            
        }
        return data[first];
        
    }

    @Override
    public String Last() {        
        //works with both approaches 
        if(queueSize==0){
        //if(first<0){
            return null;            
        }
        return data[last];
        
    }

    @Override
    public int size() {
        return queueSize;
    }

    @Override
    public boolean isEmpty() {               
        return  queueSize==0;
    }
    
    @Override
    public String toString(){
        String toReturn = "[ ";
        
       for(int i = 0; i <= last; i++){
            
            toReturn+=data[i]+ ", ";            
        }
        
        toReturn+= " ]";
        
        return toReturn;
    }
    
    /**
     * 
     * @return the queue as an array without empty spots
     */
    public String[] get_Full_Queue(){
       String[] returnArray = new String[queueSize];
        for (int i=0; i<=last; i++){
            returnArray[i] = data[i];
            }
        
        return returnArray;
    }
}
