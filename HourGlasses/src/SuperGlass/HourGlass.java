package SuperGlass;

import java.util.Arrays;

public class HourGlass {
    /**
     * @author Linuxxx / Rudy Peralta
     */
    public static void lid() { //Prints the lid
        System.out.println("|\"\"\"\"\"\"\"\"\"|");
    }

    public static void topStuff() { //Takes care of the math that deals with the thingies
        for (int g = 4; g >= 1; g--) { // For loop that iterates through 4 times.
            for (int i = 4; i >= g; i--) { // Deals with the spaces that are done inside of the hourglass, which changes it for each line in the hourglass.
                System.out.print(" ");
            }
            System.out.print("\\"); // adds the \ to the end of the hourglass.
            for (int j = (g * 2) - 1; j >= 1; j--) { // the math magic baby, papa bless Marley the Math God, g * 2 - 1 gives me the correct amount of colons based on the line #
                System.out.print(":");
            }
            System.out.print("/");
            System.out.println();
        }
    }

    public static void bottomStuff() { // The inverse of the top half (basically)
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = (i * 2) - 1; j <= 7; j++) {

                System.out.print(":");
            }
            System.out.println("\\");

        }

    }


    public static void main(String[] args) {
        lid();
        topStuff();
        bottomStuff();
        lid();
    }
}
