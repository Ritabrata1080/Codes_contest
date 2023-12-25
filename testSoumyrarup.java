import java.util.*;
public class testSoumyrarup {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        for(int i=1;i<=t; i++) {
            String res = "";
            for(int j = 1; j<=8; j++) {
                String inp = obj.nextLine();
                for(int k = 0; k<inp.length();k++) {
                    if(inp.charAt(k)>='a' && inp.charAt(k)<='z') {
                        res+= String.valueOf(inp.charAt(k));
                    }
                }
            }
            System.out.println(res);
        }
    }
}