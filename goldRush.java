
import java.util.*;
import java.io.*;

public class goldRush {
    
    static boolean helper(int n, int m){
        if(n < m)
           return false;
        else if(n == m)
           return true;
        else if(n % 3 != 0){
            return false;
        }
        return helper(n/3 * 2, m) || helper(n/3, m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean res = helper(n, m);
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
