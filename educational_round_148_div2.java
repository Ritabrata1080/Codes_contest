import java.util.Scanner;

public class educational_round_148_div2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int state = 0, count = 0;
            for(int i = 1;i<n;i++){
                if(a[i] > a[i-1] && state != 1){
                    count++;
                    state = 1;
                }
                else if(a[i] < a[i-1] && state != -1){
                    count++;
                    state = -1;
                }
            }
            System.out.println(count+1);
        }
    }
}
