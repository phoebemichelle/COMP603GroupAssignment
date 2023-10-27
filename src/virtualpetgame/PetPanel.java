/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author alekh
 */
public class PetPanel extends JPanel
{
    private BufferedImage pet;
    
    public PetPanel(BufferedImage pet)
    {
        this.pet = pet;
        setPreferredSize(new Dimension(pet.getWidth(), pet.getHeight()));
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(pet != null) {
            g.drawImage(pet, 0, 0, this);
        }
    }
    
}
