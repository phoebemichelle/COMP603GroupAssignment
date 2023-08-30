/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author alekh
 */
import java.util.*;
public class Pig extends Animal
{
    public Pig(String name)
    {
        super(name);
    }
    
    @Override
    public void feed()
    {
        List<String> foodOptions = new ArrayList<>();
        foodOptions.add("Corn"); //energy score: 20
        foodOptions.add("Soybeans"); //energy score: 60
        foodOptions.add("Grains"); //energy score: 80
        foodOptions.add("Veggies"); //energy score: 50
        foodOptions.add("Eggs"); //energy score: 10
        foodOptions.add("Nuts"); //energy score: 70
        foodOptions.add("Meat"); //energy score: 90
        Printer.printListOptions(foodOptions);
        
        int food = InputValidator.getUserChoice("Enter a choice: ", 1, 7);
        switch(food)
        {
            case 1:
                setHunger(getHunger() + 20);
                setEnergy(getEnergy() + 10);
                System.out.println(getName() + " loves corn!!");
                break;
            case 2:
                setHunger(getHunger() + 60);
                setEnergy(getEnergy() + 50);
                System.out.println(getName() + " likes to eat soybeans...");
                break;
            case 3:
                setHunger(getHunger() + 80);
                setEnergy(getEnergy() + 40);
                System.out.println(getName() + " likes chewing on the grains!!");
                break;
            case 4:
                setHunger(getHunger() + 50);
                setEnergy(getEnergy() + 50);
                System.out.println(getName() + " doesn't really like veggies...");
                break;
            case 5:
                setHunger(getHunger() + 10);
                setEnergy(getEnergy() + 20);
                System.out.println(getName() + " wants more food...");
                break;
            case 6:
                setHunger(getHunger() + 60);
                setEnergy(getEnergy() + 70);
                System.out.println(getName() + " loves nuts!!");
                break;
            case 7:
                setHunger(getHunger() + 90);
                setEnergy(getEnergy() + 90);
                System.out.println(getName() + " loves corn!!");
                break;
        }
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 40);
        setThirst(getThirst() + 60);
        System.out.println("Water bowl refilled!! "+ getName() + " is staying hydrated!");
    }
    
    @Override
    public void bathe()
    {
        setHygiene(getHygiene() + 70);
        System.out.println(getName() + " smells much better now!!!");
    }
    
    @Override
    public void play()
    {
        List<String> playOptions = new ArrayList<>();
        playOptions.add("Ball"); //fun score: 30
        playOptions.add("Sand Pit"); //fun score: 40
        playOptions.add("Hay Box"); //fun score: 50
        playOptions.add("Rooting Box"); //fun score 80
        playOptions.add("Mud Pit"); //fun score: 90
        playOptions.add("Kiddie Pool"); //fun score: 70
        playOptions.add("Pet"); //fun score: 60
        Printer.printListOptions(playOptions);
        int options = InputValidator.getUserChoice("Enter a choice: ", 1, 7);
        switch(options)
        {
            case 1:
                setFun(getFun() + 30);
                setEnergy(getEnergy() - 20);
                setHygiene(getHygiene() - 30);
                setHunger(getHunger() - 40);
                System.out.println("Oink! Oink! " + getName() + " loves playing with ball!!");
                break;
            case 2:
                setFun(getFun() + 40);
                setEnergy(getEnergy() - 50);
                setHygiene(getHygiene() - 60);
                setHunger(getHunger() - 50);
                System.out.println("Oink! Oink! " + getName() + " loves playing in the sandpit!!");
                break;
            case 3:
                setFun(getFun() + 50);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 30);
                setHunger(getHunger() - 40);
                System.out.println("Oink! " + getName() + " found so many treats in the hay box!");
                break;
            case 4:
                setFun(getFun() + 80);
                setEnergy(getEnergy() - 70);
                setHygiene(getHygiene() - 10);
                setHunger(getHunger() - 60);
                System.out.println("Oink! Oink! " + getName() + " loves playing with stuffed toys!!");
                break;
            case 5:
                setFun(getFun() + 90);
                setEnergy(getEnergy() - 80);
                setHygiene(getHygiene() - 90);
                setHunger(getHunger() - 70);
                System.out.println("Oink! Oink! " + getName() + " loves bathing in the mud!!");
                break;
            case 6:
                setFun(getFun() + 70);
                setEnergy(getEnergy() - 50);
                setHygiene(getHygiene() - 60);
                setHunger(getHunger() - 70);
                System.out.println("Oink! Oink! " + getName() + " loves splashing around in the water!!");
                break;
            case 7:
                setFun(getFun() + 60);
                setEnergy(getEnergy() + 40);
                System.out.println("Oink! " + getName() + " loves your attention!!");
                break;
        }
    }
    
    @Override
    public void walk()
    {
        setEnergy(getEnergy() - 50);
        setHygiene(getHygiene() - 40);
        setHunger(getHunger() - 60);
        setFun(getFun() + 60);
        System.out.println(getName() + " doesn't like walking as much!");
    }
    
    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + 80);
        setHunger(getHunger() - 30);
        setBladder(getBladder() - 10);
        System.out.println("Zzzzzzzzzzz");
    }
    
    @Override
    public void potty()
    {
        setBladder(getBladder() + 50);
        setHygiene(getHygiene() - 40);
        System.out.println(getName() + " feels much better now!!!");
    }
}
