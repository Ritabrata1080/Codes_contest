import java.util.*;

public class cf_round859_div4_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0;j<q;j++){
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                for(int i1 = l-1;i1 <= r-1;i1++){
                    a[i1] = k;
                }
                int sum = 0;
                for(int p : a){
                    sum += p;
                }
                System.out.println((sum%2 == 1)?"Yes":"No");
            }
            
        }
    }
}
