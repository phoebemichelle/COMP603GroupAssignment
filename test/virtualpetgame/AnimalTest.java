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
public class AnimalTest {

    public AnimalTest() {
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
     * Test of setAttributes method, of class Animal.
     */
    @Test
    public void testSetAttributes() {
        System.out.println("setAttributes");
        int hunger = 30;
        int energy = 40;
        int fun = 70;
        int hygiene = 10;
        int bladder = 30;
        int thirst = 80;
        Animal instance = new Cat("TestPet1");
        instance.setAttributes(hunger, energy, fun, hygiene, bladder, thirst);
        assertEquals(hunger, instance.getHunger());
        assertEquals(energy, instance.getEnergy());
        assertEquals(fun, instance.getFun());
        assertEquals(hygiene, instance.getHygiene());
        assertEquals(bladder, instance.getBladder());
        assertEquals(thirst, instance.getThirst());
    }

    /**
     * Test of getName method, of class Animal.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Animal instance = new Cat("TestPet");
        String expResult = "TestPet";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHunger method, of class Animal.
     */
    @Test
    public void testGetHunger() {
        System.out.println("getHunger");
        Animal instance = new Cat("TestPet");
        int expResult = 50;
        int result = instance.getHunger();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHunger method, of class Animal.
     */
    @Test
    public void testSetHunger() {
        System.out.println("setHunger");
        int hunger = 50;
        Animal instance = new Cat("TestPet");
        instance.setHunger(hunger);
    }

    /**
     * Test of getBladder method, of class Animal.
     */
    @Test
    public void testGetBladder() {
        System.out.println("getBladder");
        Animal instance = new Cat("TestPet");
        int expResult = 50;
        int result = instance.getBladder();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBladder method, of class Animal.
     */
    @Test
    public void testSetBladder() {
        System.out.println("setBladder");
        int bladder = 50;
        Animal instance = new Cat("TestPet");
        instance.setBladder(bladder);
    }

    /**
     * Test of getEnergy method, of class Animal.
     */
    @Test
    public void testGetEnergy() {
        System.out.println("getEnergy");
        Animal instance = new Cat("TestPet");
        int expResult = 50;
        int result = instance.getEnergy();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnergy method, of class Animal.
     */
    @Test
    public void testSetEnergy() {
        System.out.println("setEnergy");
        int energy = 50;
        Animal instance = new Cat("TestPet");
        instance.setEnergy(energy);
    }

    /**
     * Test of getFun method, of class Animal.
     */
    @Test
    public void testGetFun() {
        System.out.println("getFun");
        Animal instance = new Cat("TestPet");
        int expResult = 50;
        int result = instance.getFun();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFun method, of class Animal.
     */
    @Test
    public void testSetFun() {
        System.out.println("setFun");
        int fun = 50;
        Animal instance = new Cat("TestPet");
        instance.setFun(fun);
    }

    /**
     * Test of getHygiene method, of class Animal.
     */
    @Test
    public void testGetHygiene() {
        System.out.println("getHygiene");
        Animal instance = new Cat("TestPet");
        int expResult = 50;
        int result = instance.getHygiene();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHygiene method, of class Animal.
     */
    @Test
    public void testSetHygiene() {
        System.out.println("setHygiene");
        int hygiene = 50;
        Animal instance = new Cat("TestPet");
        instance.setHygiene(hygiene);
    }

    /**
     * Test of getThirst method, of class Animal.
     */
    @Test
    public void testGetThirst() {
        System.out.println("getThirst");
        Animal instance = new Cat("TestPet");
        int expResult = 50;
        int result = instance.getThirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThirst method, of class Animal.
     */
    @Test
    public void testSetThirst() {
        System.out.println("setThirst");
        int thirst = 50;
        Animal instance = new Cat("TestPet");
        instance.setThirst(thirst);
    }

    /**
     * Test of feed method, of class Animal.
     */
    @Test
    public void testFeed() {
        System.out.println("feed");
        Animal instance = new Cat("TestPet");
        instance.feed();
    }

    /**
     * Test of bathe method, of class Animal.
     */
    @Test
    public void testBathe() {
        System.out.println("bathe");
        Animal instance = new Cat("TestPet");
        instance.bathe();
    }

    /**
     * Test of play method, of class Animal.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Animal instance = new Cat("TestPet");
        instance.play();
    }

    /**
     * Test of walk method, of class Animal.
     */
    @Test
    public void testWalk() {
        System.out.println("walk");
        Animal instance = new Cat("TestPet");
        instance.walk();
    }

    /**
     * Test of sleep method, of class Animal.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        Animal instance = new Cat("TestPet");
        instance.sleep();
    }

    /**
     * Test of potty method, of class Animal.
     */
    @Test
    public void testPotty() {
        System.out.println("potty");
        Animal instance = new Cat("TestPet");
        instance.potty();
    }

    /**
     * Test of fillWaterBowl method, of class Animal.
     */
    @Test
    public void testFillWaterBowl() {
        System.out.println("fillWaterBowl");
        Animal instance = new Cat("TestPet");
        instance.fillWaterBowl();
    }

    /**
     * Test of getNeedsDescription method, of class Animal.
     */
    @Test
    public void testGetNeedsDescription() {
        System.out.println("getNeedsDescription");
        Animal instance = new Cat("TestPet");
        String expResult = String.format("TestPet's Current Needs:\n>> Hunger: 50\n>> Thirst: 50\n>> Bladder: 50\n"
                + ">> Fun: 50\n>> Hygiene: 50\n>> Energy: 50\n");
        String result = instance.getNeedsDescription();
        assertEquals(expResult, result);
    }

    public class AnimalImpl extends Animal {

        public AnimalImpl() {
            super("");
        }

        @Override
        public void feed() {
        }

        @Override
        public void bathe() {
        }

        @Override
        public void play() {
        }

        public void walk() {
        }

        @Override
        public void sleep() {
        }

        @Override
        public void potty() {
        }

        @Override
        public void fillWaterBowl() {
        }
    }

}
