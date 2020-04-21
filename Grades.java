/**
 *  a program that reads a file containing a list of names and scores. 
 *  The program should identify and output the names with highest and lowest score, the total amount of grades processed, and the average score of all processed.  
 * 
 *  @author Jeremie Guerchon
 */

import java.util.*;
import java.io.*;

import static java.lang.Integer.*;

public class Grades {
    public static void main(String[] args) throws FileNotFoundException {

        File ft = new File("Grades.txt");
        Scanner sc = new Scanner(ft);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        String will0 = sc.next();
        String will1 = sc.next();
        int willGrade = parseInt(will1);
        String william = will0 + " " + willGrade;
        int totalGrades = 1;
        int gradesCount = 0;
        String name = null;
        String winner = null;
        String looser = null;
        int number = 0;

        do {
            totalGrades++;
            name = sc.next();
            number = parseInt(String.valueOf(sc.next()));
            gradesCount += number;
            if (smallestNumber > number) {
                smallestNumber = number;
                looser = name;

            } else if (largestNumber < number) {
                largestNumber = number;
                winner = name;
            }
        } while (sc.hasNext());

        System.out.println("Highest grade: " + winner + " " + largestNumber + "%");
        System.out.println("Smallest Grade: " + looser +  " " + smallestNumber + "%");
        System.out.println("Total grades processed " + totalGrades);
        double average = gradesCount/totalGrades;
        System.out.println("Average of grades is " + average + "%");

    }
}
