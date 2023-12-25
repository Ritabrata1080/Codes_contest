import java.util.*;

public class cf_898_div4_A {
    public static boolean swap(String s,int i, int j){
        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        StringBuilder sb = new StringBuilder();
        for(char ch : c){
            sb.append(ch);
        }
        return (sb.toString().equals("abc"));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            if(s.equals("abc") || swap(s,0,1) || swap(s,0,2) || swap(s,1,2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
