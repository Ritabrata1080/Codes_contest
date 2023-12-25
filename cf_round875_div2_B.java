import java.util.*;
public class cf_round875_div2_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
            }
            int countA = 1, countB = 1, maxA = 1, maxB = 1;
            Map<Integer, Integer> mapA = new HashMap<>();
            Map<Integer, Integer> mapB = new HashMap<>();
            for(int i = 1;i<n;i++){
                if(a[i] == a[i-1]){
                    countA++;
                    maxA = Math.max(countA, maxA);
                }
                else{
                    mapA.put(a[i-1], maxA);
                    countA = 1;
                }

            }

            for(int i = 1;i<n;i++){
                if(b[i] == b[i-1]){
                    countB++;
                    maxB = Math.max(countB, maxB);
                }
                
                else{
                    mapB.put(b[i-1], maxB);
                    countB = 1;
                }

            }
            
            for(int p : mapB.keySet()){
                System.out.println(p+ " "+ mapB.get(p));
            }
            // int ans = 0;
            // if(maxB > maxA){
            //     for(int p : mapB.keySet()){
            //         if(mapB.get(p) == maxB){
            //             ans += maxB;
            //             if(mapA.containsKey(p)){
            //                 ans += mapA.get(p);
            //             }
            //             break;
            //         }
            //     }
                
            // }
            // else{
            //     for(int p : mapA.keySet()){
            //         if(mapA.get(p) == maxA){
            //             ans += maxA;
            //             if(mapB.containsKey(p)){
            //                 ans += mapB.get(p);
            //             }
            //             break;
            //         }
            //     }
            // }
            // System.out.println(ans);
       
          

        }
    }
}
