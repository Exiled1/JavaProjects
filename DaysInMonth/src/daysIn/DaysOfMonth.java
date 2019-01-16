package daysIn;

/**
 * @author Rudy Peralta
 */

public class DaysOfMonth {
    public static void main(String[] args) {
        System.out.println(daysInMonth(13));
    }

    public static int daysInMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("That doesn't exist, try again 0-0");
            return 0;
        } else if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
