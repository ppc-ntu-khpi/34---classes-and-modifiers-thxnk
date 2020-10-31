
package domain.test;

import domain.Customer;
public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        System.out.println("\n");
        customer.setId(3);
        customer.setIsNew(false);
        customer.setTotal(12032);
        customer.displayCustomerInfo();
    }
}
