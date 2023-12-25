import java.util.*;
import java.util.Scanner;

public class cf_round_828_div3_B {

static class Pair{
    long x, y;
    Pair(long x, long y){
        this.x = x;
        this.y = y;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }

            long sum = 0;
            for(long p : a){
                sum += p;
            }
            long counte = 0, counto = 0;
            for(long p : a){
                if(p % 2 == 0){
                    counte ++;
                }
                else{
                    counto ++;
                }
            }
            List<Pair> list = new ArrayList<>();
            for(int i = 0;i<k;i++){
                int x = sc.nextInt();
                int xi = sc.nextInt();
                list.add(new Pair(x, xi));
            }
            for(Pair p : list){
                if(p.x == 0){
                    sum += counte*p.y;
                    System.out.println(sum);
                }
                else{
                    if(p.x == 1){
                        sum += counto*p.y;
                    }
                    System.out.println(sum);
                }
            }
         
        
        }
    }
}
