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
public class DogTest {

    public DogTest() {
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
     * Test of feed method, of class Dog.
     */
    @Test
    public void testFeed() {
        System.out.println("feed");
        Dog instance = new Dog("Fleetfoot");
        instance.feed();
    }

    /**
     * Test of fillWaterBowl method, of class Dog.
     */
    @Test
    public void testFillWaterBowl() {
        System.out.println("fillWaterBowl");
        Dog instance = new Dog("Fleetfoot");
        instance.fillWaterBowl();
    }

    /**
     * Test of bathe method, of class Dog.
     */
    @Test
    public void testBathe() {
        System.out.println("bathe");
        Dog instance = new Dog("Fleetfoot");
        instance.bathe();
    }

    /**
     * Test of play method, of class Dog.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Dog instance = new Dog("Fleetfoot");
        instance.play();
    }

    /**
     * Test of walk method, of class Dog.
     */
    @Test
    public void testWalk() {
        System.out.println("walk");
        Dog instance = new Dog("Fleetfoot");
        instance.walk();
    }

    /**
     * Test of sleep method, of class Dog.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        Dog instance = new Dog("Fleetfoot");
        instance.sleep();
    }

    /**
     * Test of potty method, of class Dog.
     */
    @Test
    public void testPotty() {
        System.out.println("potty");
        Dog instance = new Dog("Fleetfoot");
        instance.potty();
    }

}
