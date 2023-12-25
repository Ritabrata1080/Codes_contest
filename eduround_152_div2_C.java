import java.util.*;
 
public class eduround_152_div2_C {
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
            List<Pair> list = new ArrayList<>();
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            for(int i = 0;i<m;i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                list.add(new Pair(l, r));
            }
            Set<String> set = new HashSet<>();
            for(Pair p : list){
                StringBuilder sb = new StringBuilder();
                int l = p.x;
                int r = p.y;
                char c[] = s.substring(l-1, r).toCharArray();
                Arrays.sort(c);
                sb.append(s.substring(0,l-1));
                sb.append(String.valueOf(c));
                sb.append(s.substring(r));
                
                set.add(sb.toString());
            }
            System.out.println(set.size());
        }
    }
}