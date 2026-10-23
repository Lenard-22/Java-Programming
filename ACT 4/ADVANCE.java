/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg4;

/**
 *
 * @author Loq
 */

public class ADVANCE {
    public static void main(String[] args) {
        int size = 5;

        System.out.println(" Right Triangle Pattern ");
       
        for (int row = 1; row <= size; row++) {
            
            if (row == 4) {  
                continue; 
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("* ");

                if (col == row) {
                   
                    break; 
                }
            }
            System.out.println(); 
        }
    }
}/*
the break command is the one that prevents the code to overide. in column 1 it will print the * 
now on row 2 the command will be the if (col==row) so that in can create a triangle
*/
