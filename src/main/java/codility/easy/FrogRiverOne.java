package codility.easy;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        int[] leavesToCross = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[i] " + A[i]);
            if (leavesToCross[A[i]] == 0 && X != 0) {
                leavesToCross[A[i]] = 1;
                X--;
            }
            if (X == 0) {
                return i;
            }
        }
        return -1;
    }

    public int solutionGPT(int X, int[] A) {
        // Create a set to track the positions covered by leaves
        boolean[] covered = new boolean[X + 1]; // We only care about positions 1 to X
        int coveredCount = 0;

        // Iterate through the array A
        for (int time = 0; time < A.length; time++) {
            int position = A[time];

            // If this position hasn't been covered yet, mark it as covered
            if (!covered[position]) {
                covered[position] = true;
                coveredCount++;
            }

            // If all positions from 1 to X are covered, return the current time
            if (coveredCount == X) {
                return time;
            }
        }

        // If we finish the loop and haven't covered all positions, return -1
        return -1;
    }
}
