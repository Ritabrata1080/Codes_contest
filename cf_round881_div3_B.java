import java.util.*;

public class cf_round881_div3_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0, ops = 0;
            boolean flag = true;
            for(int i = 0;i<n;i++){
                a[i] = sc.nextLong();
            }
            for(int i = 0;i<n;i++){
                sum += Math.abs(a[i]);
            }
            for(int i = 0;i<n;i++){
                if(flag && a[i] < 0){
                    ops++;
                    flag = false;
                }
                
                else if(!flag && a[i] <= 0){

                }
                else if(a[i] > 0){
                    flag = true;
                    
                }
            }
            System.out.println(sum + " " + ops);
        }
    }
}
