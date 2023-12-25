import java.util.*;
public class cf_eduround_148_div2_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int sum = 0, z = k;
            for(int p : a){
                sum += p;
            }
            int i = 0, j = n-1;
            int min = 0, max = 0;
            while(k --> 0){
                min += a[i] + a[i+1];
                max += a[j];
                i+=2;
                j--;
            }
            int i1 = 0, j1 = n-1;
            int sum1 = 0;
            while(z --> 0){
                if(a[i1] + a[i1+1] < a[j1]){
                    sum1 = sum1 - (a[i1] + a[i1+1]);
                    i1+=2;
                }
                else{
                    sum1 -= a[j1];
                    j1--;
                }
            }
            sum -= Math.min(min, max);
            System.out.println(Math.min(sum, sum1));
        }

    }
}
