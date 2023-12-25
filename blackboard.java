import java.util.*;
public class blackboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            boolean flag = false;
            Arrays.sort(a);
            for(int p : a){
                if(p < 0){
                    flag = true;
                    break;
                }
            }
            System.out.println(flag == true ? a[0] : a[n-1]);
        }
    }
}
