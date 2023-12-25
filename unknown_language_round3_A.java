import java.util.*;

public class unknown_language_round3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int n1 = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += n1*n1;
        }
        if(sum >= n*n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
