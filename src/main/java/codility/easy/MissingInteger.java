package codility.easy;

import java.util.HashSet;

public class MissingInteger {
    public int solution(int[] A) {
        HashSet<Integer> results = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                results.add(A[i]);
            }
        }
        if (results.isEmpty()) {
            return 1;
        }
        int missingNumber = 0;
        for (int j = 1; j <= results.size(); j++) {
            System.out.println("Print operation result " + !results.contains(j));
            if (A.length == results.size() && results.size() == j) {
                missingNumber = j++;
            }
            if (!results.contains(j)) {
                System.out.println("Assign");
                missingNumber = j;
            }
        }
        return missingNumber;
    }
}
