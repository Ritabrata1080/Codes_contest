import java.util.*;


class Pair{
    String y;
    int x;
    Pair(String y, int x){
       this.y = y;
       this.x = x;
    }
}
public class cf_round_871_div4_C {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            // PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            //     return a.x - b.x;
            // });
            for(int i = 0;i<n;i++){
                int x = sc.nextInt();
                String s = sc.next();
                Pair p = new Pair(s, x);
                // pq.offer(p);
            }
            // for(Pair p1 : pq){
            //     System.out.println(p1.x + " "+ p1.y);
            // }
        }
    }
}
