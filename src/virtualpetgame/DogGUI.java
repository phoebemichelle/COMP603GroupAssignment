/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.*;

/**
 *
 * @author alekh
 */
public class DogGUI extends GUI
{
    private Dog dog;
    private JLabel status = new JLabel();
    
    //Constructor for the GUI for Dog
    public DogGUI(String name)
    {
        dog = new Dog(name);
        dog.setStatus(status);
        dog.getNeedsDescription();
        
        // Creating the components - buttons for the functions
        JButton feedButton = new JButton("Feed");
        
        // Creating the menu options for the dog
        JPopupMenu menu = new JPopupMenu();
        JMenuItem fruit = new JMenuItem("Fruit");
        JMenuItem veggie = new JMenuItem("Veggie");
        JMenuItem cheese = new JMenuItem("Cheese");
        JMenuItem eggs = new JMenuItem("Eggs");
        JMenuItem meat = new JMenuItem("Meat");
        
        // Adding the food options to the dropdown menu
        menu.add(fruit);
        menu.add(veggie);
        menu.add(cheese);
        menu.add(eggs);
        menu.add(meat);
        
        // Adding a mouse listener to show the food options
        feedButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me)
            {
                menu.show(feedButton, me.getX(), me.getY());
            }
        });
        
        // Adding action listeners to the menu
        fruit.addActionListener((ActionEvent ae) -> {
            dog.setFood("Fruit");
            dog.feed();
            updateStatus(dog.getMessage());
        });
        veggie.addActionListener((ActionEvent ae) -> {
            dog.setFood("Veggie");
            dog.feed();
            updateStatus(dog.getMessage());
        });
        cheese.addActionListener((ActionEvent ae) -> {
            dog.setFood("Cheese");
            dog.feed();
            updateStatus(dog.getMessage());
        });
        eggs.addActionListener((ActionEvent ae) -> {
            dog.setFood("Eggs");
            dog.feed();
            updateStatus(dog.getMessage());
        });
        meat.addActionListener((ActionEvent ae) -> {
            dog.setFood("Meat");
            dog.feed();
            updateStatus(dog.getMessage());
        });
        
        // Creating the other components 
        JButton batheButton = new JButton("Bathe");
        JButton playButton = new JButton("Play");
        
        // Creating the play options for the pet
        JPopupMenu play = new JPopupMenu();
        JMenuItem fetch = new JMenuItem("Fetch");
        JMenuItem tugofWar = new JMenuItem("Tug-of-War");
        JMenuItem frisbee = new JMenuItem("Frisbee");
        JMenuItem sprinkler = new JMenuItem("Sprinkler");
        JMenuItem bubbles = new JMenuItem("Bubbles");
        JMenuItem pet = new JMenuItem("Pet");
        
        // Adding the play options to the dropdown menu
        play.add(fetch);
        play.add(tugofWar);
        play.add(frisbee);
        play.add(sprinkler);
        play.add(bubbles);
        play.add(pet);
        
        // Adding mouse listener to show the options
        playButton.addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed(MouseEvent me) {
                play.show(playButton, me.getX(), me.getY());
            }
        });
        
        // Adding the action listeners to the play options
        fetch.addActionListener((ActionEvent ae) -> {
            dog.setPlaying("Fetch");
            dog.play();
            updateStatus(dog.getMessage());
        });
        tugofWar.addActionListener((ActionEvent ae) -> {
            dog.setPlaying("Tug-of-War");
            dog.play();
            updateStatus(dog.getMessage());
        });
        frisbee.addActionListener((ActionEvent ae) -> {
            dog.setPlaying("Frisbee");
            dog.play();
            updateStatus(dog.getMessage());
        });
        sprinkler.addActionListener((ActionEvent ae) -> {
            dog.setPlaying("Sprinkler");
            dog.play();
            updateStatus(dog.getMessage());
        });
        bubbles.addActionListener((ActionEvent ae) -> {
            dog.setPlaying("Bubbles");
            dog.play();
            updateStatus(dog.getMessage());
        });
        pet.addActionListener((ActionEvent ae) -> {
            dog.setPlaying("Pet");
            dog.play();
            updateStatus(dog.getMessage());
        });
        
        JButton walkButton = new JButton("Walk");
        JButton sleepButton = new JButton("Sleep");
        JButton pottyButton = new JButton("Potty");
        JButton waterButton = new JButton("Water");
        
        // Setting the layout of the frame
        status.setBorder(BorderFactory.createTitledBorder("Status"));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLocationRelativeTo(null);
        // Setting the Title and size for the frame
        setTitle("DOG FRAME");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Adding the buttons to the frame
        add(status);
        add(feedButton);
        add(batheButton);
        add(playButton);
        add(walkButton);
        add(sleepButton);
        add(pottyButton);
        add(waterButton);
        
        // Adding Action Listeners:        
        feedButton.addActionListener((ActionEvent ae) -> {
            dog.feed();
            updateStatus(dog.getMessage());
        });
        batheButton.addActionListener((ActionEvent ae) -> {
            dog.bathe();
            updateStatus(dog.getMessage());
        });
        playButton.addActionListener((ActionEvent ae) -> {
            dog.play();
            updateStatus(dog.getMessage());
        });
        walkButton.addActionListener((ActionEvent ae) -> {
            dog.walk();
            updateStatus(dog.getMessage());
        });
        sleepButton.addActionListener((ActionEvent ae) -> {
            dog.sleep();
            updateStatus(dog.getMessage());
        });
        pottyButton.addActionListener((ActionEvent ae) -> {
            dog.potty();
            updateStatus(dog.getMessage());
        });
        waterButton.addActionListener((ActionEvent ae) -> {
            dog.fillWaterBowl();
            updateStatus(dog.getMessage());
        });
    }
    
    // Method to update the needs of the pet
    private void updateStatus(String message)
    {
        status.setText("\n" + dog.getNeedsDescription() + "\n" + message + "\n");
    }    
}
