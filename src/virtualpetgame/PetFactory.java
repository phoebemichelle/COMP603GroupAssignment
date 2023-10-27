/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;
import javax.swing.*;

/**
 *
 * @author phoeb
 */
public class PetFactory 
{
    public static Animal createPet(int choice, String name) 
    {
        Animal pet = null;
        
        // Checking for a valid input
        if(choice != 1 && choice != 2)
        {
            JOptionPane.showMessageDialog(null, "Invalid pet type chosen. Please choose a valid pet type.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        // Input the pet's name using a dialogbox
        if(name == null || name.trim().isEmpty())
        {
            name = JOptionPane.showInputDialog(null, "Please input a name for your pet: ",
                    "Pet Name", JOptionPane.PLAIN_MESSAGE);
            
            // Handling cancel buttons and empty inputs
            if(name ==null || name.trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Uh-oh, you did not name your pet...", "Error", JOptionPane.ERROR_MESSAGE);
                return null;                
            }
        }
        
        //Creating a pet instance based on the user's choice
        if(choice == 1)
        {
            pet = new Dog(name);
        }
        else if(choice ==2)
        {
            pet = new Cat(name);
        }
        
        JOptionPane.showMessageDialog(null, 
                "Welcome to parenthood! You are now the proud new owner of "+ name + "!\nRemember, "
                        + name + " has needs! Being a pet owner is a lot of work.\n" + name +
                        "needs food, sleep, playtime, and lots of attention.\n"
                + "GOOD LUCK!!!",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);
        
        /*switch(choice) {
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
        }*/
        
        return pet;
    }
}
