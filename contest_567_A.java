import java.util.*;
public class contest_567_A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(i == 0){
                int min = a[1] - a[0];
                int max = a[n-1] - a[i];
                System.out.println(min +" "+ max);
            }
            else if(i == n-1){
                int min = a[i] - a[i-1];
                int max = a[i] - a[0];
                System.out.println(min +" "+ max);
            }
            else{
                int min = Math.min(a[i] - a[i-1], a[i+1] - a[i]);
                int max = Math.max(a[i] - a[0], a[n-1] - a[i]);
                System.out.println(min +" "+ max);
            }
        }
    }
}