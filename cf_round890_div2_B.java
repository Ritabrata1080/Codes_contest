import java.util.*;

public class cf_round890_div2_B {
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
           
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            long count = 0;
            for(int i = 0;i<n;i++){
                a[i] = sc.nextLong();
                if(a[i] == 1){
                    count++;
                }
                sum += a[i];
            }
            if((sum - n) >= count && n != 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
