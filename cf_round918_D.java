import java.util.*;

public class cf_round918_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t --> 0) {
            long n = sc.nextLong();
            String s = sc.next();
            System.out.println(helper(n, s));
        }
    }
    public static String helper(long n, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);

        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                sb.append(s.charAt(i));
                int j = i + 1;
                if (j == n - 1) {
                } 
                else if (j + 1 <= n - 1) {
                    if (map.getOrDefault(s.charAt(j), 0) == 0 && map.getOrDefault(s.charAt(j + 1), 0) == 0) {
                        sb.append(s.charAt(j));
                        sb.append('.');
                        i = j;
                    } else {
                        sb.append('.');
                    }
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
