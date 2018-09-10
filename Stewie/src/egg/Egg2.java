package egg;
import static egg.Egg.*;
/*
@Author Rudy Peralta
As was mentioned in Egg, Egg2 has no methods of its own, but instead relies on Egg
to give it access to the methods that have the egg painted
 */
public class Egg2 {
    public static void main(String[] args) {
        TopEgg(); //Calls upon Egg's TopEgg method
        BottomEgg(); //Same but for BottomEgg
        MiddleEgg(); //Same but for MiddleEgg
        TopEgg(); //See Above
        BottomEgg(); //See Above
    }
}
