import java.util.*;

public class cf_round889_div2_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int i = 0, j = n-1;
            int swap = 0;
            while(i<=j){
                if(a[i] == i+1 && a[j] == j+1){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    swap++;
                    i++;
                    j--;
                }
                else if(a[i] != i+1){
                    i++;
                }
                else if(a[j] != j+1){
                    j--;
                }
            }
            System.out.println(swap);
        }
    }
}
