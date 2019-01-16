package weatherProgram;

import java.util.Scanner;

/**
 * @Author Rudy Peralta/Linuxxx
 */

public class Weather {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the amount of days you wanna calc the weather for");
        int numberOfDays = userInput.nextInt();//Days given in.
        int[] temperatures = new int[numberOfDays]; //FINALLY I'M ALLOWED TO USE ARRAYS!!!
        // ^^ = VSA's for the WIIIINNNNNNNNN <3
        int placeholder = 0;
        /**I need to keep track of numbers while I'm going through the array
         * Theres a much more effective way to do this since the time complexity of this is
         * pretty bad due to the fact that I'm creating an array and iterating through every
         * input, but we haven't been taught those kinds of CS algorithms yet. ;-;
         * ---------------------------------------------------------------------------------
         * I mean, what I could do here is use some things in the Array library and just
         * add up all the values there, as opposed through iterating through everything...
         * I mean, is it more work to ask for the values beforehand and then just parsing them
         * in as opposed to dynamically adding them into the array? I personally don't know
         * and I'm rather sleepy, so heres the rest of the program.
         */
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Day " + (i + 1) + "'s high temperature: ");
            temperatures[i] = userInput.nextInt();
            placeholder = placeholder + temperatures[i]; // Yes, I know I can use += but I'd prefer to know for sure, for science of course
        }

        //Take the average & the number of days that were greater than the average temp.
        double average = (double) placeholder / numberOfDays;
        int aboveAvgCounter = 0; //Keeps track of the temps above average.

        for (int i = 0; i < temperatures.length; i++) { //Start
            if (temperatures[i] > average) {
                aboveAvgCounter++; //Pretty simple; Go through the array & check to see if its above my calculated average.
            }
        }//Stop

        System.out.printf("Avg temperature = %.2f%n", average);
        System.out.println(aboveAvgCounter + " days were higher than average.");

        /**
         * OKAY, before I get docked points for using printf, I swear I had a good reason! Okay.
         * So, printf comes equipped with the ability to tackle precision in its output, as is shown here in the printf quick reference sheet.
         * link: https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
         * The arguments are as such:
         * % [flags][width][precision] conversion-character
         * I care most about the optional precision parameter though, if I use %.2f, this means it'll take
         * the output and specifies the number of digits of precision that I want when outputting
         * floating-point values, and since Math.round doesn't do what I want here I feel the need to use printf since
         * we briefly covered it once.
         * ----------------------------------------------
         * In this specific case I want up to 2 digit precision, and theres a newline there too (%n instead of \n since it gives more compatibility *shrug*)
         */

    }
}

