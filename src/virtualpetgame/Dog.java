package virtualpetgame;

/**
 *
 * @author alekh
 */
import java.util.*;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    
    @Override
    public void feed()
    {
        List<String> foodOptions = new ArrayList<>();
        foodOptions.add("Fruit"); //energy score: 30
        foodOptions.add("Veggie"); //energy score: 10
        foodOptions.add("Cheese"); //energy score: 20
        foodOptions.add("Eggs"); //energy score: 40
        foodOptions.add("Meat"); //energy score: 80
        Printer.printListOptions(foodOptions);
        
        int food = InputValidator.getUserChoice("Enter a choice: ", 1, 5);
        switch(food)
        {
            case 1:
                setHunger(getHunger() + 30);
                setEnergy(getEnergy() + 10);
                System.out.println(getName()+" feels refreshed!");
                break;
            case 2:
                setHunger(getHunger() + 10);
                System.out.println(getName()+" doesn't really eat greens.");
                break;
            case 3:
                setHunger(getHunger() + 20);
                setEnergy(getEnergy() + 10);
                System.out.println(getName()+" wants more food...");
                break;
            case 4:
                setHunger(getHunger() + 40);
                setEnergy(getEnergy() + 20);
                System.out.println(getName()+" wants more!");
                break;
            case 5:
                setHunger(getHunger() + 80);
                setEnergy(getEnergy() + 30);
                System.out.println("Woof!! "+getName()+" is full now...");
                break;
        }
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 40);
        setThirst(getThirst() + 60);
        System.out.println("Water bowl refilled! " + getName() + " is staying hydrated!");
    }
    
    @Override
    public void bathe()
    {
       setHygiene(getHygiene()+70);
       System.out.println(getName() + " smells much better now!");
    }
    
    @Override
    public void play()
    {
        List<String> playOptions = new ArrayList<>();
        playOptions.add("Fetch");
        playOptions.add("Tug-of-War");
        playOptions.add("Frisbee");
        playOptions.add("Sprinkler");
        playOptions.add("Pop Bubbles");
        playOptions.add("Pet");
        Printer.printListOptions(playOptions);
        
        int options = InputValidator.getUserChoice("Enter a choice: ", 1, 6);
        switch(options)
        {
            case 1:
                setFun(getFun() + 70);
                setEnergy(getEnergy() - 30);
                setHygiene(getHygiene() - 50);
                setHunger(getHunger() - 20);
                System.out.println("Woof! "+getName()+" loves playing fetch!!!");
                break;
            case 2:
                setFun(getFun() + 60);
                setEnergy(getEnergy() - 50);
                setHygiene(getHygiene() - 30);
                setHunger(getHunger() - 30);
                System.out.println("Grrr! " + getName()+" got really competitive!");
                break;
            case 3:
                setFun(getFun() + 80);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 40);
                setHunger(getHunger() - 20);
                System.out.println(getName()+" loves catching frisbee!");
                break;
            case 4: 
                setFun(getFun() + 70);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 80);
                setHunger(getHunger() - 30);
                System.out.println("Oh no!" + getName()+" had so much fun but " 
                        + getName() + "is now all muddy");
                break;
            case 5: 
                setFun(getFun() + 90);
                setEnergy(getEnergy() - 40);
                setHygiene(getHygiene() - 20);
                setHunger(getHunger() - 20);
                System.out.println(getName()+" feels ecstatic from popping bubbles!");
                break;
            case 6:
                setFun(getFun() + 60);
                setEnergy(getEnergy() + 40);
                System.out.println(getName()+" loves your attention!");
                break;
        }
    }
    
    @Override
    public void walk()
    {
        setEnergy(getEnergy() - 40);
        setHygiene(getHygiene() - 30);
        setHunger(getHunger() - 30);
        setFun(getFun() + 90);
        System.out.println(getName()+" loves going on walks with you!!");
    }
    
    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + 80);
        setHunger(getHunger() - 10);
        setBladder(getBladder() - 10);
        System.out.println("Zzzzzzzz");
    }
    
    @Override
    public void potty()
    {
        setBladder(getBladder() + 60);
        setHygiene(getHygiene() - 20);
        System.out.println(getName()+" feels much better now...");
    }
}