package codility.easy;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int arrayTotalSum = 0;
        for (int i = 0; i < A.length; i++) {
            arrayTotalSum += A[i];
        }
        System.out.println("Total sum: " + arrayTotalSum);

        int minDifference = A[0];
        int leftSideSum = 0;
        for (int j = 0; j < A.length - 1; j++) {
            leftSideSum += A[j];
            System.out.println("LeftSide sum for j = " + j + " is " + leftSideSum);
            int absolutDifference = Math.abs(leftSideSum - (arrayTotalSum - leftSideSum));
            System.out.println("Absolute difference is : " + absolutDifference);
            if (absolutDifference < minDifference) {
                minDifference = absolutDifference;
            }
        }
        return minDifference;
    }
}

