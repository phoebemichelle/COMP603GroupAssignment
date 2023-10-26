package virtualpetgame;

/**
 *
 * @author phoebe
 */
import java.util.*;
import javax.swing.*;

public class Cat extends Animal 
{
    private String food = "";
    private String playing = "";
    private Animal pet;
    
    // Storing the message to print it out in the frame
    private String message = "";
    
    // JLabel to display the status of the Cat
    private JLabel status;
    
    //Constructor
    public Cat(String name)
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
    //setter method to set the type of food
    public void setFood(String food)
    {
        this.food = food;
    }
    //setter method to set the play option
    public void setPlay(String playing)
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
    
    //Implement feed method in Cat class
    @Override
    public void feed()
    {
        switch(food)
        {
            case "Fish":
                setHunger(getHunger() + 60);
                setEnergy(getEnergy() + 30);
                this.message = "Meow! " + pet.getName() + " loves fish!";
                break;
            case "Chicken":
                setHunger(getHunger() + 50);
                setEnergy(getEnergy() + 20);
                this.message = pet.getName() + " enjoyed that.";
                break;
            case "Cat Food":
                setHunger(getHunger() + 40);
                setEnergy(getEnergy()+20);
                this.message = pet.getName() + " is bored of cat food!";
                break;
            case "Cheese":
                setHunger(getHunger() + 20);
                setEnergy(getEnergy()+10);
                this.message = pet.getName() + " wants more food...";
                break;
            default:
                this.message = "Food option does not exists in the Menu!";
        }
        
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 30);
        setThirst(getThirst() + 50);
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
            case "Pet":
                setFun(getFun()+30);
                setEnergy(getEnergy()-10);
                this.message = pet.getName() + " loves spending time with you!";
                break;
            case "Squeaky Toy":
                setFun(getFun()+60);
                setEnergy(getEnergy()-30);
                setHunger(getHunger() - 20);
                this.message = "Squeak, squeak! " + pet.getName() + " had so much fun!";
                break;
            case "Laser":
                setFun(getFun()+40);
                setEnergy(getEnergy()-20);
                setHunger(getHunger() - 10);
                this.message = pet.getName() + " was so focused!";
                break;
            case "Brusg":
                setFun(getFun()+20);
                setHygiene(getHygiene()+10);
                setEnergy(getEnergy()-10);
                this.message = pet.getName() + " now looks more cute!!";
                break;
            default:
                this.message = "Play option does not exist!";
           }
    }
    
    @Override
    public void walk(){
        setEnergy(getEnergy()-40);
        setHygiene(getHygiene()-40);
        setFun(getFun()+10);
        setHunger(getHunger() - 30);
        this.message = pet.getName() + " doesn't really enjoy walks!";
    }
    
    @Override
    public void sleep(){
        setEnergy(getEnergy()+80);
        setHunger(getHunger()-10);
        setBladder(getBladder()-10);
        this.message = "Zzzzzzzz";
    }
    
    @Override
    public void potty(){
        setBladder(getBladder() + 60);
        setHygiene(getHygiene()-20);
        this.message = "Phew, that was close. " + pet.getName()+" really had to go!";
    }
}
