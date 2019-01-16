package dateCalc;

import java.util.Scanner;

/**
 * @author Rudy Peralta/Linuxxx
 */

public class DateCalculator {
    public static void main(String[] args) {
        //Initialize variables
        Scanner userInput = new Scanner(System.in);
        int month;
        int day;
        int year;

        //Get month/day/year in that order from user
        System.out.println("Give me month please: ");
        month = userInput.nextInt();
        System.out.println("Give me the day please: ");
        day = userInput.nextInt();
        System.out.println("Finally, the year please: ");
        year = userInput.nextInt();
        // Uses the Gaussian Calendar method for figuring out day of the week which is on wikipedia. I explain down below.

        //output
        System.out.println(month + "/" + day + "/" + year + " was a " + dayReference(month, day, year));
    }

    public static String dayReference(int month, int day, int year) {

        //TODO: WHEN WE LEARN SWITCH STATEMENTS, MAKE THIS ONE OML

        if (dayOfWeek(month, day, year) == 0) {
            return "Sunday";
        }
        if (dayOfWeek(month, day, year) == 1) {
            return "Monday";
        }
        if (dayOfWeek(month, day, year) == 2) {
            return "Tuesday";
        }
        if (dayOfWeek(month, day, year) == 3) {
            return "Wednesday";
        }
        if (dayOfWeek(month, day, year) == 4) {
            return "Thursday";
        }
        if (dayOfWeek(month, day, year) == 5) {
            return "Friday";
        }
        if (dayOfWeek(month, day, year) == 6) {
            return "Saturday";
        }
        return null;
    }

    public static int dayOfWeek(int month, int day, int year) {
        double monthCalculation;
        int leapYearOffset;
        int dayOfWeekCalculated; //Sunday = 0 ... Sat = 6

        monthCalculation = (month - 2 + 12) % 12; // calculates the month offset, March being = 1 --> Feb = 12. (Instead of indexing at 0 which would break calculations.

        if (month <= 2) { // If the month is January or February, then decrement the year and add 10 to the month calculation to not mess up calculations in the 2000's and onward
            monthCalculation = month + 10; //TODO Check for this fix or potential bug, Marley did the calculation with me so it should work
            year--;
        }

        /*
         *  Given to me by Marley, he explained this as such:
         *  leapYearOffset deals with the leapyear rules, basically, if the year is divisible by 4, its a leap year, UNLESS
         *  it's divisible by 100, if it's divisible by 100 then its only a leap year if 400 can divide into it,
         *  instead of a boolean statement though, what this does is it checks for a leap year like so:
         *
         *  5*(2014 mod 4) + 4 * (2014 mod 100) + 6 * (2014 mod 400) = 150.
         *
         *  that's assigned into leapYearOffset, and given to dayOfWeekCalculated to get the required 0 -> 6 output.
         */

        leapYearOffset = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);

        /* daysOfWeekCalculated is based off the disparate variation of Gauss's algorithm.
         It works based off of the formula:
         w = (d + [2.6m - 0.2] + y + [y/4] + [c/4] - 2c) % 7

         where:
         Y = the year - 1 for january or february, and the yar for any other month
         y = the last 2 digits of Y
         d = the day of the month (1 -> 31)
         m = the shifted month (March = 1 -> Feb = 12)
         w = day of the week (Sunday = 0 -> Saturday = 6) [Oh, if 2 is negative you add 7 to it.

         The only difference is that I use leapyear offset instead of the [y/4]+[c/4] - 2c.

         heres the calculation using 02/20/2014, which used to give the output of Monday before I fixed the bug. {It's actually
         a Thursday): (Oh, and leapYearOffset is = to 150 before here so keep that in mind.)

            (20 + (floor(2.6 * 12 - 0.2) + 150) % 7) = 5

         So yes, I know we're not supposed to use formulas, but I transposed this with some help from a calc
         student and I understand how it functions, the reason I use int is as a placeholder for Math.Floor, which
         gives me unnecessary implementations of the math library.
         */
        dayOfWeekCalculated = (day + (int) (2.6 * monthCalculation - 0.2) + leapYearOffset) % 7;

        return dayOfWeekCalculated;
    }
}
