import java.util.Arrays;
import java.util.Scanner;

public class cf_round918_F {

    public static int countGreetings(int[][] people) {
        int n = people.length;
        int[] startingPositions = new int[n];

        // Create an array to store the starting positions
        for (int i = 0; i < n; i++) {
            startingPositions[i] = people[i][0];
        }

        // Sort the array of starting positions
        Arrays.sort(startingPositions);

        int greetings = 0;

        // Count the number of greetings based on the sorted starting positions
        for (int i = 0; i < n; i++) {
            int position_i = people[i][0];
            int index = Arrays.binarySearch(startingPositions, position_i);

            // Number of people with ending positions less than position_i
            greetings += Math.abs(index) - 1;
        }

        return greetings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Number of people
            int[][] people = new int[n][2];

            for (int i = 0; i < n; i++) {
                people[i][0] = scanner.nextInt(); // Starting position
                people[i][1] = scanner.nextInt(); // Ending position
            }

            int result = countGreetings(people);
            System.out.println(result);
        }

        scanner.close();
    }
}
