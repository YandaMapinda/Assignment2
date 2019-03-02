package Collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Collections col = new Collections();
        col.Collection();
        col.arrayList();
        col.hashSet();
        col.hashMap();


    }
    public void Collection(){
        Collection<String>collectionColor = new LinkedHashSet<>();
        collectionColor.add("Set red");
        collectionColor.add("Map Green");
        collectionColor.add("List Pink");
        System.out.println("Collection sets: "+ collectionColor);

    }
    public static void arrayList() {
        List<String> students = new ArrayList<>();
        students.add("Thandiswa Jikijela");
        students.add("Luzuko Ndlebe");
        students.add("Masivuye Bheme");
        System.out.println("Initial list of Third year Students " + students + "\n");

        students.remove("Luzuko Ndlebe");
        System.out.println("Updated list of Third year Students" + students + "\n");
    }

    //set interface
    public  void hashSet() {
        Set<String> plates = new HashSet<>();
        plates.add("Side plate");
        plates.add("Bowl");
        plates.add("Mugs");
        System.out.println("Initial List of Plate set" + plates);
        plates.remove("Mugs");
        System.out.println("Updated List of Plate set " + plates);
    }
    //Map Interface
    public void hashMap() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key1", " Element1");
        mapA.put("key2", " Element2");
        mapA.put("key3 ", "Element3");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : mapA.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        mapA.remove("key2", " Element2");
        for (Map.Entry m : mapA.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
