import java.util.Scanner;


public class EZSPEAK_codechef{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            while(i<n-3){
                String check = s.substring(i, i+4);
                if(!check.contains("a") && !check.contains("e") && !check.contains("i") && !check.contains("o") && !check.contains("u")){
                    System.out.println("NO");
                    break;
                }
                i++;
            }
            System.out.println("YES");
        }
    }
}