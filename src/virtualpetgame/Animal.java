/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoebe
 */
import java.util.List;

public abstract class Animal {
    private String name;
    protected int hunger;
    protected int energy;
    protected int fun;
    protected int hygiene;
    protected int bladder;
    protected int thirst;
    
    public Animal(String name) {
        this.name = name;
        this.hunger = 50;
        this.bladder = 50;
        this.energy = 50;
        this.fun = 50;
        this.hygiene = 50;
        this.thirst = 50;
    }
    
    //Getter and setter
    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = Math.min(Math.max(hunger, 0), 100);
    }

    public int getBladder() {
        return bladder;
    }
    
    public void setBladder(int bladder) {
        this.bladder = Math.min(Math.max(bladder, 0), 100);
    }
    
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = Math.min(Math.max(energy, 0), 100);
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = Math.min(Math.max(fun, 0), 100);
    }

    public int getHygiene() {
        return hygiene;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = Math.min(Math.max(hygiene, 0), 100);
    }
    
    public int getThirst() {
        return thirst;
    }
    
    public void setThirst(int thirst) {
        this.thirst = Math.min(Math.max(thirst, 0), 100);
    }
    
    //Abstract functions to be implemented in subclasses
    public abstract void feed();
    public abstract void bathe();
    public abstract void play();
    public abstract void walk();
    public abstract void sleep();
    public abstract void potty();
    public abstract void fillWaterBowl();
}
