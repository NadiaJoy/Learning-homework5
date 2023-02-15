
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

        if (monthNumber <= 12) {
            if (monthNumber >= 3 && monthNumber <= 5) {
                System.out.println(spring);
            } else if (monthNumber <= 8) {
                System.out.println(summer);
            } else if (monthNumber <= 11) {
                System.out.println(fall);
            } else {
                System.out.println(winter);
            }

        } else {
            System.out.println("Try again!");
        }

        // ex.2
        ArrayList<String> myArrayList;
        myArrayList = new ArrayList<>();
        myArrayList.add("Muse");
        myArrayList.add("Marlyn Manson");
        myArrayList.add("Estas Tonne");
        myArrayList.add("Splin");
        myArrayList.add("Anton (true)");

        //ex.3
        int[] myFirstArray = new int[2];
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;

        int[] mySecondArray = {3,4};
        int[] myThirdArray = {5,6};

        System.out.println(myFirstArray[0] +" "+ myFirstArray[1]);
        System.out.println(mySecondArray[0] +" "+ mySecondArray[1]);
        System.out.println(myThirdArray[0] +" "+ myThirdArray[1]);

    }
}
