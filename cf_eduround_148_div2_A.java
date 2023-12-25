import java.util.*;

public class cf_eduround_148_div2_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            int n = s.length();
            for(int i = 0;i<n/2;i++){
                set.add(s.charAt(i));
            }
            System.out.println((set.size()>1)?"Yes":"NO");

        }
    }
}
