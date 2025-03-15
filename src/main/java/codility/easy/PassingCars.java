package codility.easy;

public class PassingCars {
    public int solution(int[] A) {
        int numberOfOnes = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                ++numberOfOnes;
            }
        }
        int numberOfPairs = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                numberOfPairs += numberOfOnes;
            } else {
                numberOfOnes--;
            }
        }
        return numberOfPairs;
    }
}
