import java.util.*;

public class lc_biweekly_120_1 {

    public int incremovaleSubarrayCount(int[] nums){
        int n = nums.length;
        int result = 0;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int subarray[] = Arrays.copyOfRange(nums, i, j+1);
                if(isTrue(concat(Arrays.copyOfRange(nums, 0, i), Arrays.copyOfRange(nums, j+1, n))) && subarray.length > 0){
                    result++;
                }
            }
        }
        return result;
    }

    public boolean isTrue(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] <= arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public int[] concat(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[m+n];
        System.arraycopy(arr1, 0, res, 0, m);
        System.arraycopy(arr2, 0, res, m, n);
        return res;
    }
}
