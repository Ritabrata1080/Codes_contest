import java.util.Scanner;

public class cf_855_div3_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] smallerCase = new int[26];
            int[] upperCase = new int[26];
            char[] c = s.toCharArray();
            for(int i = 0;i<n;i++)
            {
                if(c[i] >= 'a' && c[i] <= 'z'){
                    smallerCase[c[i] - 97]++;
                }
                else{
                    upperCase[c[i] - 65]++;
                }
            }
            int pair = 0, pairCouldForm = 0;
            for(int i = 0;i<26;i++){
                pair += Math.min(smallerCase[i], upperCase[i]);  // If a is present 3 times and A is present 5 times, aA pair can be made 3 times only

                upperCase[i] = Math.abs(smallerCase[i] - upperCase[i]);
                pairCouldForm += upperCase[i]/2;

                
            }
            pair += Math.min(pairCouldForm, k);

            System.out.println(pair);
        }
    }
}
