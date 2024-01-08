import java.util.*;

public class leetcode_biweekly_121_C {
    static int helper(int x, int y, int minOperations, Queue<Integer> q){
        if(x == y)
            return minOperations;
        if(x % 11 == 0){
            helper(x / 11, y, minOperations + 1, q);
            q.add(x / 11);
        }
        if(x % 5 == 0){
            helper(x / 5, y, minOperations + 1, q);
            q.add(x / 5);
        }
        if(x < y){
            helper(x + 1, y, minOperations + 1, q);
            q.add(x + 1);
        }
        if(x > y){
            helper(x - 1, y, minOperations + 1, q);
            q.add(x - 1);
        }
        return minOperations;
    }
    public static void main(Str)
}
