import java.util.*;
public class cf_round_888_div3_B{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = a[i];
            }
            Arrays.sort(arr);
            boolean flag = false;
            for(int i = 0;i<n;i++){
                if(arr[i] % 2 == 0 && a[i] % 2 != 0 || arr[i] % 2 != 0 && a[i] % 2 == 0){
                    flag = true;
                    break;
                }
               
            }
            if(flag){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}