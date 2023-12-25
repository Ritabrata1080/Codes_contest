import java.util.*;
import java.util.Scanner;

public class cf_886_div4_B {
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
            int max = -1, ans = -1;
            int n = sc.nextInt();
            for(int i = 0;i<n;i++){
                int w = sc.nextInt();
                int q = sc.nextInt();
                list.add(new Pair(w,q));
            }
            for(int i = 0;i<n;i++){
                if(list.get(i).x <= 10 && max<list.get(i).y){
                    max = list.get(i).y;
                    ans = i;   
                }
            }
            System.out.println(ans+1);
            
        }
    }
}
