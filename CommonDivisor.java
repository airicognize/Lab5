import java.util.Scanner;

import javax.swing.text.PlainDocument;

/**
 *  a program to compute the greatest common divisor (gcd) of two integers. In mathematics, 
 *  the gcd of two or more integers is the largest positive integer that divides each of the integers. 
 *  
 * @author Jeremie Guerchon
 */
public class CommonDivisor {
    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

        int gcd = 0;
        int one = 0;
        int two = 0;

        System.out.println("Enter 2 integers");
        
        if (sc.hasNextInt()) {
             one = sc.nextInt();
             two = sc.nextInt();

        do {
            gcd = two;
            two = one % two;
            one = gcd;
        } while (one != 0 && two != 0);

        System.out.println("The greatest common divisor is " + (one + two));

       } else {
        System.out.println("You have not entered an integer, please restart the program to start again.");
       }

    }
}
