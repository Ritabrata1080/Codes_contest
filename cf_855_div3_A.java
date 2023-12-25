import java.util.Scanner;

public class cf_855_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] c = s.toLowerCase().toCharArray();
            int m2 = s.toLowerCase().lastIndexOf("m");
            int e1 = s.toLowerCase().indexOf("e");
            int e2 = s.toLowerCase().lastIndexOf("e");
            int o1 = s.toLowerCase().indexOf("o");
            int o2 = s.toLowerCase().lastIndexOf("o");
            int w1 = s.toLowerCase().indexOf("w");
            boolean flag = false;
            for(char p : c){
                if(p != 'm' && p != 'e' && p != 'o' && p != 'w'){
                    flag = true;
                    break;
                }
            }

            if(c[0] != 'm' || flag){
                System.out.println("NO");
                
            }
            else if(flag){
                System.out.println("NO");
            }
            else if(!flag && c[0] == 'm'){
                if(m2 < e1 && e2 < o1 && o2 < w1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
           

        }
    }
}
