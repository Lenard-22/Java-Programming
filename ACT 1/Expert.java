/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg1;

/**
 *
 * @author Loq
 */
public class Expert {
    public static void main(String[] args) {
        byte maxByte = 127;
        maxByte++;
        System.out.println("Overflowed byte: " + maxByte);

        String str1 = new String("Try");
        String str2 = new String("Try");
        String str3 = "Try";

        
        System.out.println("str1 == str2: " + (str1 == str2)); /* the result is false as the operator "==" only check
        if the two variables are decleared in the same memory address. As I use the New keyword, this force
        JVM to create another memory slot */
        System.out.println("str1.equals(str2): " + str1.equals(str2));/* The result is True as the keyword 
        .equals() only check if ther both contains excact character, as both of them have the word
        "Try" the output is true */
        System.out.println("str1 == str3: " + (str1 == str3));/*
        same with string 1 and 2 even though I dont use the new keywords on str3 the output is still false 
        as they are not in the same memory 
        */
        System.out.println("str1.equals(str3): " + str1.equals(str3)); /*
        this output is true same also with string 1 and 2 they only check if they consist the excact word as I use the
        .equal() code
        */

        
        int[] originalArray = {1, 2, 3};
        int[] sharedReference = originalArray;
        
        sharedReference[0] = 99;
        
        System.out.println("originalArray[0]: " + originalArray[0]);
        System.out.println("sharedReference[0]: " + sharedReference[0]);
    }
}
