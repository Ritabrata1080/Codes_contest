import java.util.Scanner;

public class round_291_div2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int temp = x;
       
        // while(temp > 0){
        //     int rem = temp%10;
        //     temp = temp/10;
        //     if(rem > 4){
        //         rem = 9 - rem;
        //     }
        //     sb.append(rem);
        // }
        // System.out.println(sb.reverse().toString());   
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<c.length;i++){
                if(c[i] - '0' > 4){
                    int t = 9 - (c[i] - '0');
                    char temp = (char)t;
                    c[i] = temp;
                    // System.out.println("Hit1");
                    
                }
                
        }
        for(char c1 : c){
            sb.append(c1);
        }
        System.out.println(sb.toString());
        
    }
}
