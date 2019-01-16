public class MathClass {
    //prove that for every integer N there exists an N-digited number that is divisible by 5^n.

    int n = 0;

    /**
     * @param args We prove this by induction. You have already shown that it is true for n=1,2,3.
     *             <p>
     *             Suppose that for some specific n≥3 we have an integer a=5nb such that a has n digits and every digit is odd.
     *             Consider the number a′=a+10nk, where 1≤k<10.
     *             Clearly this is a number of n+1 digits; all of them, except perhaps the first, are odd;
     *             we shall show that it is possible to choose k, also odd, such that a′ is a multiple of 5n+1.
     *             <p>
     *             To make a′ a multiple of 5^n+1 we require 5^n+1∣5^n * b+10^n * k, that is,
     *             5∣b+2nk .
     *             Since 5 and 2n are coprime, this has a unique solution with 1≤k≤5. If k=2 or k=4 we can replace it by k=7 or k=9 respectively;
     *             therefore we can always satisfy the divisibility with an odd value of k.
     *             <p>
     *             5∣b+2^n * k
     *             <p>
     *             for n=1,5, n = 1, k = 5
     *             n=2,75, n = 2, k = 5,
     *             n=3,375.......
     *             n = 4, 625 / 5^4
     *             <p>
     *             a = (5^n)*b
     *             aPrime 5^n+1
     *             5^(4+1)/5^4 * b + 10^4 * k
     */
    public static void main(String[] args) {
        int n = 1;
        int k = 2;

        // nPrime must have n digits and every digit is odd.
        int nPrime = n + 10 + n * k;
        //
        //5^n + 1/5^n * b + 10nk
        //
    }

    public static boolean NMath(int n) {
        boolean proved = false;
        int nDigits = n;


        return proved;
    }

}
