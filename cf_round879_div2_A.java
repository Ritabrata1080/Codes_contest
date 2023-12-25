import java.util.*;
public class cf_round879_div2_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int ans = 0;
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                int a = sc.nextInt();
                list.add(a);
            }
            int countneg = 0, countpos = 0;
            for(int p : list){
                if(p > 0){
                    countpos++;
                }
                else{
                    countneg ++;
                }
            }
            while(countneg > countpos){
                countneg--;
                ans++;
                countpos++;
            }
            if(countneg %2 == 1){
                ans++;
            }
            System.out.println(ans);
        }
    }
}
