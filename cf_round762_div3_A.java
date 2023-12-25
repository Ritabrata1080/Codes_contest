import java.util.Scanner;

public class cf_round762_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            if(s.length() % 2 == 1){
                System.out.println("NO");
            }
            else{
                String s1 = s.substring(0, s.length()/2);

                String s2 = s.substring(s.length()/2);

                if(s1.equals(s2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
