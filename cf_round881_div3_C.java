import java.util.*;

public class cf_round881_div3_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            long n = sc.nextLong();
            long sum = 0;
            for(long i = n;i>0;i/=2){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
