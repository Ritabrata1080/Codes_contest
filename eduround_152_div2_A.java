import java.util.*;

public class eduround_152_div2_A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int h = sc.nextInt();
            int layers = 0;
            b -= 1;
            int fillings = c + h;
            if(b < fillings){
                layers = 1+2*b;
            }
            else{
                layers = 1+(fillings*2);
            }
            
            System.out.println(layers);
        }
    }
}