package Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 * Testing if Collection LinkedHashSet contains a certain element
 * Testing if List Arraylist  contains a certain element
 * Testing if Collection Set hasSet contains a certain element
 * Testing if Collection Map contains a certain element
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void Collection() {
        Collection<String> collectionColor = new LinkedHashSet<>();
        collectionColor.add("Set red");
        collectionColor.add("Map Green");
        collectionColor.add("List Pink");
        assertTrue(collectionColor.contains("Map Green"));
        //assertEquals("Number of Collections ",expected 4, actual 4);

    }
    @Test
    public  void arrayList() {
        List<String> students = new ArrayList<>();
        students.add("Thandiswa Jikijela");
        students.add("Luzuko Ndlebe");
        students.add("Masivuye Bheme");
       assertTrue(students.contains("Masivuye Bheme"));
    }
    @Test
    public  void hashSet() {
        Set<String> plates = new HashSet<>();
        plates.add("Side plate");
        plates.add("Bowl");
        plates.add("Mugs");

        assertTrue(plates.contains("Mugs"));
    }
    @Test
    public void hashMap() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key1", " Element1");
        mapA.put("key2", " Element2");
        mapA.put("key3 ", "Element3");
        assertTrue(mapA.containsValue("Key2"));
       // assertEquals(("Key2"), true, mapA);
    }
}