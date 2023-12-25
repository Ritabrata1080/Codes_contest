import java.util.*;

public class cf_round890_div2_A {

    static int findOperations(int[] arr){
        int pos = -1;
        int i = arr.length - 1;
        while(i > 0 && arr[i] >= arr[i-1]){
            i--;
        }
        i -= 1;
        int max = 0;
        for(int k=0; k<=i; k++){
            if(arr[k] > max){
                max = arr[k];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int ops = 0;
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int res = findOperations(a);
            System.out.println(res);
        }
        
    }
}
