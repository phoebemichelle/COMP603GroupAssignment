/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */
public class GameplayManager {
    private Animal pet;
    
    public void createAndSetPet(int choice, String name) {
        pet = PetFactory.createPet(choice, name);
    }
    
    public void playGame() {
        boolean continuePlaying = true;

        while (continuePlaying) {
            showCurrentNeeds(pet);

            System.out.println("1. Feed " + pet.getName() + " their favorite food.");
            System.out.println("2. Fill " + pet.getName() + "'s water bowl.");
            System.out.println("3. Play with " + pet.getName() + ".");
            System.out.println("4. Take " + pet.getName() + " for a walk.");
            System.out.println("5. Let " + pet.getName() + " get some sleep.");
            System.out.println("6. Take " + pet.getName() + " out to potty.");
            System.out.println("7. Give " + pet.getName() + " a bath.");
            System.out.println("8. Exit");

            int choice = InputValidator.getUserChoice("Choose an interaction: ", 1, 8);

            switch (choice) {
                //Feed pet
                case 1:
                    //Pet is full
                    if(pet.getHunger() > 50) {
                        System.out.println("Mmh, it seems like " + pet.getName() 
                                + " is too full to eat right now. Try again later.");
                        break;
                    }
                    pet.feed();
                    break;
                //Give water
                case 2:
                    //Pet is not thirsty
                    if(pet.getThirst() > 50) {
                        System.out.println("Mmh, it seems like " + pet.getName() 
                                + " is not thirsty to eat right now. Try again later.");
                        break;
                    }
                    pet.fillWaterBowl();
                    break;
                //Play with pet
                case 3:
                    //Pet is too tired
                    if(pet.getEnergy() < 20) {
                        System.out.println("Oh no! " + pet.getName() + " is too tired to play right now.");
                        System.out.println("Try letting " + pet.getName() + " get some rest first.");
                        break;
                    }
                    //Pet is too hungry
                    if(pet.getHunger() < 20) {
                        System.out.println("Oh no! " + pet.getName() + " is too hungry to play right now.");
                        System.out.println("Try feeding " + pet.getName() + " first.");
                        break;
                    }
                    //Pet needs to go potty
                    if(pet.getBladder() < 20) {
                        System.out.println(pet.getName() + " needs to go potty first before playing!");
                        break;
                    }
                    pet.play();
                    break;
                //Take pet for a walk
                case 4:
                    //Pet is too tired
                    if(pet.getEnergy() < 30) {
                        System.out.println("Oh no! " + pet.getName() + " is too tired to go out for a walk right now.");
                        System.out.println("Try letting " + pet.getName() + " get some rest first.");
                        break;
                    }
                    //Pet is too hungry
                    if(pet.getHunger() < 20) {
                        System.out.println("Oh no! " + pet.getName() + " is too hungry right now.");
                        System.out.println("Try feeding " + pet.getName() + " first.");
                        break;
                    }
                    //Pet needs to go potty
                    if(pet.getBladder() < 20) {
                        System.out.println(pet.getName() + " needs to go potty first!");
                        break;
                    }
                    pet.walk();
                    break;
                //Let pet sleep
                case 5:
                    //Pet is not tired
                    if(pet.getEnergy() > 40) {
                        System.out.println("Hmm, it seems like " + pet.getName() + " is not tired.");
                        break;
                    }
                    //Pet is too hungry
                    if(pet.getHunger() < 20) {
                        System.out.println("Oh no! " + pet.getName() + " is too hungry right now.");
                        System.out.println("Try feeding " + pet.getName() + " first.");
                        break;
                    }
                    //Pet needs to go potty
                    if(pet.getBladder() < 20) {
                        System.out.println(pet.getName() + " needs to go potty first!");
                        break;
                    }
                    pet.sleep();
                    break;
                //Take pet out to potty
                case 6:
                    //Pet doesn't need to go
                    if(pet.getBladder() > 50) {
                        System.out.println("Mmh, it seems like " + pet.getName() 
                                + " does not need to potty right now.");
                        break;
                    }
                    pet.potty();
                    break;
                case 7:
                    pet.bathe();
                    break;
                case 8:
                    continuePlaying = false;
                    break;
            }
        }

        System.out.println("Exiting the game. Thank you for playing!"); 
    }
    
    public void showCurrentNeeds(Animal animal) {
        System.out.println("\n" + animal.getName() + "'s Current Needs:");
        System.out.println(">> Hunger: " + animal.getHunger());
        System.out.println(">> Thirst: " + animal.getThirst());
        System.out.println(">> Bladder: " + animal.getBladder());
        System.out.println(">> Fun: " + animal.getFun());
        System.out.println(">> Hygiene: " + animal.getHygiene());
        System.out.println(">> Energy: " + animal.getEnergy());
        System.out.println();
    }
}
