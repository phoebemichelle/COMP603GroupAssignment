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
public class GameplayManagerTest {

    public GameplayManagerTest() {
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
     * Test of setPet method, of class GameplayManager.
     */
    @Test
    public void testSetPet() {
        System.out.println("setPet");
        Animal pet = new Dog("Fleetfoot");
        GameplayManager instance = new GameplayManager();
        instance.setPet(pet);
    }

    /**
     * Test of createAndSetPet method, of class GameplayManager.
     */
    @Test
    public void testCreateAndSetPet() {
        System.out.println("createAndSetPet");
        int choice = 1;
        String name = "Fleetfoot";
        GameplayManager instance = new GameplayManager();
        instance.createAndSetPet(choice, name);
    }

}
