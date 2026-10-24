/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author Loq
 */
public class Basic {
    public static void main(String[] args) {
        
        String[] fave = {"Phone", "laptop", "Wallet", "T-shirts", "Perfume"};
        
        System.out.println("Total length of array is : " + fave.length + "\n" );

      
        for (int i = 0; i < fave.length; i++) {
            System.out.println("Favorithe things are : " + (i+1) + ": " + fave[i]);
            
            
        }
    }
}
