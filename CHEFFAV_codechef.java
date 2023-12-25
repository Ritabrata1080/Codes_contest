// A string 
// S is called Chef's favourite if every substring chef in 
// S must have a substring code before it.

// You are given a string 

// S of size 

// N that contains both code and chef as a substring. Please determine if 

// S is Chef's favourite.

// Note: A substring is a continuous part of string which can be obtained by deleting some (may be none) character's from the beginning and some (may be none) character's from the end.

// Input Format
// The first line of the input contains an integer 
// T - the number of test cases. The test cases then follow.
// The first line of each test contains an integer 

// N - the size of the string.
// The second line of each test contains a string 

// S.
// Output Format
// For each test case, output on a single line AC if 

// S is Chef's favourite, or WA otherwise.


import java.util.*;

public class CHEFFAV_codechef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            int indexCode = s.indexOf("code");
            int indexChef = s.indexOf("chef");
            if(indexCode == -1 || indexCode > indexChef){
                System.out.println("WA");
            }
            else{
                System.out.println("AC");
            }
            
        }
    }
}
