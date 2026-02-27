import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        // Input Alice's scores
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        // Input Bob's scores
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int alicePoints = 0;
        int bobPoints = 0;

        // Compare each category
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                alicePoints++;
            } else if (a[i] < b[i]) {
                bobPoints++;
            }
        }

        // Output result
        System.out.println(alicePoints + " " + bobPoints);
    }
}
