import java.util.Scanner;

public class cf_886_div4_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            StringBuilder sb = new StringBuilder();
            char[][] grid = new char[8][8];
            for(int i = 0;i<8;i++){
                String s = sc.next();
                for(int j = 0;j<8;j++){
                    grid[i][j] = s.charAt(j);
                    
                }
            }
            for(int i = 0;i<8;i++){
                for(int j = 0;j<8;j++){
                    if(grid[i][j] != '.'){
                        sb.append(grid[i][j]);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
