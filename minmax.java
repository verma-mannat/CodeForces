import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int count0 = 0;
            int count1 = 0;

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();

                if (value == 0) {
                    count0++;
                } else {
                    count1++;
                }
            }

            // Agar zeros zyada hain, Elsie wins
            // Equal ya ones zyada hain, Bessie wins
            if (count0 > count1) {
                System.out.println("Elsie");
            } else {
                System.out.println("Bessie");
            }
        }

        sc.close();
    }
}