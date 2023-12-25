import java.util.*;

public class contest_1914_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i = n - k; i <= n; i++){
                System.out.print(i + " ");
            }
            for(int i = n - k - 1; i >= 1; i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }    
}
