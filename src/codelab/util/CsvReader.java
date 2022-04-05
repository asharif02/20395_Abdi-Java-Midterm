package codelab.util;

import codelab.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvReader {

    /**
     * You will find a Comma-Separated Value (CSV) file within this package. It contains CodeLab status' for each student
     * who registered for the CodeLab course.
     * <p>
     * Based on the number of solutions you solved in CodeLab, a message will be generated for you.
     * You need to find the average score of the class. [13]
     **/

    public static void main(String[] args) {

        String csvFilePath = System.getProperty("user.dir") + "/src/codelab/data/roster.csv";
        String row;
        String csvSplitBy = ",";
        BufferedReader br;
        List<Student> roster = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        /** SOLUTION
        try {
            //parsing a CSV file into BufferedReader class constructor
            br = new BufferedReader(new FileReader(csvFilePath));

            int lineNumber = 0;

            while ((row = br.readLine()) != null) {
            //returns a Boolean value
                if(lineNumber == 0) {
                    lineNumber++;
                    continue;
                }

                String[] rowArray = row.split(csvSplitBy);
                //use comma as separator
//                System.out.println(rowArray[5].replace("\"", ""));
//                System.out.println(rowArray[13]);
                arrayList.add(Integer.parseInt(rowArray[13]));

            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        int sum = 0;

        for(Integer i : arrayList) {
            sum += i;
        }

        System.out.println("The average score of the class is: " + (sum / arrayList.size()));
        */




        /** TESTING
        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            int lineNumber = 0;
            ArrayList<String> total = new ArrayList<>();
            int avg = 0;
            while((line =br.readLine()) != null) {
                if(lineNumber == 0) {
                    lineNumber++;
                    continue;
                }
                String[] values = line.split(csvSplitBy);
                total.add(values[13]);
                System.out.println(total);
//                System.out.println(values[13]); // gets all the scores
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
         */


        /** SAMI's CODE
        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            int lineNumber = 0;
            while ((row = br.readLine()) != null) {
                if (lineNumber == 0) {
                    lineNumber++;
                    continue;
                }
                String[] rowArray = row.split(csvSplitBy);
                roster.add(new Student(rowArray[5].replace("\"", ""), rowArray[4].replace("\"",
                        ""), Integer.parseInt(rowArray[10])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(roster);

        for (Student student : roster) {
            System.out.println(convertNumberOfProblemsSolved(student));
        }
         */


    }

    private static String convertNumberOfProblemsSolved(Student student) {
        String name = student.getFirstName();

        if (student.getNumberOfExercisesSolved() >= 250) {
            return name + " is a QA Engineer in the making";
        } else if (student.getNumberOfExercisesSolved() >= 200) {
            return "Great job, " + name + " - keep this up and learning Selenium will be a breeze for you";
        } else if (student.getNumberOfExercisesSolved() >= 150) {
            return "Great effort, " + name + " - I know you can get some more done";
        } else if (student.getNumberOfExercisesSolved() >= 125) {
            return "You could definitely be spending more time studying, " + name + ". Let's pick up the pace";
        } else if (student.getNumberOfExercisesSolved() >= 100) {
            return "You really need to catch up, " + name;
        } else {
            return "Very low effort. Not a good sign, " + name;
        }
    }



}
