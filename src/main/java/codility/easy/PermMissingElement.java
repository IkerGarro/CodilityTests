package codility.easy;

public class PermMissingElement {
    public static int solution(int[] A) {
        int height = A.length + 1;
        int totalSum = ((1 + height) * height) / 2;
        System.out.println("Total sum is: " + totalSum);
        for (int i = 0; i < A.length; i++) {
            totalSum -= A[i];
        }
        return totalSum;
    }
}
