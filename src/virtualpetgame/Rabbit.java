package virtualpetgame;

/**
 *
 * @author alekh
 */
import java.util.*;
public class Rabbit extends Animal
{
    public Rabbit(String name)
    {
        super(name);
    }
    
    @Override
    public void feed()
    {
        List<String> foodOptions = new ArrayList<>();
        foodOptions.add("Hay");
        foodOptions.add("Strawberry");
        foodOptions.add("Pellets");
        foodOptions.add("Carrot");
        foodOptions.add("Leafy veggie");
        Printer.printListOptions(foodOptions);
        
        int food = InputValidator.getUserChoice("Enter a choice: ", 1, 5);
        switch(food)
        {
            case 1:
                System.out.println(getName()+" loves chewing on some hay!!!");
                setHunger(getHunger() + 70);
                setEnergy(getEnergy() + 40);
                break;
            case 2:
                System.out.println("Yumm... "+getName()+" loved the strawberry! "+getName()+" wants more food.");
                setHunger(getHunger() + 20);
                setEnergy(getEnergy() + 10);
                break;
            case 3:
                System.out.println(getName()+" likes the pellets and wants more...");
                setHunger(getHunger() + 50);
                setEnergy(getEnergy() + 20);
                break;
            case 4:
                System.out.println(getName()+" loves carrots!!!");
                setHunger(getHunger() + 70);
                setEnergy(getEnergy() + 40);
                break;
            case 5:
                System.out.println(getName()+" loves veggies!");
                setHunger(getHunger() + 70);
                setEnergy(getEnergy() + 30);
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
    public void bathe()
    {
        setHygiene(getHygiene() + 70);
        System.out.println(getName()+" is squeaky clean now!");
    }
    
    @Override
    public void play()
    {
        List<String> playOptions = new ArrayList<>();
        playOptions.add("Pet");
        playOptions.add("Activity Balls");
        playOptions.add("Grass Bed");
        playOptions.add("Chew Toy");
        playOptions.add("Rabbit Tunnel");
        Printer.printListOptions(playOptions);
        
        int play = InputValidator.getUserChoice("Enter a choice: ", 1, 5);
        switch(play)
        {
            case 1:
                setFun(getFun() + 40);
                setEnergy(getEnergy() - 10);
                setHunger(getHunger()-10);
                System.out.println(getName()+" loves playing with you!!");
                break;
            case 2:
                setFun(getFun() + 50);
                setEnergy(getEnergy() - 40);
                setHunger(getHunger()-20);
                System.out.println(getName()+" loves chasing the ball!!!");
                break;
            case 3:
                setFun(getFun() + 50);
                setEnergy(getEnergy() - 30);
                setHunger(getHunger()-10);
                System.out.println(getName()+" thinks the grass bed is very comfy...");
                break;
            case 4:
                setFun(getFun() + 60);
                setEnergy(getEnergy() - 50);
                setHunger(getHunger()-30);
                System.out.println(getName()+" loves chewing on the toys!!");
                break;
            case 5:
                setFun(getFun() + 90);
                setEnergy(getEnergy() - 70);
                setHunger(getHunger()-40);
                System.out.println(getName()+" loves tunneling!!!!");
                break;
        }
    }
    
    @Override
    public void walk()
    {
        setEnergy(getEnergy() - 30);
        setHygiene(getHygiene()-30);
        setHunger(getHunger() - 30);
        setBladder(getBladder() - 20);
        setFun(getFun() + 90);
        System.out.println(getName()+" loves hopping around!");
    }
    
    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + 80);
        setHunger(getHunger() - 10);
        setBladder(getBladder() - 20);
        System.out.println("Zzzzzzzzzzzzz");
    }
    
    @Override
    public void potty()
    {
        setBladder(getBladder() + 60);
        setHygiene(getHygiene() - 20);
        System.out.println(getName()+" feels relieved!");
    }
}