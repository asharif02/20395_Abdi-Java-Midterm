package data_structures;

import databases.SharedStepsDatabase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataReader {

    /**
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

//    public static void main(String[] args) {
//        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car";
//        SharedStepsDatabase ssdb = new SharedStepsDatabase();
//
//        try {
//
//            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
//            String line;
//            String fileContents = "";
//            while((line = reader.readLine()) != null) {
//                fileContents += line;
//                System.out.println(line);
//
//            }
//            ssdb.insertString("text_file", "file_contents", fileContents); //stores the data in the database
//            String query = "select * from text_file;";
//
//            List<List<String>> results = ssdb.executeQueryReadAll(query);   //retrieves the data from the database
//
//
//            reader.close();
//
//
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//
//
//    }

}