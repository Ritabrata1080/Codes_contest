import java.util.*;

public class cf_round806_div4_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t --> 0){
            int points = 0;
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for(char c: ch){
                if(!map.containsKey(c)){
                    map.put(c, 2);
                }
                else{
                    map.put(c, map.get(c)+1);
                }
            }
            for(char c : map.keySet()){
                points += map.get(c);
            }
            System.out.println(points);
        }
    }
}
