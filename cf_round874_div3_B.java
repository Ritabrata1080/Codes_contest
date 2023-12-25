import java.util.*;

public class cf_round874_div3_B {
    static class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
            }
           
            Arrays.sort(b);
            List<Pair> list = new ArrayList<>();
            int[] res = new int[n];
            for(int i = 0;i<n;i++){
                list.add(new Pair(a[i], i));
            }
            Arrays.sort(a);
            for(int i = 0;i<n;i++){
                
                res[list.get(i).y] = b[i];
            }
            for(int p : res){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
