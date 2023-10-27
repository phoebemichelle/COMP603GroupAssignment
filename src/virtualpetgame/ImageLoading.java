/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author alekh
 */
public class ImageLoading 
{
    public static BufferedImage loadImages(String file)
    {
        BufferedImage pet = null;
        try {
            File imageFile = new File(file);
            pet = ImageIO.read(imageFile);
        } catch (IOException e)
        {
            System.out.println("Couldn't load Image!");
        }
        return pet;
    }
}
