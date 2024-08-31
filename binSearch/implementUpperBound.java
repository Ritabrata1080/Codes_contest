/**
 * Created by Ritabrata, 01/09/2024
 */

package Codes_contest.binSearch;

import java.util.Scanner;

/**
 * Upper bound of x in an array, is the smallest index at which the element is strictly greater than x.
 *
 * eg : arr[] = {2,3,4,5,5,5,7,8,8}, x = 5 ; result index ==> 6
 */
public class implementUpperBound {
    public static int findUpperBound(int[] a, int n, int x) {
        int ans = n;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > x) {
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
        int res = findUpperBound(a, n, x);
        System.out.println("Upper bound is : " + res);
    }
}
