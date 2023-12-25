import java.util.*;
 
public class cf_round889_div2_B {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        while(n --> 0){

            long num=sc.nextLong();

            int max=0;
            int count=0;

            for(int i=1;i<=10000;i++){
                if(num%i==0)
                count++;
                else{
                    count=0;
                }
              if(count>max)
              max=count;
            }
            System.out.println(max);
        }
 
    }
}