import java.util.*;

public class cf_round762_div3_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for(int i = 1;i*i<=n;i++){
                if(i*i <= n){
                    set.add(i*i);
                }
            }
            for(int i = 1;i*i*i<=n;i++){
                if(i*i*i<=n){
                    set.add(i*i*i);
                }
            }
            System.out.println(set.size());
        }
    }
}

