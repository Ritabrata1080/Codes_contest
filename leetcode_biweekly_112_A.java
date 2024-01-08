import java.util.*;

public class leetcode_biweekly_112_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n;i++){
            nums[i] = sc.nextInt();
        }

        int i = 1;
        
        int sum = nums[0];
        int max = -1, maxi = -1;
        Set<Integer> set = new HashSet<>();
        while(i < n){
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];
                i++;
            }
            
            max = Math.max(max, sum);
        }
        for(int p : nums){
            set.add(p);
            //maxi = Math.max(p, maxi);
        }
        while(set.contains(max)){
            max++;
        }
        System.out.println(max);
    }
}
