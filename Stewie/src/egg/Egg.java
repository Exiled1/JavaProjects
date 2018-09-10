package egg;

public class Egg {
    public static void main(String[] args) {
        WholeEgg();
    }
    public static void WholeEgg(){
        TopEgg();
        MiddleEgg();
        BottomEgg();
    }
    public static void TopEgg(){
        System.out.println("\t /¯¯¯¯¯¯¯¯\\");
        System.out.println("\t/\t\t   \\");
    }
    public static void MiddleEgg(){
        System.out.println("\t-\"-'-\"-'-\"-");
    }
    public static void BottomEgg(){
        System.out.println("\t\\\t\t   /");
        System.out.println("\t \\________/");
    }
}
