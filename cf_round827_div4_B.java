import java.util.*;
import java.util.Scanner;

public class cf_round827_div4_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int p : a){
            set.add(p);
        }
        if(set.size() == n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
        
    }
}
