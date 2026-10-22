/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Loq
 */
public class Advance {
        
        public static void main(String[] args) {
        

       
        double balance = 1000.0;
        System.out.println(" balance: " + balance);
        
       
        balance += 500.0; 
        System.out.println("Balance after deposit of 500 (+=): " + balance);
        
        balance *= 1.05;  
        System.out.println("Balance after interest og 5% applied (*=): " + balance);
        
        balance += 250.0; 
        System.out.println("Balance after deposit of 250 (+=): " + balance);
        
        
        
        
        System.out.println("\n Increment Method ");
        
        int count = 10;
        
            System.out.println(" the base value is " + count++ +" but after increment is below");
        System.out.println("after Increment " + count); 

        /*
        the increment is different from assignment operator. Increment is a defaut add of 1.
        but assigment operator stores the value and then add or multiplt to the other given number. Its like 
        increment but you assign the numebr to assign or to multiply
        */
              
             
        
       
    }
}

