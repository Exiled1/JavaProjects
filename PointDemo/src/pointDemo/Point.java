package pointDemo;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() { //When does this actually do anything with the code? We didnt call it or anything like that.
        return "(" + x + ", " + y + ")";
    }

    public double distanceTo(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
    }

    public boolean equals(Point otherPoint) {
        return ((otherPoint.x == this.x) && (otherPoint.y == this.y));
    }

    public static void main(String[] args) {
        Point a = new Point(3.0, 7.0);
        System.out.println(a);
        Point c = new Point(3.0, 7.0);
        System.out.println("Point a = " + c);
        if (a.equals(c)) {
            System.out.println(a + "==" + c);
        } else {
            System.out.println(a + "!=" + c);
        }
    }
}
