package stewie2;
/*
Actually... the book doesn't directly say not to use variables,
It simply says to use at least one static method besides main,
:ThinkingEmoji:
@Author Rudy Peralta
 */

public class Stewie2 {

    public static String firstLine = "//////////////////////";
    public static String victoryIsMine = "|| Victory is mine! ||";
    public static String escapeSequence = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";

    public static void main(String[] args) {
        CompleteSquare(); // This one is a completed square
        IncompleteSquare(); // Uses an incomplete square for easy completion.
        IncompleteSquare();
        IncompleteSquare();
        IncompleteSquare();
    }
    public static void CompleteSquare() { // Complete Square
        System.out.println(firstLine + "\n" + victoryIsMine + "\n" + escapeSequence);
        //Uses variables to shorten this by 6-8 lines of code

    }

    private static void IncompleteSquare() { // Incomplete square to finish fast
        System.out.println(victoryIsMine + "\n" + escapeSequence);
        //Uses predefined variables to avoid 3-5 more liens of code

    }

}
