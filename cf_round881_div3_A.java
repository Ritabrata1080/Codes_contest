import java.util.*;

public class cf_round881_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int l = 0, r = n-1, sum = 0;
            while(l < r){
                sum += Math.abs(a[r] - a[l]);
                l++;
                r--;
            }
            System.out.println(sum);
        }
    }
}
