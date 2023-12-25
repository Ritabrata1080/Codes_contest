import java.util.*;

public class cf_round_887_div2_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1;i<n;i++){
            if(a[i] - a[i-1] < 0){
                ans = 0;
                break;
            }
            else{
                ans = Math.min(ans, (a[i] - a[i-1])/2 + 1);
            }
        }
        System.out.println(ans);
        }
    }
}
