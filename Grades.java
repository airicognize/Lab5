import java.util.*;
import java.io.*;

import static java.lang.Integer.*;

public class Grades {
    public static void main(String[] args) throws FileNotFoundException {

        File ft = new File("Grades.txt");
        Scanner sc = new Scanner(ft);
        int number = 0;
        String will0 = sc.next();
        String will1 = sc.next();
        int willGrade = parseInt(will1);
        String william = will0 + " " + willGrade;
        int largest = 0;

        System.out.println(william);

        while (sc.hasNext()) {
            number = 0;
            String remove = sc.next().replaceAll("\\D+","");
            largest = Integer.parseInt(String.valueOf(sc.next()));
            if (number < largest) {
                number = largest;
            }
        }

        System.out.println(number);
    }
}
