import java.util.*;

public class cf_round886_div4_D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] =sc.nextInt();
            }
            Arrays.sort(a);
            int del = 0, count = 0;
            for(int i = 0;i<n;i++){
                count++;
                if(i == n - 1 || Math.abs(a[i+1] - a[i]) > k){
                    del = Math.max(count, del);
                    count = 0;
                }
               
            }
            System.out.println(n - del);
        }
    }
}