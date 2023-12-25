import java.util.*;

public class cf_round894_div3_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            StringBuilder sb = new StringBuilder();
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[][] matrix = new char[m][n];
            for(int i = 0;i<m;i++){
                for(int j = 0;j<n;j++){
                    matrix[i][j] = sc.next().charAt(0);
                }
            }
            for(int j = 0;j<n;j++){
                for(int i = 0;i<m;i++){
                    if(matrix[j][i] == 'v'){
                        sb.append("v");
                        break;
                    }
                    else if(matrix[j][i] == 'i'){
                        sb.append("i");
                        break;
                    }
                    else if(matrix[j][i] == 'k'){
                        sb.append("k");
                        break;
                    }
                    else if(matrix[j][i] == 'a'){
                        sb.append("a");
                        break;
                    }
                }
            }
            if(sb.toString().equals("vika")){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
