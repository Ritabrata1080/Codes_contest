/**
 * Created by Ritabrata, 31/08/2024
 */

package Codes_contest.binSearch;

import java.util.Scanner;

public class iterativeBinSearch {
    public static int binSearchIteration(int[] a, int n, int t) {
        int low = 0;
        int high = n - 1;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == t) {
                return mid;
            } else if (t > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = binSearchIteration(a, n, target);
        System.out.println((index != -1) ? "Target is found" : "Target is not found");
        System.out.println("Target element is found at index : " + index);
        sc.close();
    }
}
