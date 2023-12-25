import java.util.*;

public class eduround_152_div2_B {
    static class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            PriorityQueue<Pair> pq = new PriorityQueue<>((a1,b1) -> {
                if(a1.x == b1.x){
                    return  a1.y - b1.y;
                }
                else{
                    return b1.x - a1.x;
                }
            });
            for(int i = 0;i<n;i++){
                pq.offer(new Pair(a[i], i));
            }
            List<Integer> list = new ArrayList<>();
            while(!pq.isEmpty()){
                int health = pq.peek().x;
                int ind = pq.poll().y+1;
                
                if(health - k <= 0){
                    list.add(ind);
                    
                }
                else{
                    pq.offer(new Pair((health - k)%k, ind-1));
                }
            }
            for(int p : list){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
