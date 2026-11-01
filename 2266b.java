import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int d1=Math.abs(a-b);
            int d2=Math.abs((a+c)-b);
            int result=Math.max(d1, d2);
            System.out.println(result);
        }

        sc.close();
    }
}
