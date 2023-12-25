import java.util.*;
public class cf_eduround151_div2_B{
    public static long calc(long a, long b, long c){
        if(b >= a && c >= a){
            return Math.min(b-a, c-a);
        }
        if(b <= a && c <= a){
            return Math.min(a - b, a - c);
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long xa = sc.nextLong();
            long ya = sc.nextLong();
            long xb = sc.nextLong();
            long yb = sc.nextLong();
            long xc = sc.nextLong();
            long yc = sc.nextLong();
            long dist = calc(xa, xb, xc) + calc(ya, yb, yc);
            dist++;
            System.out.println(dist);
         
        }
    }
}