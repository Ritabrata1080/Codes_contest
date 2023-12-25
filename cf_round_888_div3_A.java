import java.util.*;

public class cf_round_888_div3_A {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }

            List<Integer> odd = new ArrayList<>();
            List<Integer> even = new ArrayList<>();
            for(int p : a){
                if(p % 2 == 0){
                    even.add(p);
                }
                else{
                    odd.add(p);
                }
            }
            Collections.sort(odd);
            Collections.sort(even);
            int oi = 0, ei = 0;
            for(int i = 0;i<n;i++){
                if(a[i] % 2 == 0){
                    a[i] = even.get(ei++);
                }
                else{
                    a[i] = odd.get(oi++);
                }
            }
            boolean flag = false;
            for(int i = 0;i<n-1;i++){
                if(a[i] > a[i+1]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
