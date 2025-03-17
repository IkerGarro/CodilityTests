package codility.easy;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int divisibleByK = 0;
        if (A == B && A % K == 0) {
            divisibleByK = A % K;
        }
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                divisibleByK++;
            }
        }
        return divisibleByK;
    }
}
