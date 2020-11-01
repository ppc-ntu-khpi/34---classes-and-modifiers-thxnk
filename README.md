# На 5

## code of Customer: 
``` java
package domain;

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
```
![](https://github.com/ppc-ntu-khpi/34---classes-and-modifiers-thxnk/blob/main/Solution/Done.png?raw=true)


## Adnvanced: 

![](https://github.com/ppc-ntu-khpi/34---classes-and-modifiers-thxnk/blob/main/Solution/advanced.png?raw=true)



