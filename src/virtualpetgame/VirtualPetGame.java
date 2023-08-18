/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoebe
 */

public class VirtualPetGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Virtual Pet Game!");
        Player player = new Player();
        player.createPet();
        player.playGame();
    }
    
    
}
