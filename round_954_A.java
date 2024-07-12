import java.util.*;

public class round_954_A{
    // public static int max(int x, int y, int z){
    //     if(x >= y && x >= z){
    //         return x;
    //     }
    //     else if(y >= x && y >= z){
    //         return y;
    //     }
    //     else{
    //         return z;
    //     }
    // }
    // public static int min(int x, int y, int z){
    //     if(x <= y && x <= z){
    //         return x;
    //     }
    //     else if(y <= x && y <= z){
    //         return y;
    //     }
    //     else{
    //         return z;
    //     }
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // int max_val = max(a, b, c);
            // int min_val = min(a, b ,c);
            // System.out.println(max_val - min_val);

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(a);
            pq.offer(b);
            pq.offer(c);
            int min = pq.poll();
            pq.poll();
            int max = pq.poll();
            System.out.println(max - min);
        }
    }
}