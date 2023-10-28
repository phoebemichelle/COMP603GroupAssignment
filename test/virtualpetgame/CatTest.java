/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package virtualpetgame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alekh
 */
public class CatTest {

    public CatTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of feed method, of class Cat.
     */
    @Test
    public void testFeed() {
        System.out.println("feed");
        Cat instance = new Cat("Whiskers");
        instance.feed();
    }

    /**
     * Test of fillWaterBowl method, of class Cat.
     */
    @Test
    public void testFillWaterBowl() {
        System.out.println("fillWaterBowl");
        Cat instance = new Cat("Whiskers");
        instance.fillWaterBowl();
    }

    /**
     * Test of bathe method, of class Cat.
     */
    @Test
    public void testBathe() {
        System.out.println("bathe");
        Cat instance = new Cat("Whiskers");
        instance.bathe();
    }

    /**
     * Test of play method, of class Cat.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Cat instance = new Cat("Whiskers");
        instance.play();
    }

    /**
     * Test of walk method, of class Cat.
     */
    @Test
    public void testWalk() {
        System.out.println("walk");
        Cat instance = new Cat("Whiskers");
        instance.walk();
    }

    /**
     * Test of sleep method, of class Cat.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        Cat instance = new Cat("Whiskers");
        instance.sleep();
    }

    /**
     * Test of potty method, of class Cat.
     */
    @Test
    public void testPotty() {
        System.out.println("potty");
        Cat instance = new Cat("Whiskers");
        instance.potty();
    }

}
