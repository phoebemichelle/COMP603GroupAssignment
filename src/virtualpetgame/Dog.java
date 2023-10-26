package virtualpetgame;

/**
 *
 * @author alekh
 */
import javax.swing.*;
import java.util.*;

public class Dog extends Animal
{
    private String food = "";
    private String playing = "";
    private Animal pet;
    //Variable to store the message to be printed in the frame
    private String message = "";
    
    //JLabel to display the status of Dog
    private JLabel status;
    
    //constructor    
    public Dog(String name)
    {
        super(name);
    }
    
    //setter method for status label
    public void setStatus(JLabel status)
    {
        this.status = status;
    }
    //getter method for status label
    public JLabel getStatus()
    {
        return this.status;
    }
    //setter method to set the menu for the pet
    public void setFood(String food)
    {
        this.food = food;
    }
    //setter method for playing
    public void setPlaying(String playing)
    {
        this.playing = playing;
    }
    //getter method for message
    public String getMessage()
    {
        return this.message;
    }
    //setter method for message
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    //Implementing feed method in Dog class
    @Override
    public void feed()
    {
        switch(food)
        {
            case "Fruit":
                setHunger(getHunger() + 30);
                setEnergy(getEnergy() + 10);
                this.message = pet.getName()+" feels refreshed!";
                break;
            case "Veggie":
                setHunger(getHunger() + 10);
                setEnergy(getEnergy() + 50);
                this.message = pet.getName()+" doesn't really eat greens.";
                break;
            case "Cheese":
                setHunger(getHunger() + 20);
                setEnergy(getEnergy() + 10);
                this.message = pet.getName()+" wants more food...";
                break;
            case "Eggs":
                setHunger(getHunger() + 40);
                setEnergy(getEnergy() + 20);
                this.message = pet.getName()+" wants more!";
                break;
            case "Meat":
                setHunger(getHunger() + 80);
                setEnergy(getEnergy() + 30);
                this.message = "Woof!! " + pet.getName() + " is full now...";
                break;
            default:
                this.message = "Food option does not exist in the Menu!";
        }
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 40);
        setThirst(getThirst() + 60);
        this.message = "Water bowl refilled! " + pet.getName() + " is staying hydrated!";
    }
    
    @Override
    public void bathe()
    {
       setHygiene(getHygiene()+70);
       this.message = pet.getName() + " smells much better now!";
    }
    
    @Override
    public void play()
    {
        switch(playing)
        {
            case "Fetch":
                setFun(getFun() + 70);
                setEnergy(getEnergy() - 30);
                setHygiene(getHygiene() - 50);
                setHunger(getHunger() - 20);
                this.message = "Woof! " + pet.getName() + " loves playing fetch!!!";
                break;
            case "Tug-of-War":
                setFun(getFun() + 60);
                setEnergy(getEnergy() - 50);
                setHygiene(getHygiene() - 30);
                setHunger(getHunger() - 30);
                this.message = "Grrr! " + pet.getName() + " got really competitive!";
                break;
            case "Frisbee":
                setFun(getFun() + 80);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 40);
                setHunger(getHunger() - 20);
                this.message = pet.getName()+" loves catching frisbee!";
                break;
            case "Sprinkler": 
                setFun(getFun() + 70);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 80);
                setHunger(getHunger() - 30);
                this.message = "Oh no!" + pet.getName()+" had so much fun but " 
                        + pet.getName() + "is now all muddy";
                break;
            case "Bubbles": 
                setFun(getFun() + 90);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 20);
                setHunger(getHunger() - 20);
                this.message = pet.getName()+" feels ecstatic from popping bubbles!";
                break;
            case "Pet":
                setFun(getFun() + 60);
                setEnergy(getEnergy() + 40);
                this.message = pet.getName()+" loves your attention!";
                break;
            default:
                this.message = "Play option does not exist!";
        }
    }
    
    @Override
    public void walk()
    {
        setEnergy(getEnergy() - 40);
        setHygiene(getHygiene() - 30);
        setHunger(getHunger() - 30);
        setFun(getFun() + 90);
        this.message = pet.getName()+" loves going on walks with you!!";
    }
    
    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + 80);
        setHunger(getHunger() - 10);
        setBladder(getBladder() - 10);
        this.message = "Zzzzzzzz";
    }
    
    @Override
    public void potty()
    {
        setBladder(getBladder() + 60);
        setHygiene(getHygiene() - 20);
        this.message = pet.getName()+" feels much better now...";
    }
}