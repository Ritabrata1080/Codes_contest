import java.util.*;

public class perfect {

    static class Pair{
        int mins;
        String skills;
        Pair(int m, String s){
            mins = m;
            skills = s;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            PriorityQueue<Pair> minh = new PriorityQueue<>((a,b) -> {
                return a.mins - b.mins;
            });
            for(int j=1; j<=n; j++){
                int m = sc.nextInt();
                String s = sc.next() + sc.nextLine();
                minh.add(new Pair(m, s));
            }
            int count1 = Integer.MAX_VALUE, count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE;
            while(!minh.isEmpty()){
                Pair item = minh.poll();
                if(item.skills.equals("11")){
                    count1 = Math.min(count1, item.mins);
                }
                else if(item.skills.equals("01")){
                    count2 = Math.min(count2, item.mins);
                }
                else if(item.skills.equals("10")){
                    count3 = Math.min(count3, item.mins);
                }
            }
            int minTime = 0;
            if(count1 != Integer.MAX_VALUE && count2 != Integer.MAX_VALUE && count3 != Integer.MAX_VALUE){
                minTime = Math.min(count1, count2 + count3);
            }
            else if(count1 == Integer.MAX_VALUE && count2 != Integer.MAX_VALUE && count3 != Integer.MAX_VALUE){
                minTime = count2 + count3;
            }
            else if(count1 != Integer.MAX_VALUE && (count2 == Integer.MAX_VALUE || count3 == Integer.MAX_VALUE)){
                minTime = count1;
            }
            else{
                minTime = -1;
            }
            System.out.println(minTime);
        }
    }
}
