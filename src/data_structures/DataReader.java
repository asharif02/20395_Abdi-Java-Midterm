package data_structures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    /** INSTRUCTIONS
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        // use double backslashes '\\' with file paths
        // self-driving-car is not a .txt
        String textFilePath = System.getProperty("user.dir") + "\\src\\data_structures\\data\\self-driving-car";
        // testing if the correct path gets printed
//        System.out.println(textFilePath);

        // try/catch block used for exception handling
        try {
            // reader object
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            // empty variable
            String line;
            // for each iteration through the loop, read each line of text and put it in 'line' variable
            // once 'line' is null/empty, we've reached the end of the file, and it'll exit the while loop
            while((line = reader.readLine()) != null)
                System.out.println(line);
//                System.out.println(reader.readLine()); // .readLine() only reads a single line
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
