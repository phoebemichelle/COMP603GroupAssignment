/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoebe
 */

public class VirtualPetGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Virtual Pet Game!");
        GameplayManager gameManager = new GameplayManager();

        int choice = InputValidator.getUserChoice("Choose a pet type:\n1. Dog\n2. Cat\n3. Rabbit\nEnter your choice: ", 1, 3);
        String name = InputValidator.getValidStringInput("Enter a name for your pet: ");

        gameManager.createAndSetPet(choice, name);
        gameManager.playGame();
    }
    
    
}
