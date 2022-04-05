package data_structures;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class CollectionView {

    /** INSTRUCTIONS
     * A map is given to you below, with some data inserted into it.
     *
     * Retrieve the Collection view of the values present in map
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        // print every key-value pair
        System.out.println(map);

        // get specific value from the map
        System.out.println(map.get(4)); // go celtics!




    }

}
