package spaceNeedle;

public class Needle {
    final static int SIZE = 4; // Whenever this thing is changed the entire program adapts to it.

    public static void main(String[] args) {
        needle();
        upperDomeHalf();
        spacingPortion();
        bottomDomeHalf();
        needle();
        body();
        upperDomeHalf();
        spacingPortion();
    }

    // Prints out needle portion.

    public static void needle() {
        for (int i = 1; i <= SIZE; i++) {
            for (int space = 1; space <= (SIZE * 3); space++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    // Prints out upper dome half

    public static void upperDomeHalf() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= SIZE - line; space++) {
                System.out.print("   ");
            }
            System.out.print("__/");
            for (int j = 1; j <= line - 1; j++) {
                System.out.print(":::");
            }
            System.out.print("||");
            for (int i = 1; i <= line - 1; i++) {
                System.out.print(":::");
            }
            System.out.println("\\__");
        }
    }

    // Prints out a horizontal line to space out all of the pieces.

    public static void spacingPortion() {
        System.out.print("|");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("\"\"\"\"\"\"");
        }
        System.out.println("|");
    }

    //Prints out bottom half of dome thing.

    public static void bottomDomeHalf() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= (line * 2) - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = 1; j <= (((SIZE * 3) + 1) - (line * 2)); j++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

    //Prints out body of the space needle.
    public static void body() {
        for (int line = 1; line <= SIZE * SIZE; line++) {
            for (int space = 1; space <= (SIZE * 3) - 3; space++) {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }
}

