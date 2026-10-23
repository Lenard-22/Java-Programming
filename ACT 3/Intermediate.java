/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg3;

/**
 *
 * @author Loq
 */
public class Intermediate {
    

    public static void main(String[] args) {
      
        
        double Amount = 3500.00;
        double Discount = 0.0;
        String Percent = "";

       
        if (Amount >= 3000.0) {
            Percent = "15% Discount Tier";
            Discount = 0.15;
        } else if (Amount >= 1500.0) {
            Percent = "10% Discount Tier";
            Discount = 0.10;
        } else if (Amount >= 1000.0) {
            Percent = "5% Discount Tier";
            Discount = 0.05;
        } else {
            Percent = "0% Discount Tier (No Discount)";
            Discount = 0.00;
        }

        double Total = Amount * (1.0 - Discount);

        System.out.println("Purchase Amount:        " + Amount);
        System.out.println("Assigned Discount Tier: " + Discount);
        System.out.println("Final Discounted Price: " + Total);
    }
}