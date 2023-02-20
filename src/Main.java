
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ex.1
        Scanner month = new Scanner(System.in);
        System.out.println("Hi! I can guess the season. " +
                "\nType month number (1-12): ");
        int monthNumber = month.nextInt();

        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String fall = "Fall";

        if (monthNumber > 0 && monthNumber <= 12 ) {
            if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
                System.out.println(winter);
            } else if ( monthNumber <= 5) {
                System.out.println(spring);
            } else if (monthNumber <= 8) {
                System.out.println(summer);
            } else {
                System.out.println(fall);
            }

        } else {
            System.out.println("Try again!");
        }

        // ex.2
        String[] myFavoriteBands = new String[5];
        myFavoriteBands[0] =  "Muse";
        myFavoriteBands[1] = "Marlyn Manson";
        myFavoriteBands[2] = "Estas Tonne";
        myFavoriteBands[3] = "Splin";
        myFavoriteBands[4] = "singing Anton";

        //ex.3
        int[] myFirstArray = new int[2];
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;

        int[] mySecondArray = {3,4};
        int[] myThirdArray = {5,6};

        System.out.println(myFirstArray[0] +" "+ myFirstArray[1]);
        System.out.println(mySecondArray[0] +" "+ mySecondArray[1]);
        System.out.println(myThirdArray[0] +" "+ myThirdArray[1]);

        //part2

        Phone phone1 = new Phone("53672366", "M31S", 110.2);
        Phone phone2 = new Phone("67543288", "J4+", 94.2);

        phone2.getNumber();
        phone1.getNumber();
    }
}
