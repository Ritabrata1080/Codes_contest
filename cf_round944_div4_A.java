import java.util.Scanner;

public class cf_round944_div4_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.print(Math.min(num1, num2)+ " ");
            System.out.println(Math.max(num1, num2));
        }   
    } 
}

