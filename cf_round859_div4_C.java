import java.util.*;

public class cf_round859_div4_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            boolean flag = false;
            for(int i = 0;i<n;i++){
                if(!map.containsKey(c[i])){
                    map.put(c[i] , i%2);
                }
                else{
                    if(map.get(c[i]) != i%2){
                        flag = true;
                        break;
                    }
                }
            }
            System.out.println((flag)?"No":"Yes");
        }
    }
}
