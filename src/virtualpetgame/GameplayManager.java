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
        private boolean continuePlaying;
        
        public void setPet(Animal pet) {
            this.pet = pet;
        }

        public void createAndSetPet(int choice, String name) {
            pet = PetFactory.createPet(choice, name);
            if (pet == null) {
                System.out.println("Invalid pet type. Defaulting to Dog.");
                pet = PetFactory.createPet(1, name); // 1 represents the pet type for Dog
            }
        }

        public void playGame() {
            continuePlaying = true;

            while (continuePlaying) {
                Printer.printCurrentNeeds(pet);
                int choice = getUserInteractionChoice();
                handleUserChoice(choice);
            }
        }

        private int getUserInteractionChoice() {
            System.out.println("1. Feed " + pet.getName() + " their favorite food.");
            System.out.println("2. Fill " + pet.getName() + "'s water bowl.");
            System.out.println("3. Play with " + pet.getName() + ".");
            System.out.println("4. Take " + pet.getName() + " for a walk.");
            System.out.println("5. Let " + pet.getName() + " get some sleep.");
            System.out.println("6. Take " + pet.getName() + " out to potty.");
            System.out.println("7. Give " + pet.getName() + " a bath.");
            System.out.println("8. Save pet and Exit");

            return InputValidator.getUserChoice("Choose an interaction: ", 1, 8);
        }
        
        private void handleUserChoice(int choice) {
            switch (choice) {
            case 1:
                handleFeedAction();
                break;
            case 2:
                handleFillWaterBowlAction();
                break;
            case 3:
                handlePlayAction();
                break;
            case 4:
                handleWalkAction();
                break;
            case 5:
                handleSleepAction();
                break;
            case 6:
                handlePottyAction();
                break;
            case 7:
                pet.bathe();
                break;
            case 8:
                savePetAndExit();
                break;
            }
        }
        
            private void handleFeedAction() {
            if (pet.getHunger() > 50) {
                System.out.println("Mmh, it seems like " + pet.getName() +
                        " is too full to eat right now. Try again later.");
            } else {
                pet.feed();
            }
        }

        private void handleFillWaterBowlAction() {
            if (pet.getThirst() > 50) {
                System.out.println("Mmh, it seems like " + pet.getName() +
                        " is not thirsty right now. Try again later.");
            } else {
                pet.fillWaterBowl();
            }
        }

        private void handlePlayAction() {
            if (pet.getEnergy() < 20) {
                System.out.println("Oh no! " + pet.getName() + " is too tired to play right now.");
                System.out.println("Try letting " + pet.getName() + " get some rest first.");
            } else if (pet.getHunger() < 20) {
                System.out.println("Oh no! " + pet.getName() + " is too hungry to play right now.");
                System.out.println("Try feeding " + pet.getName() + " first.");
            } else if (pet.getBladder() < 20) {
                System.out.println(pet.getName() + " needs to go potty first before playing!");
            } else {
                pet.play();
            }
        }

        private void handleWalkAction() {
            if (pet.getEnergy() < 30) {
                System.out.println("Oh no! " + pet.getName() + " is too tired to go out for a walk right now.");
                System.out.println("Try letting " + pet.getName() + " get some rest first.");
            } else if (pet.getHunger() < 20) {
                System.out.println("Oh no! " + pet.getName() + " is too hungry right now.");
                System.out.println("Try feeding " + pet.getName() + " first.");
            } else if (pet.getBladder() < 20) {
                System.out.println(pet.getName() + " needs to go potty first!");
            } else {
                pet.walk();
            }
        }

        private void handleSleepAction() {
            if (pet.getEnergy() > 40) {
                System.out.println("Hmm, it seems like " + pet.getName() + " is not tired.");
            } else if (pet.getHunger() < 20) {
                System.out.println("Oh no! " + pet.getName() + " is too hungry right now.");
                System.out.println("Try feeding " + pet.getName() + " first.");
            } else if (pet.getBladder() < 20) {
                System.out.println(pet.getName() + " needs to go potty first!");
            } else {
                pet.sleep();
            }
        }

        private void handlePottyAction() {
            if (pet.getBladder() > 40) {
                System.out.println("Mmh, it seems like " + pet.getName() +
                        " does not need to potty right now.");
            } else {
                pet.potty();
            }
        }
        
        private void savePetAndExit() {
            DatabaseSetup.saveNewPet(pet); // Save the pet to the database using the existing dbManager object
            System.out.println("Pet saved successfully! Thank you for playing the game.");
            continuePlaying = false;
        }
    }
