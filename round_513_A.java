import java.util.Scanner;

public class round_513_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int dig_length = n/11;
        char c[] = s.toCharArray();
        int count = 0;
        for(char c1 : c){
            if(c1 == '8'){
                count++;
            }
        }
        System.out.println(Math.min(count, dig_length));

    }
}
