/**
 * Created by Ritabrata, 31/08/2024
 */

package Codes_contest.binSearch;

import java.util.Scanner;


/**
 * Lower bound of an integer x, in a sorted array of integers is defined by the smallest index in the array
 * for which, the value of the element in that index is not less/greater than x.
 * <p>
 * example : arr[] = {1,2,4,6,9,34,56} , x = 30 ==> result = 5 [index at which the value is just greater than x]
 */
public class implementLowerBound {
    public static int findLowerBound(int[] a, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= x) {
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
        int x = sc.nextInt();
        int result = findLowerBound(a, n, x);
        System.out.println("Lower bound is : " + result);
    }
}
