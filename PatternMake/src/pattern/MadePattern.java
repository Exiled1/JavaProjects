package pattern;

public class MadePattern {
    public static void main(String[] args) {
        /**
         * @author Linuxxx/Rudy Peralta
         *
         * Loop runs through 7 times and makes 7 beautiful crossie slashes
         * Other than that it give you a free cup of coffee in the morning
         */
        for (int lines = 7; lines >= 1; lines--) {
            // Prints the stars in each lines in a decrementing order

            for (int i = (lines - 1); i >= 1; i--) {
                System.out.print("*");
            }
            // Prints spaces in the lines after stars

            for (int i = 7; i >= (lines - 1); i--) {
                System.out.print(" ");
            }
            /**
             * Prints slashes in each lines in decreasing orders b/c why not
             * the # of slashes. is printed out and is decreased each time by
             * a factor of 2.
             */

            for (int k = (2 * (lines - 1)); k >= 1; k--) {
                System.out.print("/");
            }

            /**
             *  Print back slashes in each lines with an INCREASING order
             *  The number of lines used should also increase based on the
             *  lines that you're on, by a factor of 2.
             */
            for (int i = 7; i >= (2 * (lines - 3)); i--) {
                System.out.print("\\");
            }
            System.out.print(" "); // Space after each lines (hopefully), does this after printing backslashes


            /**
             * prints stars in each line in a decreasing order
             */

            for (int i = 7; i >= (lines - 1); i--) {
                System.out.print(" ");
            }
            for (int i = (lines - 1); i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
