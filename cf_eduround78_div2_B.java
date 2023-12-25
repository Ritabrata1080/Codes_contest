import java.util.*;

public class cf_eduround78_div2_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;  
            if(a == b){
                System.out.println(0);
            }
            while(a != b){
                a += 1;
                b += 2;
            }
        }
    }
}
