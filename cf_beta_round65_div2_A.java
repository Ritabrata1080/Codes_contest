import java.util.*;

public class cf_beta_round65_div2_A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            if(s.length() <= 10){
                System.out.println(s);
            }
            else{
                String s1 = String.valueOf(s.charAt(0));
                String s2 = String.valueOf(s.charAt(s.length() - 1));
                String smid = String.valueOf(s.length() - 2);
                
                System.out.println(s1+smid+s2);
            }
        }
    }
}