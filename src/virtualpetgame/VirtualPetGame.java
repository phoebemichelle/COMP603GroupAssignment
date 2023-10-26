/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpetgame;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author phoebe
 */

public class VirtualPetGame 
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() { 
            @Override
            public void run() 
            {
                JFrame mainFrame = new JFrame("VIRTUAL PET GAME");
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.setLayout(new BorderLayout());
                
                JTextArea text = new JTextArea();
                text.setEnabled(false);
                mainFrame.add(new JScrollPane(text), BorderLayout.CENTER);
                
                JButton[] buttons = new JButton[2];
                buttons[0] = new JButton("PET LIST");
                buttons[1] = new JButton("NEW PET");
                
                JPanel buttonsPanel =new JPanel();
                
                for(JButton button: buttons)
                {
                    buttonsPanel.add(button);
                }                
                mainFrame.add(buttonsPanel, BorderLayout.SOUTH);
                
                MenuHandler menuHandler = new MenuHandler(text, buttons);
                menuHandler.displayMainMenu();
                
                mainFrame.setSize(400, 300);
                mainFrame.setVisible(true);                
            }
        });
    }
}
