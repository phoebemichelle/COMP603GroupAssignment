/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package virtualpetgame;

import java.sql.Connection;
import java.util.List;
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
public class DatabaseSetupTest {

    public DatabaseSetupTest() {
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
     * Test of getConnection method, of class DatabaseSetup.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection expResult = DatabaseSetup.getConnection();
        Connection result = DatabaseSetup.getConnection();
        assertEquals(expResult, result);
    }

    /**
     * Test of closeConnections method, of class DatabaseSetup.
     */
    @Test
    public void testCloseConnections() {
        System.out.println("closeConnections");
        DatabaseSetup instance = new DatabaseSetup();
        instance.closeConnections();
    }

    /**
     * Test of loadExistingPets method, of class DatabaseSetup.
     */
    @Test
    public void testLoadExistingPets() {
        System.out.println("loadExistingPets");
        List<Animal> expResult = DatabaseSetup.loadExistingPets();
        List<Animal> result = DatabaseSetup.loadExistingPets();
        assertEquals(expResult, result);
    }

    /**
     * Test of saveNewPet method, of class DatabaseSetup.
     */
    @Test
    public void testSaveNewPet() {
        System.out.println("saveNewPet");
        Animal pet = new Cat("TestCat");
        DatabaseSetup.saveNewPet(pet);
    }

}
