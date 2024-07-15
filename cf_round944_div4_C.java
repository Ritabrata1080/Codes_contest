import java.util.*;

public class cf_round944_div4_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int p = Math.min(a, b);
            int q = Math.max(a,b);
            int r = Math.min(c,d);
            int s = Math.max(c,d);
            if (((p < r) && (q > s)) || ((p > r) && (q < s)) || (q < r) || (s < p)){
                System.out.println("NO");
            }
            else{
                System.out.println("YEs");
            }
        }
    }
}
