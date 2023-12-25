import java.util.Scanner;

public class round_863_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            String s = sc.next();
            char c[] = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<n;i++){
                if(c[i] - '0' < d){
                    if(d != 1){
                        sb.append(d);
                        sb.append(c[i]);
                        d = -1;
                    }
                    
                }
                else if(c[i] - '0' == d){
                    if(d != -1){
                        sb.append(c[i]);
                        sb.append(d);
                        d = -1;
                    }
                    else{
                        sb.append(c[i]);
                    }

                }
                else if(c[i] - '0' > d){
                    sb.append(c[i]);
                }
            }
            if(d != -1){
                sb.append(d);
            }
            System.out.println(sb.toString());
        }
    }
}
