import java.util.*;

public class cf_round764_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int p : a){
                max = Math.max(max, p);
                min = Math.min(min, p);
            }
            System.out.println(max - min);
        }
    }
}


