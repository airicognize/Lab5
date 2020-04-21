// How do I make it so it states the name with the grade.

import java.util.*;
import java.io.*;

import static java.lang.Integer.*;

public class Grades {
    public static void main(String[] args) throws FileNotFoundException {

        File ft = new File("Grades.txt");
        Scanner sc = new Scanner(ft);
        int largestNumber = 0;
        int smallestNumber = 0;
        String will0 = sc.next();
        String will1 = sc.next();
        int willGrade = parseInt(will1);
        String william = will0 + " " + willGrade;
        int largest = Integer.MIN_VALUE;
        int totalGrades = 1;
        int gradesCount = 0;
        String names = null;
        String winner = null;
        String looser = null;
        String namess = "";

        do {
            totalGrades++;
            names = sc.next();
            largest = parseInt(String.valueOf(sc.next()));
            gradesCount += largest;
            if (largestNumber < largest) {
                smallestNumber = largestNumber;
                if (smallestNumber == largestNumber) {
                    looser = names;
                }
                largestNumber = largest;
                winner = names;
            }
        } while (sc.hasNext());

        System.out.println("Highest grade: " + winner + " " + largestNumber);
        System.out.println("Smallest Grade: " + looser +  " " + smallestNumber);
        System.out.println("Total grades processed " + totalGrades);
        double average = gradesCount/totalGrades;
        System.out.println("Average of grades is " + average);

    }
}

