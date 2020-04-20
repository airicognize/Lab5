// How do I get the lowest scores too

import java.util.*;
import java.io.*;

import static java.lang.Integer.*;

public class Grades {
    public static void main(String[] args) throws FileNotFoundException {

        File ft = new File("Grades.txt");
        Scanner sc = new Scanner(ft);
        int number = 0;
        int number1 = 0;
        String will0 = sc.next();
        String will1 = sc.next();
        int willGrade = parseInt(will1);
        String william = will0 + " " + willGrade;
        int largest;
        int smallest;
        int totalGrades = 1;
        String names = null;
        String winner = null;

        System.out.println(william);

        do {
            totalGrades++;
            names = sc.next();
            largest = parseInt(String.valueOf(sc.next()));
            smallest = largest;
            if (number < largest) {
                number = largest;
                winner = names;
            }

            if (number < smallest) {
                smallest = number;
            }
        } while (sc.hasNext());
        System.out.println("Highest grade: " + winner + " " + number);
        System.out.println(smallest);
        System.out.println("Total grades processed " + totalGrades);

    }
}
