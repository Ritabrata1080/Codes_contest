import java.util.*;
class Tuple{
    int x, y, z;
    Tuple(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class cf_round12_div2_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        int max = 0;
        for(int i = 0;i<n;i++){
            l1.add(sc.nextInt());
        }
        for(int i = 0;i<n;i++){
            l2.add(sc.nextInt());
        }
        for(int i = 0;i<n;i++){
            l3.add(sc.nextInt());
        }
        int countb = 0, counti = 0, countr = 0;
        for(int i = 1;i<l1.size();i++){
            if(l1.get(i)> l1.get(i-1)){
                countb++;
            }
        }
       
        for(int i = 1;i<l1.size();i++){
            if(l2.get(i)> l2.get(i-1)){
                counti++;
            }
        }
        for(int i = 1;i<l1.size();i++){
            if(l3.get(i)> l3.get(i-1)){
                countr++;
            }
        }
        max = Math.max(Math.max(countb, counti), countr);
        System.out.println(max);
    }
}
