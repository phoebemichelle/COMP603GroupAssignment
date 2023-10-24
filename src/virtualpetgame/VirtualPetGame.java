/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoebe
 */
import java.util.List;

public class VirtualPetGame {

    public static void main(String[] args) {
        DatabaseSetup dbManager = new DatabaseSetup();
        List<Animal> existingPets = dbManager.loadExistingPets();
        GameplayManager gameManager = new GameplayManager(dbManager);

        //Choose from existing pets or create new
        int loadChoice = MenuHandler.displayMainMenu();

        if (loadChoice == 1 && !existingPets.isEmpty()) {
            int petChoice = MenuHandler.displayPetSelectionMenu(existingPets);
            gameManager.setPet(existingPets.get(petChoice - 1));
        } else {
            int petType = MenuHandler.displayPetTypeSelectionMenu();
            String name = MenuHandler.getPetName();
            gameManager.createAndSetPet(petType, name);
        }

        gameManager.playGame();
        dbManager.closeConnections();
    }
}
