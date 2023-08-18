/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */
import java.util.*;

public class Cat extends Animal {
    private Scanner scanner;
    
    //Constructor
    public Cat(String name){
        super(name);
        scanner = new Scanner(System.in);
    }
    
    @Override
    public void feed(){
        List<String> foodOptions = new ArrayList<>();
        foodOptions.add("Fish");
        foodOptions.add("Chicken");
        foodOptions.add("Cat food");
        foodOptions.add("Cheese");
        
        printOptions(foodOptions);
        int food = scanner.nextInt();
        switch(food)
        {
            case 1:
                setEnergy(getEnergy()+60);
                System.out.println("Meow! " + getName() + " loves fish!");
                break;
            case 2:
                setEnergy(getEnergy()+50);
                System.out.println(getName() + " enjoyed that.");
                break;
            case 3:
                setEnergy(getEnergy()+30);
                System.out.println(getName() + " is bored of cat food!");
                break;
            case 4:
                setEnergy(getEnergy()+10);
                System.out.println(getName() + " wants more food...");
                break;
            default:
                System.out.println("Sorry! Food not in menu...");
                break;
        }

    }
    
    @Override
    public void bathe(){
        
    }
    
    @Override
    public void play(){
        
    }
    
    @Override
    public void walk(){
        
    }
    
    @Override
    public void sleep(){
        
    }
    
    @Override
    public void bladder(){
        
    }
}
