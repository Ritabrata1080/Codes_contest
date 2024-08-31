/**
 * Created by Ritabrata, 01/09/2024
 */

package Codes_contest.binSearch;

import java.util.Scanner;

/**
 * Given a sorted array nums of distinct integers and a target value x. You need to
 * search for the index of the target in the array
 * <p>
 * If the value is present, return the index
 * if the value is not present, determine the index where it would be inserted
 * in the array while maintaining the sorted order
 */
public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int pos = searchInsert(a, target);
        System.out.println("Insert position is : " + pos);
    }
}
