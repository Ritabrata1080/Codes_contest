import java.util.*;

public class cf_round806_div4_C {

    static class Pair{
        int x;
        String y;
        Pair(int x, String y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            List<Integer> res = new ArrayList<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            List<Pair> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                int b = sc.nextInt();
                String pattern = sc.next();
                list.add(new Pair(b, pattern));
            }
            int ind = 0;
            for(Pair p : list){
                int times = p.x;
                String s = p.y;
                
                for(int i = 0;i<times;i++){
                    if(s.charAt(i) == 'U'){
                        if(a[ind] == 0){
                            a[ind] = 10 - a[ind] - 1;
                        }
                        else{
                            a[ind] = a[ind] - 1;
                        }
                    }
                    else{
                        a[ind] = (a[ind] + 1)%10;
                    }
                }
                res.add(a[ind++]);
                
                
            }
            for(int p : res){
                System.out.print(p+" ");
            }
            System.out.println();
            
        }
    }
}
