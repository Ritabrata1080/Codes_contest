import java.util.*;

public class cf_round874_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            Set<String> set = new HashSet<>();
            for(int i = 0;i<n-1;i++){
                sb.append(s.substring(i, i+2));
                sb.append(sb.toString());
                set.add(sb.toString());
                sb.setLength(0);
            }
            System.out.println(set.size());
        }
    }
}
