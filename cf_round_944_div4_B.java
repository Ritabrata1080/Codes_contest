import java.util.*;

public class cf_round_944_div4_B {
    public static void checkCase(String s){
        Set<Character> set = new HashSet<>();
            char c[] = s.toCharArray();
            for(char c1 : c){
                set.add(c1);
            }
            if(set.size() == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                StringBuilder sb = new StringBuilder();
                sb.append(s.substring(1, s.length()));
                sb.append(String.valueOf(s.charAt(0)));
                System.out.println(sb.toString());
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            sc.nextLine();
            checkCase(s);
        }
    }   
}
