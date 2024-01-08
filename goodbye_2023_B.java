import java.util.*;

public class goodbye_2023_B {
    public static long coprime(long a, long b){
        if(a == 0 || b == 0){
            return 0;
        }
        if(a == b){
            return a;
        }
        if(a > b){
            return coprime(a-b, b);
        }
        return coprime(a, b - a);

    }

    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       
       while(t --> 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            helper(a, b);
       }
    }
    public static void helper(long a, long b){
        
        
        long gcd = coprime(a, b);  
        long result = (a * b) / gcd;
        if(result == b){
            System.out.println(result * (b / gcd));
        }
        else{
            System.out.println(result);
        }
       
    }
}
