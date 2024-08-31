/**
 * Created by Ritabrata, 31/08/2024
 */


package Codes_contest.binSearch;

import java.util.Scanner;

public class recursiveBinSearch {
    public static int recursionOnArray(int[] a, int n, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (a[mid] == target) {
            return mid;
        } else if (a[mid] > target) {
            return recursionOnArray(a, n, target, low, mid - 1);
        } else {
            return recursionOnArray(a, n, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int targetIndex = recursionOnArray(a, n, target, 0, n - 1);
        System.out.println("Target element found at index : " + targetIndex);
        sc.close();
    }
}
