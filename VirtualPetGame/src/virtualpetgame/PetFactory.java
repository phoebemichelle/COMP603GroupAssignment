/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */
public class PetFactory {
    public static Animal createPet(int choice, String name) {
        Animal pet = null;
        switch(choice) {
            case 1:
                System.out.println("Welcome to parenthood! You are now the proud new owner of " + name + "!");
                pet = new Dog(name);
                break;
            case 2:
                System.out.println("Welcome to parenthood! You are now the proud new owner of " + name + "!");
                pet = new Cat(name);
                break;
            default:
                throw new IllegalArgumentException("Invalid pet type chosen. Please choose a valid pet type."); 
        }
        
        if (pet != null) {
            System.out.println("Remember, " + name + " has needs! Being a pet owner is a lot of work.");
            System.out.println(name + " needs food, sleep, playtime, and lots of attention.");
            System.out.println("Good luck!");
            System.out.println("-----------------------------------------------------------------------------------------------");
        }
        
        return pet;
    }
}
