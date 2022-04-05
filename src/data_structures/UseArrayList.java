package data_structures;

import java.util.ArrayList;

public class UseArrayList {

    /** INSTRUCTIONS
     * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve data.
     *
     * Store and retrieve data_structures.data from/to a database table. (???)
     */

    public static void main(String[] args) {

        /** ADD, PEEK, REMOVE AND RETRIEVE METHODS */
        ArrayList carList = new ArrayList();

        // ADD - add elements to ArrayList
        carList.add("Maserati");
        carList.add("BMW");
        carList.add("Tesla");
        System.out.println("Initial ArrayList: " + carList);

        // REMOVE - remove elements from an ArrayList
        carList.remove("BMW");
        System.out.println("After removal: " + carList);

        // PEEK

        // RETRIEVE

    }

}
