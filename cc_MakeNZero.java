import java.util.*;
import java.lang.*;
import java.io.*;

class MakeNZero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
		    boolean flag = false;
		    int n = sc.nextInt();
		    if(n % 4 == 0 || (n%4 == 2 && n >= 6) || (n%4 == 1 && n >=9) || (n % 4 == 3)){
		        flag = true;
		    }
		    if(flag){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
