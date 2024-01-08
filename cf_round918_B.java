import java.util.*;

public class cf_round918_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            char[][] grid = new char[3][3];
            for(int i = 0;i<3;i++){
                String p = sc.next();
                for(int j = 0;j<3;j++){
                    grid[i][j] = p.charAt(j);
                }
            }
            for(int i = 0;i<3;i++){
                Map<Character, Integer> map = new HashMap<>();
                map.put('A', 0);
                map.put('B', 0);
                map.put('C', 0);
                for(int j = 0;j<3;j++){
                    if(grid[i][j] != '?'){
                        map.put(grid[i][j], map.getOrDefault(grid[i][j], 0)+1);
                    }
                }
                for(Character c : map.keySet()){
                    if(map.get(c) == 0){
                        System.out.println(c);
                        break;
                    }
                }
            }
        }
    }
}
