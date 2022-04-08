package data_structures;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

    public static void main(String[] args) throws FileNotFoundException {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car";

        String line;

        /** Part 1 - read file and print to console */

        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            while((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** Part 2 - store and retrieve from database (does not matter how you do this) */


















        /** Part 3 - store each word into LinkedList

        String fileContents = "";
        LinkedList<String> wordList = new LinkedList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            while((line = reader.readLine()) != null)
                fileContents += line;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        wordList.add((fileContents));
        System.out.println(wordList);
         */

        /** Part 3 cont... using Scanner


//        File file = new File(textFilePath);
//        Scanner scan = new Scanner(file);
//        LinkedList<String> wordList = new LinkedList<>();
//        String fileContent = "";
//        while(scan.hasNextLine()) {
//            fileContent = fileContent.concat(scan.nextLine() + "\n");
//        }
//
//        wordList.add(fileContent);
//        System.out.print(wordList);
//        System.out.println(wordList.getLast());
         */

    }
}
