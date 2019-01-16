package practiceIt;

public class Practice_3_17 {
    public static void main(String[] args) {
        System.out.println(countQuarters(300025));
    }

    public static int countQuarters(int cents) {
        int totalQuarters = (cents % 100) / 25;

        return totalQuarters;
    }
}
