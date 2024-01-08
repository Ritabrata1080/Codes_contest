import java.util.*;

public class goodbye_2023_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long tc = sc.nextLong();
        while(tc --> 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long target_num = 2023;
            long prod = 1;
            for(int i = 0;i<n;i++){
                long input = sc.nextLong();
                prod *= input;
            }

            if(target_num % prod == 0){
                System.out.println("YES");
                System.out.println((target_num/prod) + " ");
                for(int i = 1;i<k;i++){
                    System.out.println(1+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
