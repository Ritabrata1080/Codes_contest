import java.util.Scanner;

public class left_rotate_array_by1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        for(int p : a){ 
            System.out.print(p+" ");
        }
        System.out.println();
    }
}
