package data_structures;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class CollectionView {

    /** INSTRUCTIONS
     * A map is given to you below, with some data inserted into it.
     *
     * Retrieve the Collection view of the values present in map.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        /** TESTING
        System.out.println(map); // print every key-value pair

        System.out.println(map.get(4)); // get specific value from the map // go celtics!

        System.out.println(map.containsValue("Boston"));
        System.out.println(map.containsKey(7));
         */

        // values() method returns the Collection view of the values contained in this map
        System.out.println("Collection view is: " + map.values());

    }

}
