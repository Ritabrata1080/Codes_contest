import java.util.*;

public class cf_round918_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            map.put(a, map.getOrDefault(a,0)+1);
            map.put(b, map.getOrDefault(b,0)+1);
            map.put(c, map.getOrDefault(c,0)+1);
            int val = -1;
            for(int p : map.keySet()){
                if(map.get(p) == 1){
                    val = p;
                    break;
                }
            }
            System.out.println(val);
        }
    }
}
