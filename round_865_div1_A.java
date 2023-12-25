import java.util.Scanner;

public class round_865_div1_A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int count_neg = 0;
            int count_pos = 0;
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 1;i<n;i++){
                if(a[i] - a[i-1] >= 0){
                    count_pos++;
                }
                else{
                    count_neg++;
                }
            }
            if(count_pos >= count_neg || (count_neg %2 == 0 && count_pos == 0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}