import java.util.*;
public class cf_round860_div2_A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
            }
            int max1 = -1, max2 = -1;
            for(int i = 0;i<n;i++){
               
                if(a[i] > b[i]){
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                }
                max1 = Math.max(max1, a[i]);
                max2 = Math.max(max2, b[i]);
            }
            if(a[n-1] == max1 && b[n-1] == max2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}