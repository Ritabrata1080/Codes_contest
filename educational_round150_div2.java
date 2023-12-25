import java.util.Scanner;

public class educational_round150_div2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            if(n < 5){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
