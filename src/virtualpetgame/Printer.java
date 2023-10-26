/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import java.util.List;
import javax.swing.*;
import java.awt.*;

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
        String message = "Choose an option: \n";
        //System.out.println("\nChoose an option:");
        for (int i = 0; i < options.size(); i++) {
            message += (i + 1) + ". " + options.get(i);
        }
        showMessage(message);
    }

    //Print pet's current needs
    public static void printCurrentNeeds(Animal animal) {
        showMessage("Pet's Current Needs: \n" + animal.getNeedsDescription());
    }
    
    private static void showMessage(String message) {

        // Creating the main frame
        JFrame frame = new JFrame("VIRTUAL PET GAME");
        JTextArea text = new JTextArea(message);
        text.setEditable(false);
        text.setFont(new Font("Arial", Font.LAYOUT_RIGHT_TO_LEFT, 14));
        text.setWrapStyleWord(true);
        text.setLineWrap(true);
        
        JScrollPane pane = new JScrollPane(text);
        frame.add(pane);
        // setting the size of the frame
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
