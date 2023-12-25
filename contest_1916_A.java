import java.util.*;

public class contest_1916_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int count = 0;
            int len = sc.nextInt();
            String s = sc.next();

            // 7
            // A  A A A   FPC
            
            Map<Character, Integer> map = new HashMap<>();
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }


            Set<Character> set = new HashSet<>();
            for(char c : s.toCharArray()){
                if(!set.contains(c) && map.get(c) >= c - 'A' + 1){
                    count++;
                    set.add(c);
                }
            }
            System.out.println(count);
        }
        
    }

    
}


