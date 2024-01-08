import java.util.*;

public class cf_round918_C {
    public static boolean helper(long num){
       long side = (long) Math.sqrt(num);
       return side * side == num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long sum = 0;
            for(long p : a){
                sum += p;
            }
            boolean res = helper(sum);
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
