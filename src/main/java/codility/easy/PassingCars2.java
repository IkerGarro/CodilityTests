package codility.easy;

//Same as passing cars with 1 loop
public class PassingCars2 {
    public int solution(int[] A) {
        int numberOfPairs = 0;
        int eastLooking = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                eastLooking++;
            }
            if (A[i] == 1) {
                numberOfPairs += eastLooking;
            }
        }
        if (numberOfPairs > 1000000) {
            return -1;
        } else {
            return numberOfPairs;
        }
    }
}
