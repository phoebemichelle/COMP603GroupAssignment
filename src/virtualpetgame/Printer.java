/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import java.util.List;

/**
 *
 * @author phoeb
 */
public class Printer {
    //Private constructor to prevent instantiation
    private Printer() {
    }
    
    //Print ArrayList options
    public static void printListOptions(List<String> options) {
        System.out.println("\nChoose an option:");
        for(int i=0; i<options.size();i++) {
            System.out.println((i+1) + ". " + options.get(i));
        }
    }
    
    //Print pet's current needs
    public static void printCurrentNeeds(Animal animal) {
        System.out.println("\n" + animal.getName() + "'s Current Needs:");
        System.out.println(">> Hunger: " + animal.getHunger());
        System.out.println(">> Thirst: " + animal.getThirst());
        System.out.println(">> Bladder: " + animal.getBladder());
        System.out.println(">> Fun: " + animal.getFun());
        System.out.println(">> Hygiene: " + animal.getHygiene());
        System.out.println(">> Energy: " + animal.getEnergy());
        System.out.println();
    }
}
