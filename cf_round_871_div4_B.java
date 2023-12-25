import java.util.Scanner;

public class cf_round_871_div4_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int i = 0, count = 0, ans = 0;
            while(i<n){
                if(a[i] == 0){
                    count++;
                    ans = Math.max(count, ans);
                    i++;
                }
                else{
                    count = 0;
                    i++;
                }
                
            }
            System.out.println(ans);
        }
    }

}
