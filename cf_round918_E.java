import java.util.*;

public class cf_round918_E {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            long n = sc.nextLong();
            int res = 0;
            Map<Long, Long> map = new HashMap<>();
            int total_size = (int)n;
            long arr[] = new long[total_size];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextLong();
            }
            map.put(0L, 1L);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (isEven(i)) {
                    sum += arr[i];
                } else {
                    sum -= arr[i];
                }
                if (map.containsKey(sum))
                    res = 1;
                else
                    map.put(sum, 1L);
            }
            if (res == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
