import java.util.*;
public class cf_round_871_div4_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            String cmp = "codeforces";
            int i = 0, count = 0;
            while(i< s.length()){
                if(cmp.charAt(i) != s.charAt(i)){
                    count++;
                }
                i++;
            }
            System.out.println(count);
        }
    }
}
