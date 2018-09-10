package egg;
/*
@Author Rudy Peralta
Also, egg2 depends on egg to be able to function, since they are a part of the same package,
egg2 takes the static methods from egg and uses it natively
 */
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
