package equestriaBaby;

public class EquestriaBaby {
    /**
     * @author Linuxxx/Rudy Peralta
     */
    public static void main(String[] args) {

        System.out.println("Exercise 1: \n \t Circumferance = " + roadTrip(4));

        System.out.println("Exercise 2: \n \t Distance between all three stops: " + distanceBetween(29, 16, 34, 8, 6, 19));
        totalTrip(29, 16, 34, 8, 6, 19, 16, 14);

    }

    public static double roadTrip(double diameter) {
        double circumferance = diameter * Math.PI;
        return circumferance;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double distanceBetween(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.println("Exercise 3:");
        double distanceOne = distance(x1, y1, x2, y2);
        System.out.println("\t A -> B Distance = " + distanceOne);
        double distanceTwo = distance(x2, y2, x3, y3);
        System.out.println("\t B -> C Distance = " + distanceTwo);
        double totalDistance = distanceOne + distanceTwo;
        System.out.println("\t Total Distance = " + totalDistance);

        return totalDistance;
    }

    public static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        System.out.println("Exercise 4: ");
        double distance1 = distance(x1, y1, x2, y2);
        System.out.println("\t From Baltimare to ManeHattan: " + distance1); // PONY DISTANCE FOR BALTI TO MANE.
        double distance2 = distance(x2, y2, x3, y3);
        System.out.println("\t From ManeHattan to Las Pegasus: " + distance2); // MORE PONY DISTANCE b/w MANE to LP.
        double distance3 = distance(x3, y3, x4, y4);
        System.out.println("\t From Las Pegasus to PonyVille: " + distance3); // MOoooar Pony distance from LP to PonyVille.
        double distance4 = distance(x4, y4, x1, y1);
        System.out.println("\t From PonyVille to Baltimare: " + distance4); // I DONT KNOW WHERE THIS IS. BUT ITS PONYDISTANCE From PonyVille to Balti.
        double total = distance1 + distance2 + distance3 + distance4;
        System.out.println("\n \t Total trip distance = " + total); // TOTAL TRIP FOR THE PONIES

        return total;
    }
}
