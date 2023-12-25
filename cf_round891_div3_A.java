import java.util.*;

public class cf_round891_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int counto = 0;
            for(int p : a){
                if(p % 2 == 1){
                    counto++;
                }
            }
            if(counto % 2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
