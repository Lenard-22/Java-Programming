/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg3;

/**
 *
 * @author Loq
 */
public class Expert {
    public static void main(String[] args) {
        
        String correctUsername = "ATM";
        int correctPin = 1365;
        double balance = 5000.0;

        String inputUsername = "ATM";
        int inputPin = 1236; 
        double withdrawalAmount = 1200.0;

        
        if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin) {

               
                String accountTier = "";
                double dailyLimit = 0.0;

                if (balance >= 5000.0) {
                    accountTier = "Platinum";
                    dailyLimit = 2000.0;
                } else if (balance >= 3000.0) {
                    accountTier = "Gold";
                    dailyLimit = 1500.0;
                } else if (balance >= 2000.0) {
                    accountTier = "Silver";
                    dailyLimit = 1000.0;
                } else if (balance >= 1000.0) {
                    accountTier = "Bronze";
                    dailyLimit = 500.0;
                } else {
                    accountTier = "Basic";
                    dailyLimit = 200.0;
                }

                
                double feeRate = 0.0;
                switch (accountTier) {
                    case "Platinum":
                        feeRate = 0.00; // 0% fee
                        break;
                    case "Gold":
                        feeRate = 0.01; // 1% fee
                        break;
                    case "Silver":
                        feeRate = 0.02; // 2% fee
                        break;
                    case "Bronze":
                        feeRate = 0.03; // 3% fee
                        break;
                    default:
                        feeRate = 0.05; // 5% fee
                        break;
                }

                double feeAmount = withdrawalAmount * feeRate;
                double totalDeduction = withdrawalAmount + feeAmount;

               
                if (withdrawalAmount <= dailyLimit) {
                    if (totalDeduction <= balance) {
                        balance -= totalDeduction;
                        System.out.println("TRANSACTION APPROVED!");
                        System.out.println("Account Tier: " + accountTier);
                        System.out.println("Withdrawn: $" + withdrawalAmount);
                        System.out.println("Fee Charged: $" + feeAmount);
                        System.out.println("Remaining Balance: $" + balance);
                    } else {
                        System.out.println("DENIED: Insufficient balance to cover withdrawal + fee.");
                    }
                } else {
                    System.out.println("DENIED: Requested amount ($" + withdrawalAmount + 
                                       ") exceeds daily limit of $" + dailyLimit + " for " + accountTier + " tier.");
                }

            } else {
                System.out.println("DENIED: Incorrect 4-digit PIN.");
            }
        } else {
            System.out.println("DENIED: Invalid Username.");
        }
    }
            
        
    }

