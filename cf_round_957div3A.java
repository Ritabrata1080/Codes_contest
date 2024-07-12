import java.util.*;
public class cf_round_957div3A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = 1;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(a);
            pq.offer(b);
            pq.offer(c);
            int k = 5;
            while(k --> 0){
                int item = pq.poll();
                item ++;
                pq.offer(item);
            }
            while(!pq.isEmpty()){
                result *= pq.poll();
            }
            System.out.println(result);
        }
    }
}