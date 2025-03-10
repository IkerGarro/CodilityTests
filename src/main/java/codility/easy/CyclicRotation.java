package codility.easy;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        System.out.println("Array size is: " + A.length);
        int positionsToBeRotated = A.length % K;
        if (K == 0 || K == positionsToBeRotated) {
            return A;
        } else {
            System.out.println("Positions to be rotated array: " + positionsToBeRotated);
            int[] rotatedArray = new int[A.length];
            for (int i = 0; i < A.length; ++i) {
                if (i + positionsToBeRotated >= A.length) {
                    rotatedArray[i] = A[i + positionsToBeRotated - A.length];
                } else {
                    rotatedArray[i] = A[i + positionsToBeRotated];
                }
            }
            return rotatedArray;
        }
    }

    //GPT
    public static int[] solutionGPT(int[] A, int K) {
        // Edge case: If the array is empty or K is 0, return the array as is
        if (A.length == 0 || K == 0) {
            return A;
        }

        // Normalize K to avoid unnecessary full rotations (K > A.length)
        K = K % A.length;

        // If K is zero after normalization, no rotation is needed
        if (K == 0) {
            return A;
        }

        // Create a rotated array
        int[] rotatedArray = new int[A.length];

        // Fill the rotated array by rearranging elements
        for (int i = 0; i < A.length; i++) {
            int newPos = (i + K) % A.length;  // Calculate the new position after rotation
            rotatedArray[newPos] = A[i];
        }

        return rotatedArray;
    }
}
