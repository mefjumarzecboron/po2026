package agh.po.lab3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

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
        assertEquals("Hello Maciek!", codingBat.helloName("Maciek"));
        assertEquals("Hello Maks!", codingBat.helloName("Maks"));
        assertEquals("Hello Ela!", codingBat.helloName("Ela"));
    }

    @Test
    public void testFirstLast6() {
        assertTrue(codingBat.firstLast6(new int[]{2, 6}));
        assertTrue(codingBat.firstLast6(new int[]{1, 2, 6}));
        assertFalse(codingBat.firstLast6(new int[]{1, 2, 5, 4}));
    }

    @Test
    public void testMapAB3() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");

        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "aaa");
        expected1.put("b", "aaa");
        expected1.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");

        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "aaa");
        expected2.put("b", "bbb");
        expected2.put("c", "cake");

        Map<String, String> map4 = new HashMap<>();
        map4.put("c", "cake");
        map4.put("d", "dog");

        Map<String, String> expected3 = new HashMap<>();
        expected3.put("c", "cake");
        expected3.put("d", "dog");

        assertEquals(expected3, codingBat.mapAB3(map4));
        assertEquals(expected2, codingBat.mapAB3(map3));
        assertEquals(expected1, codingBat.mapAB3(map));
    }

    @Test
    public void testWordMultiple() {
        String[] map2 = new String[]{"a", "b", "a", "c", "b"};

        Map<String, Boolean> expected1 = new HashMap<>();
        expected1.put("a", true);
        expected1.put("b", true);
        expected1.put("c", false);

        String[] map5 = new String[]{"c", "b", "a"};

        Map<String, Boolean> expected2 = new HashMap<>();
        expected2.put("a", false);
        expected2.put("b", false);
        expected2.put("c", false);

        String[] map6 = new String[]{"c", "c", "c", "c"};

        Map<String, Boolean> expected3 = new HashMap<>();
        expected3.put("c", true);

        assertEquals(expected3, codingBat.wordMultiple(map6));
        assertEquals(expected2, codingBat.wordMultiple(map5));
        assertEquals(expected1, codingBat.wordMultiple(map2));
    }
}