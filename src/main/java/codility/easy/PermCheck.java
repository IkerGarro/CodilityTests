package codility.easy;

import java.util.HashSet;

public class PermCheck {
    public int solution(int[] A) {
        HashSet<Integer> sequenceNumbers = new HashSet();
        int biggestNumber = 0;
        for (int i = 0; i < A.length; i++) {
            sequenceNumbers.add(A[i]);
            if (A[i] > biggestNumber) {
                System.out.println("Biggest permutation number " + A[i]);
                biggestNumber = A[i];
            }
        }
        if (biggestNumber == sequenceNumbers.size()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int solutionGPT(int[] A) {
        HashSet<Integer> sequenceNumbers = new HashSet<>();
        int biggestNumber = 0;

        // Iterate through the array to find the largest number and collect unique numbers
        for (int num : A) {
            // Check if the number is within the expected range of 1 to biggestNumber
            if (num > biggestNumber) {
                biggestNumber = num;
            }
            sequenceNumbers.add(num);
        }

        // Check if the set contains all numbers from 1 to biggestNumber
        // If the size of the set equals the biggestNumber and contains all integers in that range
        for (int i = 1; i <= biggestNumber; i++) {
            if (!sequenceNumbers.contains(i)) {
                return 0;
            }
        }

        // If the size of the set matches the biggest number, return 1 (it is a valid permutation)
        return (sequenceNumbers.size() == biggestNumber) ? 1 : 0;
    }

}
