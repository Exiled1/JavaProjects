package testPackage;

/*
 * 	Written By:
 *  @Linuxxx / RudyPeralta
 */

import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        int repetitions = 0;
        String string = "rawr";
        multiprint(string, repetitions);
        badPrint(string, repetitions);
    }

    public static void multiprint(String string, int repetitions) {
        System.out.print("[");
        for (int i = 1; i <= repetitions; i++) {

            System.out.print(string);
            if (i < repetitions) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void badPrint(String string, int repetitions) {
        System.out.print("[" + string);
        for (int i = 2; i <= repetitions; i++) {
            System.out.print("," + string);
        }
        System.out.print("]");
    }
}



