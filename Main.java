import java.util.*;

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
            int even=0;
            int odd=0;
            for(int x:a){
                if(x%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            int result=Math.max(even, odd);
            System.out.println(result);
           
        }

        sc.close();
    }
}

