import java.util.*;

import java.io.*;


public class cf_round891_div3_B {
    
    static int[] solve(int n, int[] b){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        int x = 0;
        int a[] = new int[n];
        int sum = 0;
        for(Integer it : set){
                a[x++] = it;
                sum += Math.abs(it);
        }
        a[n - 1] = sum;
        if(set.size() == 1){
            int ele = 0;
            for(Integer it : set){
                ele = it;
            }
            for(int i=1; i<n-1; i++){
                a[i] = ele;
            }
        }
        return a;
    }
    public static void main(String[] args)throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int[] b = new int[n*(n-1)/2];
            for(int j=0; j<b.length; j++){
                b[j] = sc.nextInt();
            }
            int[] res = solve(n, b);
            for(int k=0; k<res.length; k++){
                System.out.print(res[k]+" ");
            }
            System.out.println();
        }
    }
}

















