import java.util.*;

public class cf_round_870_div2_B {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int ans = 0;
            for(int i = 0;i<n;i++){
                ans = gcd(Math.abs(a[i] - a[n-i-1]), ans);
            }
            System.out.println(ans);
        }
    }
}
