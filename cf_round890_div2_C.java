import java.util.*;

public class cf_round890_div2_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of the array
            int k = scanner.nextInt(); // Maximum number of operations
            int[] a = new int[n];
            
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt(); // Elements of the array
            }
           
            int result = getMaxValue(a, k);
            System.out.println(result);
        }
    }
    
    public static int getMaxValue(int[] a, int k) {

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<a.length-1 && k>0; i++){
            if(a[i] < a[i+1])
            {
                int diff = a[i+1] - a[i];
                if(k>=diff * (i+1)){
                    a[i] += diff;
                    k -= diff*(i+1);
                  
                    
                }
                else{
                    a[i] += k/(i+1);
                    break;
                }
            }
        }
        for(int p : a){
            max = Math.max(p, max);
        }
        return max;
    }
}
