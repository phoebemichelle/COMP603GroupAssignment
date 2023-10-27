/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 *
 * @author phoeb
 */
public class MenuHandler 
{
    private JTextArea text;
    private JButton[] buttons;
    private DatabaseSetup dbSetup;
        
    public MenuHandler(JTextArea text, JButton[] buttons)
    {
        this.text = text;
        this.buttons = buttons;
        dbSetup = new DatabaseSetup();
        
        buttons[0].addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent ae)
            {
                List<Animal> existingPets = dbSetup.loadExistingPets();
                int choice = displayPetSelectionMenu(existingPets);
                if(choice >= 1 && choice <= existingPets.size())
                {
                    Animal pet = existingPets.get(choice - 1);
                    handleExistingPet(pet);
                }
                else
                {
                    showMessage("Invalid Selection!");
                }
            }
        });
        buttons[1].addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String name = getPetName();
                int type = displayPetTypeSelectionMenu();
                if(type == 1)
                {
                    Dog newDog = new Dog(name);
                    handleNewPet(newDog);
                }
                else if(type == 2)
                {
                    Cat newCat = new Cat(name);
                    handleNewPet(newCat);
                }
                else
                {
                    showMessage("Invalid Pet Type!");
                }
                
            }
        });
    }
    
    public void displayMainMenu()
    {
        text.setText("Welcome to Virtual Pet Game!!"+ "\n" + 
                "You can choose to play with our Pets under PETS LIST button" + "\n" +
                "To make a Pet of your own, click on NEW PET");
    }
    
    private int displayPetSelectionMenu(List<Animal> existingPets)
    {
        String message = "Select a pet to play with: \n";
        for(int i = 0; i < existingPets.size(); i++)
        {
            message += (i + 1) + ". " + existingPets.get(i).getName() 
                    + " (" + existingPets.get(i).getClass().getSimpleName() + ") \n";
        }
        return getUserChoice(message, 1, existingPets.size());
    }
    
    private int displayPetTypeSelectionMenu()
    {
        showMessage("Select a pet type: \n1. Dog \n2. Cat");
        return getUserChoice("Enter your choice: ", 1, 2);
    }
    
    private int getUserChoice(String message, int min, int max)
    {
        int choice;
        while(true)
        {
            try {
                String input = JOptionPane.showInputDialog(null, message);
                choice = Integer.parseInt(input);
                if(choice >= min && choice <= max)
                {
                    break;
                }
                else
                {
                    showMessage("Invalid choice! Please choose between " + min + " and " + max);
                }
            } catch(NumberFormatException nfe)
            {
                showMessage("Invalid pet choice! Choose from 1 or 2 only!");
            }
        }
        return choice;
    }
           
    private void showMessage(String message)
    {
        text.setText(message);
    }
    
    private Animal createNewPet(int type, String name)
    {
        // Creating new pet and adding it to the database
        Animal pet = null;
        if(type == 1)
        {
            pet = new Dog(name);
        }
        else if(type == 2)
        {
            pet = new Cat(name);
        }
        if(pet != null)
        {
            dbSetup.saveNewPet(pet);
        }
        return pet;
    }
    
    
    
    private void handleExistingPet(Animal petChoice)
    {
        showMessage("Selected the pet: " + petChoice.getName() + 
                " (" + petChoice.getClass().getSimpleName() + ") ");
        // Logic to handle the existing pet chosen
        if(petChoice instanceof Dog)
        {
            dogGUI(petChoice.getName());
        }
        else if(petChoice instanceof Cat)
        {
            catGUI(petChoice.getName());
        }
        else
        {
            showMessage("Invalid Pet Choice!");
        }
    }
    
    private void handleNewPet(Animal petChoice)
    {
        showMessage("Created new pet: " + petChoice.getName() + 
                " (" + petChoice.getClass().getSimpleName() + ") " );
        // Logic to handle the existing pet chosen
        if(petChoice instanceof Dog)
        {
            dogGUI(petChoice.getName());
        }
        else if(petChoice instanceof Cat)
        {
            catGUI(petChoice.getName());
        }
        else
        {
            showMessage("Invalid Pet Choice!");
        }        
    }    
    
    private void dogGUI(String name)
    {
        DogGUI dogGUI = new DogGUI(name);
        dogGUI.setVisible(true);
    }
    private void catGUI(String name)
    {        
        CatGUI catGUI = new CatGUI(name);
        catGUI.setVisible(true);
    }
    
    public static String getPetName() {
        return JOptionPane.showInputDialog(null, "Choose a name for the pet!");
    }    
}
