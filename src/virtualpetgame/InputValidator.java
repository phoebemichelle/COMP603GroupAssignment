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

    private static final Scanner scanner = new Scanner(System.in);
    //Constant for messages
    public static final String INVALID_CHOICE_MESSAGE = "Invalid choice. Please choose between %d and %d.";
    public static final String INVALID_INPUT_MESSAGE = "Invalid input. Please enter a valid number between %d and %d.";
    public static final String EMPTY_INPUT_MESSAGE = "Input cannot be empty. Please enter a valid string.";

    //Private constructor to prevent instantiation
    private InputValidator() {
    }

    //Checks if input is integer and within range
    public static int getUserChoice(String prompt, int min, int max) {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println(prompt);
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    validInput = true;
                } else {
                    System.out.println(String.format(INVALID_CHOICE_MESSAGE, min, max));
                }
            } catch (NumberFormatException e) {
                System.out.println(String.format(INVALID_INPUT_MESSAGE, min, max));

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
                System.out.println(EMPTY_INPUT_MESSAGE);
            }
        }

        return userInput;
    }
}
