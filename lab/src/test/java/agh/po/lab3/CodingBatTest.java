package agh.po.lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat codingBat = new CodingBat();

    @Test
    public void testSleepIn() {
        assertTrue(codingBat.sleepIn(false, false));
        assertFalse(codingBat.sleepIn(true, false));
        assertTrue(codingBat.sleepIn(true, true));
    }

    @Test
    public void testLoneTeen() {
        assertTrue(codingBat.loneTeen(17, 21));
        assertFalse(codingBat.loneTeen(90, 20));
        assertFalse(codingBat.loneTeen(15, 15));
    }

    @Test
    public void testHelloName() {
        assertEquals("Hello Boron!", codingBat.helloName("Boron"));
        assertEquals("Hello Mia!", codingBat.helloName("Mia"));
        assertEquals("Hello Emilia!", codingBat.helloName("Emilia"));
    }

    @Test
    public void testFirstLast6() {
        assertTrue(codingBat.firstLast6(new int[]{5, 6}));
        assertTrue(codingBat.firstLast6(new int[]{1, 2, 6}));
        assertFalse(codingBat.firstLast6(new int[]{1, 2, 3, 4}));
    }
}