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
public class Dog 
{
    Scanner in = new Scanner(System.in);
    
    private String name;
    private int age;
    private int fun;
    private int energy;
    private int bladder;
    
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getFun()
    {
        return this.fun;
    }
    public void setFun(int fun)
    {
        this.fun = fun;
    }
    public int getEnergy()
    {
        return this.energy;
    }
    public void setEnergy(int energy)
    {
        this.energy = energy;
    }
    public int getBladder()
    {
        return this.bladder;
    }
    public void setBladder(int bladder)
    {
        this.bladder = bladder;
    }
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.fun = 0;
        this.energy = 10;
        this.bladder = 0;
    }
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
                this.energy += 8;
                System.out.println("Thank you!! I would like a drink now...");
                break;
            case 2:
                this.energy += 9;
                System.out.println("Thank you!! Can we play now?");
                break;
            case 3:
                this.energy +=5;
                System.out.println("I want more food...");
                break;
            case 4:
                this.energy += 7;
                System.out.println("I want more food...");
                break;
            case 5:
                this.energy += 10;
                System.out.println("Thank you!! I'm full now...");
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
                this.energy += 3;
                this.bladder += 1;
                break;
            case 2:
                this.energy += 1;
                this.bladder += 3;
                break;
            case 3:
                this.energy += 2;
                this.bladder += 2;
                break;
            default:
                System.out.println("Invalid drink choice!!");
                break;
        }
    }
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
                this.fun += 4;
                System.out.println("That was amazing!! Thank you for the bath");
                break;
            case 2:
                System.out.println("Ooohh!!! That was cold!");
                break;
            case 3:
                System.out.println("Mmmmm... Can I go to bed now?");
                break;
            default:
                System.out.println("Bath option not found!");
                break;
        }
    }
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
                this.fun += 10;
                this.energy = 3;
                System.out.println("That was really fun!!!");
                break;
            case 2:
                this.fun += 9;
                this.energy = 5;
                System.out.println("That was really fun!!!");
                break;
            case 3:
                this.fun += 10;
                this.energy = 3;
                System.out.println("That was really fun!!!");
                break;
            case 4: 
                this.fun += 8;
                this.energy = 4;
                System.out.println("That was really fun!!!");
                break;
            case 5: 
                this.fun += 9;
                this.energy = 4;
                System.out.println("That was really fun!!!");
                break;
            default: 
                System.out.println("Invalid game choice!!");
                break;
        }
    }
    public void walk()
    {
        this.energy = 3;
        this.fun = 9;
        System.out.println("That was refreshing!!");
    }
    public void sleep()
    {
        this.energy = 8;
        System.out.println("I rested enough now... I want to play...");
    }
    public void toilet()
    {
        this.bladder = 0;
        System.out.println("I feel much better now...");
    }
    public static void main(String[] args) 
    {
        Dog dog = new Dog("Fleetfoot", 1);
        dog.feed();
        dog.bathe();
        dog.play();
        dog.walk();
        dog.sleep();
        dog.toilet();
        System.out.println("DOG'S NAME: "+dog.getName());
        System.out.println("DOG'S AGE: "+dog.getAge());
        System.out.println("FUN SCORE: "+dog.getFun());
        System.out.println("ENERGY SCORE: "+dog.getEnergy());
        System.out.println("BLADDER SCORE: "+dog.getBladder());
    }
}