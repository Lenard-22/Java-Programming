/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Loq
 */
public class Intermedieate {
    public static void main(String[] args) {
        
        
        double Grade = 95; 
        int absent = 5;      
        
        System.out.println("Student Average: " + Grade);
        System.out.println("Student Absences: " + absent);

        if ((Grade >= 75 && absent <= 3) || Grade >= 90) {
            System.out.println("Pass"); 
            System.out.println("You have grade more than 75 and absent less than 3 or have a Grade more than 90 regardless of absent");
        } else {
            System.out.println("Failed"); 
            System.out.println("You are failed either because you have Grade less than 75 or have more than 3 absent ");
        }    
        
        
    }
}
