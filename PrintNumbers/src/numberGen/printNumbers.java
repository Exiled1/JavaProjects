package numberGen;

public class printNumbers {

    public static void main(String[] args) {
        printNumbers(15);
    }

    public static void printNumbers(int maximum) {
        for (int minimum = 1; minimum <= maximum; minimum++) {
            System.out.print("[");
            System.out.print(minimum);
            System.out.print("] ");
        }

        System.out.println();
    }

}
