package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table. (???)
     */

    public static void main(String[] args) {

        /** ADD, PEEK, REMOVE AND POLL METHODS */
        Queue<String> restaurantLine = new LinkedList<>();

        // ADD - adding people to our restaurant line
        restaurantLine.add("Selena");
        restaurantLine.add("Kylie");
        restaurantLine.add("Abdi");
        restaurantLine.add("Isabella");
        restaurantLine.add("Mia");
        System.out.println("Initial Queue: " + restaurantLine);

        /**
        // PEEK- take a peek but don't remove person from line
        restaurantLine.peek();
        System.out.println("Peeking at: " + restaurantLine.peek());

        // REMOVE - remove people from restaurant line
        restaurantLine.remove("Abdi");
        System.out.println("After removal: " + restaurantLine);

        // POLL - grab the next person in line and remove them
        restaurantLine.poll();
        System.out.println("Final Queue after Poll: " + restaurantLine);
         */

        /** FOR-EACH and WHILE-LOOP
//        Queue<String> letters = new LinkedList<>();
//
//        letters.add("A");
//        letters.add("B");
//        letters.add("C");
//
//        Iterator iterator = letters.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        for(String s : letters) {
//            System.out.print(s + " ");
//        }
         */

        // DATABASE connectivity

        String tableName = "Restaurant_Line";
        String columnName = "Guests";
        SharedStepsDatabase sql = new SharedStepsDatabase();

//        sql.insertList("Restaurant", "Guests", Collections.singletonList(restaurantLine));

//        System.out.println(sql);

    }
}
