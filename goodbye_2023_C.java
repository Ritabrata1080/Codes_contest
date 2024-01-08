import java.util.*;

public class goodbye_2023_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Input handling
        while(t --> 0){
            generateSquareNumbers(n);
        }

        scanner.close();
    }
       static void generateSquareNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String squareString = String.valueOf(square);

            // Adjust the length if needed
            while (squareString.length() < n) {
                squareString = '0' + squareString;
            }

            numbers[i - 1] = Integer.parseInt(squareString);
        }

        // Output the result
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}