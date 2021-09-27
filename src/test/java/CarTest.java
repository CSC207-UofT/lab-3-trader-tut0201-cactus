/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car c;
    @Before
    public void setUp() throws Exception { c = new Car(20, 200); }
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Vrooom!", c.sound());
    }
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(20, c.getMaxSpeed());
    }
    @Test(timeout = 50)
    public void TestUpgradeSpeed() { c.upgradeSpeed(); assertEquals(30, c.getMaxSpeed()); }
    @Test(timeout = 50)
    public void TestDowngradeSpeed() { c.downgradeSpeed(); assertEquals(10, c.getMaxSpeed()); }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(200, c.getPrice());
    }
}