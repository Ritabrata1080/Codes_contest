import java.util.*;

public class cf_886_div4_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int count = 0;
            for(int i = 1;i<n;i++){
                if(a[i] - a[i-1] > k){
                    count++;
                    i++;
                }
            }
            System.out.println(a.length - count-1);
        }
    }
}
