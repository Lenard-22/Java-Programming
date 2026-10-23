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

public class EXPERT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[][] warehouse = {
            {50, 12, -1}, 
            {8, -1, 45},  
            {-1, 3, 100}  
        };
        
        int menuChoice;

      
        do {
            System.out.println("\n    Warehouse System ");
            System.out.println("1. Calculate Total Inventory");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Restock Item");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            menuChoice = scanner.nextInt();

            if (menuChoice == 1) {
                calculateTotal(warehouse);
            } else if (menuChoice == 2) {
                findCriticalShelf(warehouse);
            } else if (menuChoice == 3) {
                restockItem(scanner);
            }

        } while (menuChoice != 4);
        
        System.out.println("System exited.");
    }

    public static void calculateTotal(int[][] warehouse) {
        int totalItems = 0;
        
        // Requirement 3: for loop with continue to total inventory while skipping damaged shelves[cite: 10]
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] == -1) {
                    continue; // Skips the damaged shelf so -1 isn't subtracted from the total
                }
                totalItems += warehouse[i][j];
            }
        }
        System.out.println("-> Total items in warehouse: " + totalItems);
    }

    public static void findCriticalShelf(int[][] warehouse) {
        boolean found = false;
        
        // Requirement 4a: Nested loops with break to find the FIRST critically low shelf (< 10 items)[cite: 10]
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] != -1 && warehouse[i][j] < 10) {
                    System.out.println("-> ALERT: Critical shelf found at Row " + i + ", Col " + j + " (Count: " + warehouse[i][j] + ")");
                    found = true;
                    break; // Stops the inner loop immediately upon finding the first match
                }
            }
            if (found) {
                break; // Stops the outer loop so we don't keep searching
            }
        }
        if (!found) {
            System.out.println("-> No critically low shelves found.");
        }
    }

    public static void restockItem(Scanner scanner) {
        // Requirement 4b: while loop plus return to simulate restocking with input validation[cite: 10]
        while (true) {
            System.out.print("Enter amount to restock (must be > 0, or enter 0 to cancel): ");
            int restockAmount = scanner.nextInt();

            if (restockAmount == 0) {
                System.out.println("-> Restock cancelled.");
                return; // Exits the entire method immediately and goes back to the main menu
            } else if (restockAmount > 0) {
                System.out.println("-> Successfully restocked " + restockAmount + " items!");
                return; // Exits the entire method upon successful validation
            } else {
                System.out.println("-> Error: Invalid amount. Try again.");
                // Loop continues and asks again because we didn't return or break
            }
        }
    }
}
