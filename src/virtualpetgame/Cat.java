package virtualpetgame;

/**
 *
 * @author phoebe
 */

public class Cat extends Animal {
    
    //Constructor
    public Cat(String name){
        super(name);
    }
    
    //Implement feed method in Cat class
    @Override
    public void feed(){
        setHunger(getHunger() + 50);
        setEnergy(getEnergy() + 20);
    }
    
    @Override
    public void fillWaterBowl()
    {
        setBladder(getBladder() - 30);
        setThirst(getThirst() + 50);
    }
    
    @Override
    public void bathe(){
        setHygiene(getHygiene()+70);
    }
    
    @Override
    public void play(){
        setFun(getFun()+40);
        setEnergy(getEnergy()-20);
        setHunger(getHunger() - 10);
    }
    
    @Override
    public void walk(){
        setEnergy(getEnergy()-40);
        setHygiene(getHygiene()-40);
        setFun(getFun()+10);
        setHunger(getHunger() - 30);
    }
    
    @Override
    public void sleep(){
        setEnergy(getEnergy()+80);
        setHunger(getHunger()-10);
        setBladder(getBladder()-10);
    }
    
    @Override
    public void potty(){
        setBladder(getBladder() + 60);
        setHygiene(getHygiene()-20);
    }
}
