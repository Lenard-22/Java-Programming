/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg3;

/**
 *
 * @author Loq
 */
public class Advance {
    public static void main(String[] args) {
       
        String correctUsername = "Lenard22";
        String correctPassword = "123456";
        boolean Locked = true; 

        
        String Username = "Lenard22";
        String Password = "123456";

       
        if (Username.equals(correctUsername)) {

           
            if (Password.equals(correctPassword)) {

               
                if (!Locked) {
                    System.out.println(" Welcome back");
                } else {
                    System.out.println(" Account is locked.");
                }

            } else {
                System.out.println("Incorrect password.");
            }

        } else {
            System.out.println("Username does not exist.");
        }
    }
}
