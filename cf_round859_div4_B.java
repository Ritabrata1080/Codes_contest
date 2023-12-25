import java.util.*;

public class cf_round859_div4_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int countA = 0, countM = 0;
            for(int p : a){
                if(p % 2 == 0){
                    countM+=p;
                }
                else{
                    countA+=p;
                }
            }
            System.out.println((countM>countA)?"Yes":"No");
        }
    }
}
