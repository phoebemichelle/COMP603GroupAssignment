/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */

public class Player {
    private Animal pet;
    
    public Player() {
    }
    
    public void createPet() {
        System.out.println("Choose a pet type: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Rabbit");
        
        int choice = InputValidator.getUserChoice("Enter your choice: ", 1, 3);
        
        String name = InputValidator.getValidStringInput("Enter a name for your pet: ");
        
        switch (choice) {
            case 1:
                pet = new Dog(name);
                System.out.println(
                "-----------------------------------------------------------------------------------------------" +
                        "\nWelcome to parenthood! You are now the proud new owner of "  + pet.getName() + "!" +
                        "                                  \n" +
                        "                            |' \\ \n" +
                        "         _                  ; : ; \n" +
                        "        / `-.              /: : | \n" +
                        "       |  ,-.`-.          ,': : | \n" +
                        "       \\  :  `. `.       ,'-. : | \n" +
                        "        \\ ;    ;  `-.__,'    `-.| \n" +
                        "         \\ ;   ;  :::  ,::'`:.  `. \n" +
                        "          \\ `-. :  `    :.    `.  \\ \n" +
                        "           \\   \\    ,   ;   ,:    (\\ \n" +
                        "            \\   :., :.    ,'o)): ` `-. \n" +
                        "           ,/,' ;' ,::\"'`.`---'   `.  `-._ \n" +
                        "         ,/  :  ; '\"      `;'          ,--`. \n" +
                        "        ;/   :; ;             ,:'     (   ,:) \n" +
                        "          ,.,:.    ; ,:.,  ,-._ `.     \\\"\"'/ \n" +
                        "          '::'     `:'`  ,'(  \\`._____.-'\"' \n" +
                        "             ;,   ;  `.  `. `._`-.  \\\\ \n" +
                        "             ;:.  ;:       `-._`-.\\  \\`. \n" +
                        "              '`:. :        |' `. `\\  ) \\ \n" +
                        "                ` ;:       |    `--\\__,' \n" +
                        "                   '`      ,' \n" +
                        "                        ,-' " +
                        "\n Remember, " + pet.getName() + " has needs! Being a pet owner is a lot of work." +
                        "\n " + pet.getName() + " needs food, sleep, playtime, and lot's of attention." +
                        "\n Good luck!" +
                        "\n-----------------------------------------------------------------------------------------------");
                break;
            case 2:
                pet = new Cat(name);
                System.out.println(
                "-----------------------------------------------------------------------------------------------" +
                        "\nWelcome to parenthood! You are now the proud new owner of "  + pet.getName() + "!" +
                        " \n _ \n" +
                        " \\`*-. \n" +
                        "  )  _`-. \n" +
                        " .  : `. . \n" +
                        " : _   '  \\ \n" +
                        " ; o` _.   `*-._ \n" +
                        " `-.-'          `-. \n" +
                        "   ;       `       `. \n" +
                        "   :.       .        \\ \n" +
                        "   . \\  .   :   .-'   . \n" +
                        "   '  `+.;  ;  '      : \n" +
                        "   :  '  |    ;       ;-. \n" +
                        "   ; '   : :`-:     _.`* ;\n" +
                        "  /  .*' ; .*`- +'  `*' \n" +
                        " *-*   `*-*  `*-*'"+
                        "\n Remember, " + pet.getName() + " has needs! Being a pet owner is a lot of work." +
                        "\n " + pet.getName() + " needs food, sleep, playtime, and lot's of attention." +
                        "\n Good luck!" +
                        "\n-----------------------------------------------------------------------------------------------");
                break;
            case 3:
                pet = new Rabbit(name);
                System.out.println("               ((`\\\n" +
                        "            ___ \\\\ '--._\n" +
                        "         .'`   `'    o  )\n" +
                        "        /    \\   '. __.'\n" +
                        "       _|    /_  \\ \\_\\_\n" +
                        "      {_\\______\\-'\\__\\_\\" + 
                        "\n Remember, " + pet.getName() + " has needs! Being a pet owner is a lot of work." +
                        "\n " + pet.getName() + " needs food, sleep, playtime, and lot's of attention." +
                        "\n Good luck!" +
                        "\n-----------------------------------------------------------------------------------------------");
        }
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
        System.out.println("7. Exit");

        int choice = InputValidator.getUserChoice("Choose an interaction: ", 1, 7);

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
                continuePlaying = false;
                break;
        }
    }

    System.out.println("Exiting the game. Thank you for playing!");
}
    
    private void showCurrentNeeds(Animal animal) {
        System.out.println("\n" + animal.getName() + "'s Current Needs:");
        System.out.println(">> Hunger: " + animal.getHunger());
        System.out.println(">> Thirst: " + animal.getThirst());
        System.out.println(">> Bladder: " + animal.getHunger());
        System.out.println(">> Fun: " + animal.getHunger());
        System.out.println(">> Hygiene: " + animal.getHunger());
        System.out.println(">> Energy: " + animal.getHunger() + "\n");
    }
}
