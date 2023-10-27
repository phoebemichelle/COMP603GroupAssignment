/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;

/**
 *
 * @author alekh
 */
public class CatGUI extends GUI {

    private Cat cat;
    private JLabel status = new JLabel();

    // Constructor for the GUI for Cat
    public CatGUI(String name) {
        cat = new Cat(name);
        cat.setStatus(status);
        cat.getNeedsDescription();

        // Creating the components - buttons for the functions
        JButton feedButton = new JButton("Feed");

        // Creating the menu options for the cat
        JPopupMenu menu = new JPopupMenu();
        JMenuItem fish = new JMenuItem("Fish");
        JMenuItem chicken = new JMenuItem("Chicken");
        JMenuItem catFood = new JMenuItem("Cat Food");
        JMenuItem cheese = new JMenuItem("Cheese");

        // Adding the food options to the dropdown menu
        menu.add(fish);
        menu.add(chicken);
        menu.add(catFood);
        menu.add(cheese);

        // Adding a mouse listener to show the food menu
        feedButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                menu.show(feedButton, me.getX(), me.getY());
            }
        });

        // Adding the action listeners to the menu
        fish.addActionListener((ActionEvent ae) -> {
            cat.setFood("Fish");
            cat.feed();
            updateStatus(cat.getMessage());
        });
        chicken.addActionListener((ActionEvent ae) -> {
            cat.setFood("Chicken");
            cat.feed();
            updateStatus(cat.getMessage());
        });
        catFood.addActionListener((ActionEvent ae) -> {
            cat.setFood("Cat Food");
            cat.feed();
            updateStatus(cat.getMessage());
        });
        cheese.addActionListener((ActionEvent ae) -> {
            cat.setFood("Cheese");
            cat.feed();
            updateStatus(cat.getMessage());
        });

        // Creating the rest of the bottons for the functions
        JButton batheButton = new JButton("Bathe");
        JButton playButton = new JButton("Play");

        // Creating play options for the pet
        JPopupMenu play = new JPopupMenu();
        JMenuItem pet = new JMenuItem("Pet");
        JMenuItem squeakyToy = new JMenuItem("Squeaky Toy");
        JMenuItem laser = new JMenuItem("Laser");
        JMenuItem brush = new JMenuItem("Brush");

        // Adding the play options to the dropdown menu
        play.add(pet);
        play.add(squeakyToy);
        play.add(laser);
        play.add(brush);

        // Adding Mouse Listener to show the options
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                play.show(playButton, me.getX(), me.getY());
            }
        });

        // Adding the action listeners to the play options
        pet.addActionListener((ActionEvent ae) -> {
            cat.setPlay("Pet");
            cat.play();
            updateStatus(cat.getMessage());
        });
        squeakyToy.addActionListener((ActionEvent ae) -> {
            cat.setPlay("Squeaky Toy");
            cat.play();
            updateStatus(cat.getMessage());
        });
        laser.addActionListener((ActionEvent ae) -> {
            cat.setPlay("Laser");
            cat.play();
            updateStatus(cat.getMessage());
        });
        brush.addActionListener((ActionEvent ae) -> {
            cat.setPlay("Brush");
            cat.play();
            updateStatus(cat.getMessage());
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
        setTitle("CAT FRAME");
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
            cat.feed();
            updateStatus(cat.getMessage());
        });
        batheButton.addActionListener((ActionEvent ae) -> {
            cat.bathe();
            updateStatus(cat.getMessage());
        });
        playButton.addActionListener((ActionEvent ae) -> {
            cat.play();
            updateStatus(cat.getMessage());
        });
        walkButton.addActionListener((ActionEvent ae) -> {
            cat.walk();
            updateStatus(cat.getMessage());
        });
        sleepButton.addActionListener((ActionEvent ae) -> {
            cat.sleep();
            updateStatus(cat.getMessage());
        });
        pottyButton.addActionListener((ActionEvent ae) -> {
            cat.potty();
            updateStatus(cat.getMessage());
        });
        waterButton.addActionListener((ActionEvent ae) -> {
            cat.fillWaterBowl();
            updateStatus(cat.getMessage());
        });
    }

    // Method to update the needs of the pet
    private void updateStatus(String message) {
        status.setText("\n" + cat.getNeedsDescription() + "\n" + message + "\n");

    }
}
