/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package virtualpetgame;

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
public class PrinterTest {

    public PrinterTest() {
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
     * Test of printCurrentNeeds method, of class Printer.
     */
    @Test
    public void testPrintCurrentNeeds() {
        System.out.println("printCurrentNeeds");
        Animal animal = new Dog("TestDog");
        animal.setAttributes(50, 30, 20, 60, 70, 40);
        Printer.printCurrentNeeds(animal);
    }

}
