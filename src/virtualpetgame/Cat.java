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
        
        List<String> drinkOptions = new ArrayList<>();
        foodOptions.add("Water");
        foodOptions.add("Milk");
        printOptions(foodOptions);

        int drink = scanner.nextInt();
        switch(drink)
        {
            case 1:
                setEnergy(getEnergy()+20);
                setBladder(getBladder()-20);
                System.out.println(getName() + " feels replenished.");
                break;
            case 2:
                setEnergy(getEnergy()+30);
                setBladder(getBladder()-30);
                System.out.println(getName() + " loves milk.");
                break;
            default:
                System.out.println("Sorry! Drink not in menu...");
                break;
        }
    }
    
    @Override
    public void bathe(){
        setHygiene(getHygiene()+50);
        System.out.println(getName() + " smells much better now!");
    }
    
    @Override
    public void play(){
        List<String> playOptions = new ArrayList();
        playOptions.add("Pet");
        playOptions.add("Squeaky toy");
        playOptions.add("Laser pointer");
        playOptions.add("Brush");
        printOptions(playOptions);
        
        int play = scanner.nextInt();
        switch(play)
        {
            case 1:
                setFun(getFun()+30);
                setEnergy(getEnergy()-10);
                System.out.println(getName() + " loves spending time with you!");
                break;
            case 2:
                setFun(getFun()+60);
                setEnergy(getEnergy()-30);
                System.out.println("Squeak, squeak! " + getName() + " had so much fun!");
                break;
            case 3:
                setFun(getFun()+40);
                setEnergy(getEnergy()-20);
                System.out.println(getName() + " was so focused!");
                break;
            case 4:
                setFun(getFun()+20);
                setHygiene(getHygiene()+10);
                setEnergy(getEnergy()-10);
                System.out.println(getName() + " now looks more cute!!");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
    
    @Override
    public void walk(){
        setEnergy(getEnergy()-40);
        setHygiene(getHygiene()-20);
        setFun(getFun()+10);
        System.out.println(getName() + " doesn't really like walks!");
    }
    
    @Override
    public void sleep(){
        setEnergy(getEnergy()+60);
        setHunger(getHunger()-10);
        setBladder(getBladder()-10);
        System.out.println("Zzzzzzzz");
    }
    
    @Override
    public void bladder(){
        setBladder(getBladder() + 60);
        setHygiene(getHygiene()-20);
        System.out.println("Phew, that was close. " + getName()+" really had to go!");
    }
}
