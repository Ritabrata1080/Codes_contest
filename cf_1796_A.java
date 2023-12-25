import java.util.*;
public class cf_1796_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            // StringBuilder check = new StringBuilder();
            // for(int i = 3;i<=45;i++){
            //     if(i % 3 == 0){
            //         check.append("F");
            //     }
            //     else if(i % 5 == 0){
            //         check.append("B");
            //     }
            //     // else if(i % 3 == 0 && i % 5 == 0){
            //     //     check.append("FB");
            //     // }
            // }
            String check = "FBFFBFFBFBFFBFFBFBFFBFFBFBFFBFFBFBFFBFFBFB";
            System.out.println(check.contains(s) ? "YES" : "NO");
        }
    }
}
