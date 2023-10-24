/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */

import java.util.List;

public class MenuHandler {

    public static int displayMainMenu() {
        System.out.println("Welcome to Virtual Pet Game!");
        System.out.println("1. Choose from existing pets");
        System.out.println("2. Create a new pet");
        return InputValidator.getUserChoice("Enter your choice: ", 1, 2);
    }

    public static int displayPetSelectionMenu(List<Animal> existingPets) {
        System.out.println("Select a pet to play with:");
        int index = 1;
        for (Animal pet : existingPets) {
            System.out.println(index + ". " + pet.getName() + " (" + pet.getClass().getSimpleName() + ")");
            index++;
        }
        return InputValidator.getUserChoice("Enter your choice: ", 1, existingPets.size());
    }

    public static int displayPetTypeSelectionMenu() {
        System.out.println("Select a pet type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        return InputValidator.getUserChoice("Enter your choice: ", 1, 2);
    }

    public static String getPetName() {
        return InputValidator.getValidStringInput("Enter a name for your pet: ");
    }
}
