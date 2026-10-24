/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author Loq
 */
public class Intermedieate {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};

        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        
        for (int score : scores) {
            sum += score; 
            
            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

       
        double average = (double) sum / scores.length;

        
        System.out.println("--- Class Statistics ---");
        System.out.println("Total Sum: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
