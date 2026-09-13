import java.util.*;
/*
phele scanner class banega.....
phir no. of test case ka input..
phir while loop ke ander code...
size of array ka input..
agar size of array odd h toh answer NO as odd length mei thershhold value nhi milega..
isse continue kiya taki iteration skip ho jaye or ye next test case par chala jaye...
agar even h toh aage maxEven or minOdd nikalenge..
maxeven , even index mai se max value vice versa minodd,
phir array traverse krenge loop se agar maxeven+<minodd h toh value exist krti h */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            int maxEven = 0;
            int minOdd = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                // i=0 means position 1 (odd position)
                if (i % 2 == 0) {
                    minOdd = Math.min(minOdd, a[i]);
                } 
                else {
                    maxEven = Math.max(maxEven, a[i]);
                }
            }

            if (maxEven + 1 < minOdd)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}