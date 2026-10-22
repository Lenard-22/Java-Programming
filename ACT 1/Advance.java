/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg1;

/**
 *
 * @author Loq
 */
public class Advance {
    public static void main(String[] args) {
        double totalCentimeters = 254.5;

        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;

        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        int intValue = 50;
        double implicitDouble = intValue;
        System.out.println("Implicit Widening: " + implicitDouble);

        double doubleValue = 99.99;
        int explicitInt = (int) doubleValue;
        System.out.println("Explicit Narrowing: " + explicitInt);
    }
}
