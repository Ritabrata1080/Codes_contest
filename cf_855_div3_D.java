import java.util.*;

public class cf_855_div3_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){

            // abcdef
            
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            Set<String> set = new HashSet<>();
            for(int i = 0;i<n-2;i++){
                String s1 = s.substring(0, i)+ s.substring(i+2);
                set.add(s1);
            }
            set.add(s.substring(0, n-2));
            System.out.println(set.size());
        }
    }
}
