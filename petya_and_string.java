import java.util.Scanner;

public class petya_and_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char c1[] = s1.toLowerCase().toCharArray();
        char c2[] = s2.toLowerCase().toCharArray();
        int count = 0;
        for(int i = 0;i<c1.length;i++){
            if(c1[i] < c2[i]){
                count = 10;
                break;
            }
            else if(c1[i] > c2[i]){
                count = 20;
                break;
            }
            
        }
        if(count == 10){
            System.out.println(-1);
        }
        else if(count == 20){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }

}
