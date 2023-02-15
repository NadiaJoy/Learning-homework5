import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Hi! I can guess the season. " +
                "\nType month number (1-12): ");
        int monthNumber = month.nextInt();

        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String fall = "Fall";

        if (monthNumber <=12) {
            if (monthNumber >= 3 && monthNumber <= 5) {
                System.out.println(spring);
            } else if (monthNumber <= 8) {
                System.out.println(summer);
            } else if (monthNumber <= 11) {
                System.out.println(fall);
            } else {
                System.out.println(winter);
            }

        }
        else {System.out.println("Try again!");}

    }
}
