import java.util.Scanner;

public class cf_round879_div2_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String l = sc.next();
            String r = sc.next();
            String lnew = "";
            String rnew = "";
            // while(l.length() <= r.length()){
            //     l = "0"+l;
            // }
            // while(r.length() <= l.length()){
            //     r = "0"+r;
            // }
            int ans = 0;
            boolean append9 = false;
            for(int i = 0;i<l.length();i++){
                if(append9){
                    ans += 9;
                    continue;
                }
                if(l.charAt(i) != r.charAt(i)){
                    int t1 = l.charAt(i) - '0';
                    int t2 = r.charAt(i) - '0';
                    ans += Math.abs(t1 - t2);
                    append9 = true;
                }
            }
            System.out.println(ans);
        }
    }
}
