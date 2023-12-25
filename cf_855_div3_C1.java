import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class cf_855_div3_C1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
            long power = 0;
            for(int i = 0;i<n;i++){
                if(a[i] == 0){
                    if(pq.size() > 0){
                        power += pq.peek();
                        pq.poll();
                    }
                }
                else{
                    pq.offer(a[i]);
                }
            }
            System.out.println(power);
        }
    }
}
