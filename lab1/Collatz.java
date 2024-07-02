/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR zong
 */
public class Collatz {

    public static int nextNumber(int n) {
        return n % 2 == 0 ? n/2 : 3*n + 1;
    }

    public static void main(String[] args) {
        int n = 5;  // Set n equal to any positive integer.
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
