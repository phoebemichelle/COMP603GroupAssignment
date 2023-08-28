package virtualpetgame;

/**
 *
 * @author phoebe
 */
import java.util.*;

public class Cat extends Animal {
    
    //Constructor
    public Cat(String name){
        super(name);
    }
    
    //Implement feed method in Cat class
    @Override
    public void feed(){
        List<String> foodOptions = new ArrayList<>();
        foodOptions.add("Fish");
        foodOptions.add("Chicken");
        foodOptions.add("Cat food");
        foodOptions.add("Cheese");
        printOptions(foodOptions);
        
        int food = InputValidator.getUserChoice("Enter a choice: ", 1, 4);
        switch(food)
        {
            case 1:
                setHunger(getHunger() + 60);
                setEnergy(getEnergy() + 30);
                System.out.println("Meow! " + getName() + " loves fish!");
                break;
            case 2:
                setHunger(getHunger() + 50);
                setEnergy(getEnergy() + 20);
                System.out.println(getName() + " enjoyed that.");
                break;
            case 3:
                setHunger(getHunger() + 40);
                setEnergy(getEnergy()+20);
                System.out.println(getName() + " is bored of cat food!");
                break;
            case 4:
                setHunger(getHunger() + 20);
                setEnergy(getEnergy()+10);
                System.out.println(getName() + " wants more food...");
                break;
        }
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 30);
        setThirst(getThirst() + 50);
        System.out.println("Water bowl refilled! " + getName() + " is staying hydrated!");
    }
    
    @Override
    public void bathe(){
        setHygiene(getHygiene()+70);
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
        
        int play = InputValidator.getUserChoice("Enter a choice: ", 1, 4);
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
                setHunger(getHunger() - 20);
                System.out.println("Squeak, squeak! " + getName() + " had so much fun!");
                break;
            case 3:
                setFun(getFun()+40);
                setEnergy(getEnergy()-20);
                setHunger(getHunger() - 10);
                System.out.println(getName() + " was so focused!");
                break;
            case 4:
                setFun(getFun()+20);
                setHygiene(getHygiene()+10);
                setEnergy(getEnergy()-10);
                System.out.println(getName() + " now looks more cute!!");
                break;
        }
    }
    
    @Override
    public void walk(){
        setEnergy(getEnergy()-40);
        setHygiene(getHygiene()-40);
        setFun(getFun()+10);
        setHunger(getHunger() - 30);
        System.out.println(getName() + " doesn't really enjoy walks!");
    }
    
    @Override
    public void sleep(){
        setEnergy(getEnergy()+80);
        setHunger(getHunger()-10);
        setBladder(getBladder()-10);
        System.out.println("Zzzzzzzz");
    }
    
    @Override
    public void potty(){
        setBladder(getBladder() + 60);
        setHygiene(getHygiene()-20);
        System.out.println("Phew, that was close. " + getName()+" really had to go!");
    }
}
