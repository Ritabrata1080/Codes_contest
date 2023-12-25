import java.util.Scanner;

public class edu_round_151_div2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            boolean flag = false;
            for(int i = k;i >= 1;i--){
                if(i == x){
                    continue;
                }
                else {
                    if(n % i == 0){
                        // int temp = n % i;
                        // int count = 0;
                        // while(temp >= 0){
                        //     count += temp;
                            
                        // }
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
