/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */

import java.util.Scanner;

public class InputValidator {
    private static Scanner scanner = new Scanner(System.in);
    
    //Private constructor to prevent instantiation
    private InputValidator() {
    }
    
    //Checks if input is integer and within range
    public static int getUserChoice(String prompt, int min, int max) {
        int choice = 0;
        boolean validInput = false;
        
        while(!validInput) {
            System.out.println(prompt);
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please choose between " 
                            + min +  " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number "
                        + "between " + min + " and " + max + ".");
            }
        }
        return choice;
    }
    
    //Checks if the input is a valid string
    public static String getValidStringInput(String prompt) {
        String userInput = "";

        while (userInput.isEmpty()) {
            System.out.print(prompt);
            userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid string.");
            }
        }

        return userInput;
    }
}
