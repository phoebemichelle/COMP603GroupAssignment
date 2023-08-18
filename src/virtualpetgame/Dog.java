/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author alekh
 */
import java.util.Scanner;
public class Dog extends Animal
{
    Scanner in = new Scanner(System.in);
    Dog(String name)
    {
        super(name);
    }
    @Override
    public void feed()
    {
        int food;
        int drink;
        System.out.println("What would you like to feed your pet?");
        System.out.println("1. Fruit"); //energy score: 8
        System.out.println("2. Veggie"); //energy score: 9
        System.out.println("3. Cheese"); //energy score: 5
        System.out.println("4. Eggs"); //energy score: 7
        System.out.println("5. Meat"); //energy score: 10
        food = in.nextInt();
        switch(food)
        {
            case 1:
                setEnergy(getEnergy() + 80);
                System.out.println("Thank you!! "+getName()+" would like a drink now...");
                break;
            case 2:
                setEnergy(getEnergy() + 90);
                System.out.println("Thank you!! "+getName()+" wants to play now...");
                break;
            case 3:
                setEnergy(getEnergy() + 50);
                System.out.println(getName()+" wants more food...");
                break;
            case 4:
                setEnergy(getEnergy() + 70);
                System.out.println(getName()+" wants more food...");
                break;
            case 5:
                setEnergy(getEnergy() + 100);
                System.out.println("Thank you!! "+getName()+" is full now...");
                break;
            default:
                System.out.println("Sorry! Food not in menu...");
                break;
        }
        System.out.println("What drink would you like to give your pet?");
        System.out.println("1. Milk"); //energy score: 3 / bladder score: 1
        System.out.println("2. Water"); //energy score: 1 / bladder score: 3
        System.out.println("3. Juice"); //energy score: 2 / bladder score: 2
        drink = in.nextInt();
        switch(drink)
        {
            case 1:
                setEnergy(getEnergy() + 30);
                setBladder(getBladder() + 10);
                break;
            case 2:
                setEnergy(getEnergy() + 10);
                setBladder(getBladder() + 30);
                break;
            case 3:
                setEnergy(getEnergy() + 20);
                setBladder(getBladder() + 20);
                break;
            default:
                System.out.println("Invalid drink choice!!");
                break;
        }
    }
    @Override
    public void bathe()
    {
        int options;
        System.out.println("Please choose from below: ");
        System.out.println("1. Bubble Bath"); //only this would increase fun score: 4
        System.out.println("2. Cold Shower");
        System.out.println("3. Hot Shower");
        options = in.nextInt();
        switch(options)
        {
            case 1:
                setFun(getFun() + 40);
                System.out.println("That was amazing!!"+getName()+" says Thank you for the bath");
                break;
            case 2:
                System.out.println("Ooohh!!! "+getName()+" says that was cold!");
                break;
            case 3:
                System.out.println("Mmmmm... Can "+getName()+" go to bed now?");
                break;
            default:
                System.out.println("Bath option not found!");
                break;
        }
    }
    @Override
    public void play()
    {
        int options;
        System.out.println("What would you like to play with your pet?");
        System.out.println("1. Fetch"); //fun score: 10 / energy score: 3
        System.out.println("2. Tug-of-War"); //fun score: 9 / energy score: 5
        System.out.println("3. Frisbee"); //fun score: 10 / energy score: 3
        System.out.println("4. Sprinkler"); //fun score: 8 / energy score: 4
        System.out.println("5. Pop Bubbles"); //fun score: 9 / energy score: 4
        options = in.nextInt();
        switch(options)
        {
            case 1:
                setFun(getFun() + 10);
                setEnergy(getEnergy() + 30);
                System.out.println(getName()+" loved fetching the stick!!!");
                break;
            case 2:
                setFun(getFun() + 90);
                setEnergy(getEnergy() + 50);
                System.out.println(getName()+" enjoyed the tug-of-war!!");
                break;
            case 3:
                setFun(getFun() + 100);
                setEnergy(getEnergy() + 30);
                System.out.println(getName()+" loved catching the frisbee!");
                break;
            case 4: 
                setFun(getFun() + 80);
                setEnergy(getEnergy() + 40);
                System.out.println(getName()+" loved palying with the water!!!");
                break;
            case 5: 
                setFun(getFun() + 90);
                setEnergy(getEnergy() + 40);
                System.out.println(getName()+" loves paooping the bubbles!!!!");
                break;
            default: 
                System.out.println("Invalid game choice!!");
                break;
        }
    }
    @Override
    public void walk()
    {
        setEnergy(getEnergy() + 30);
        setFun(getFun() + 90);
        System.out.println(getName()+" thinks that was refreshing!!");
    }
    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + 80);
        System.out.println(getName()+" rested enough now..."+getName()+" wants to play...");
    }
    @Override
    public void potty()
    {
        setBladder(getBladder() + 0);
        System.out.println(getName()+" feels much better now...");
    }
}