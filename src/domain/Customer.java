/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author boss
 */
public class Customer {
    private int id;
    private boolean isNew;
    private double total;
    
    public Customer(){
        this(1, true, 1000);
    }
    
    public Customer(int id, boolean isNew, double total){
        this.id = id;
        this.isNew = isNew;
        this.total = total;
    }
    
    public void displayCustomerInfo(){
        System.out.println("Id of client is: " + id
        + "\n Is he new? - " + isNew +
        "\n Total purchase are: " + total 
        );
    }
    
    //Getters
    public int getId() {
        return id;
    }
    public boolean isIsNew() {
        return isNew;
    }
    public double getTotal() {
        return total;
    }
    
    //Setters
    public void setIsNew(boolean isNew) {
            this.isNew = isNew;
    }
    public void setTotal(double total) {
        if(total > 0)
            this.total = total;
        else {
            System.out.println("You cant do this");
            this.total = 0;
        }
        
    }
    public void setId(int id) {
        if(id > 0)
            this.id = id;
        else {
            System.out.println("You cant do this");
            this.id = 0;
        }
        
    }
}
