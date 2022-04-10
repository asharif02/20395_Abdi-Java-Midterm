package data_structures;

import databases.SharedStepsDatabase;

import java.io.*;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class DataReader {

    /** INSTRUCTIONS
     * Create an API to read the .txt file and print it to the console.
     * HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     * <p>
     * Store and retrieve the file to/from a database table.
     * <p>
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     * <p>
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car";
        StringBuilder fileContents = new StringBuilder();
        List<List<String>> wordList = new LinkedList<>();
        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        // reading from text file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            String line;

            while ((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();

            System.out.println(textFilePath);


            // inserting file to database (TBD)
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));

            ssdb.insertString("text_file", "file_contents", fileContents.toString());
            String query2 = "select * from text_file;";

            List<List<String>> results = ssdb.executeQueryReadAll(query2);


            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }


            // PART 3
            try {
                reader = new BufferedReader(new FileReader(textFilePath));
                String line;
                while ((line = reader.readLine()) != null)
                    fileContents.append(line);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            wordList.add(Collections.singletonList((fileContents.toString())));
            System.out.println(wordList);


            File file = new File(textFilePath);
            Scanner scan = null;
            try {
                scan = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            wordList = new LinkedList<>();
            if (scan != null) {
                while (scan.hasNextLine()) {
                    fileContents = new StringBuilder(fileContents.toString().concat(scan.nextLine() + "\n"));
                }
            }

            wordList.add(Collections.singletonList(fileContents.toString()));
            System.out.print(wordList);

            String tableName = "Data_Reader";
            String columnName = "Contents";
            ssdb.insertList(tableName, columnName, Collections.singletonList(wordList));

            String query = "SELECT * FROM Data_Reader";
            wordList = ssdb.executeQueryReadAll(query);
            System.out.println(wordList);


        }
    }
}