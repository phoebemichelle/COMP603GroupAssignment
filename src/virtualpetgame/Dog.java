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
        setHunger(getHunger() + 50);
        setEnergy(getEnergy() + 20);
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 40);
        setThirst(getThirst() + 60);
    }
    
    @Override
    public void bathe()
    {
       setHygiene(getHygiene()+70);
    }
    
    @Override
    public void play()
    {
        setFun(getFun() + 70);
        setEnergy(getEnergy() - 40);
        setHygiene(getHygiene() - 20);
        setHunger(getHunger() - 20);
    }
    
    @Override
    public void walk()
    {
        setEnergy(getEnergy() - 40);
        setHygiene(getHygiene() - 30);
        setHunger(getHunger() - 30);
        setFun(getFun() + 90);
    }
    
    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + 80);
        setHunger(getHunger() - 10);
        setBladder(getBladder() - 10);
    }
    
    @Override
    public void potty()
    {
        setBladder(getBladder() + 60);
        setHygiene(getHygiene() - 20);
    }
}