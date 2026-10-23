/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg4;

/**
 *
 * @author Loq
 */
import java.util.Scanner;
public class INTERMIDEIATE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int NUM;

        System.out.println("Enter numbers to sum : ");
        
        while (true) {
            NUM = input.nextInt();
            if (NUM == -1) {
                break; 
            }

            total += NUM;
        }

       
        System.out.println("Final total: " + total);
        
        
    }
}
