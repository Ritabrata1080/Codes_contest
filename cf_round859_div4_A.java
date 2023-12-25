import java.util.*;

public class cf_round859_div4_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x + y == z){
                System.out.println("+");
            }
            else{
                System.out.println("-");
            }
        }
    }
}
