/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alekh
 */
public class GUI 
{
    private JFrame frame;
    private PetPanel petPanel;
    private JButton feedButton;
    private JButton batheButton;
    private JButton playButton;
    private JButton walkButton;
    private JButton sleepButton;
    private JButton pottyButton;
    private JButton waterButton;
    
    public GUI()
    {
        frame = new JFrame("VIRTUAL PET GAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        
        petPanel = new PetPanel();
        
        feedButton = new JButton("Feed");
        batheButton = new JButton("Bathe");
        playButton = new JButton("Play");
        walkButton = new JButton("Walk");
        sleepButton = new JButton("Sleep");
        pottyButton = new JButton("Potty");
        waterButton = new JButton("Water");
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(feedButton);
        buttonsPanel.add(batheButton);
        buttonsPanel.add(playButton);
        buttonsPanel.add(walkButton);
        buttonsPanel.add(sleepButton);
        buttonsPanel.add(pottyButton);
        buttonsPanel.add(waterButton);
        
        frame.setLayout(new BorderLayout());
        frame.add(petPanel, BorderLayout.CENTER);
        frame.add(buttonsPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);        
    }
    
    public JButton getFeedButton()
    {
        return this.feedButton;
    }
    public JButton getBathButton()
    {
        return this.batheButton;
    }
    public JButton getPlayButton()
    {
        return this.playButton;
    }
    public JButton getWalkButton()
    {
        return this.walkButton;
    }    
    public JButton getSleepButton()
    {
        return this.sleepButton;
    }
    public JButton getPottyButton()
    {
        return this.pottyButton;
    }
    public JButton getWaterButton()
    {
        return this.waterButton;
    }
    
}
