/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author Loq
 */
import java.util.Arrays;

public class Advance {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};
        
     
        int target = 90;
        int foundIndex = -1; 

      
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break; 
            }
        }


        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }

        System.out.println("\n  ");
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

       
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));
           /*
             sorting the copy rather than the original really matters because if you will sort the original iw
             will possibly change the index of the original records. Example in original the index of 90 is in index 3 
             while the sorted array it will change it to index 5 
           */
    }
}
