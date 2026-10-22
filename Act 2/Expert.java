/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Loq
 */
public class Expert {
public static void main(String[] args) {

       
        int a = 5;
        int b = 2;

        // PREDICTED RESULT: 9
        int result1 = a++ + --b * 4;

        System.out.println("Expression 1 Actual Result: " + result1);


        
        int x = 10;
        int y = 3;

        // PREDICTED RESULT: 11
        int result2 = ((++x + 5) * --y);

        System.out.println("Expression 2 Actual Result: " + result2);

      

      
        int m = 4;
        int n = 8;

        // PREDICTED RESULT: 9
        int result3 = ++m * 2 + --n / 2;

        System.out.println("Expression 3 Actual Result: " + result3);
    }
}
        
       

