package pointDemo;

public class PointClient {
    public static void printPoint(Point p) {
        System.out.println(p.x);
        System.out.println(p.y);
    }

    public static void main(String[] args) {

        Point a = new Point();
        Point b = new Point();
        Point c = a;

        a.x = 7;
        a.y = 9;
        b.x = 15;
        b.y = 3;
        c.x = 500;

        printPoint(a);
        printPoint(b);
        /**
         * Dog adorableness.
         * Psfbool goodBoi = true;
         * boolean isCat = false;
         * String dogBreed.
         */

    }

}
