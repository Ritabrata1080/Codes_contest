import java.util.*;
public class cf_round_898_div4_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int p : a){
                min = Math.min(p, min);
            }
            int ind = 0, mul = 1;
            for(int i = 0;i<n;i++){
                if(a[i] == min){
                    ind = i;
                    break;
                }
            }
            for(int i = 0;i<n;i++){
                if(i != ind){
                    mul *= a[i];
                }
            }
            mul *= (min+1);
            System.out.println(mul);
        }
    }
}
