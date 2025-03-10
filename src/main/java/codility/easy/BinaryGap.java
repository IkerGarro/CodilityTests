package codility.easy;

public class BinaryGap {

    public int solutionGPT(int N) {
        //GPTs
        int maxConsecutiveZeros = 0;
        int zeroCounter = 0;
        // Ignore the last 0 or 1 (the least significant bit).
        while (N > 0) {
            if ((N & 1) == 0) {  // Check if the least significant bit is 0
                ++zeroCounter;
            } else {
                maxConsecutiveZeros = Math.max(maxConsecutiveZeros, zeroCounter);
                zeroCounter = 0;
            }
            N >>= 1;  // Right shift the number to check the next bit
        }
        return maxConsecutiveZeros;
    }

    public int solution(int N) {
        char[] binaryNumber = Integer.toBinaryString(N).toCharArray();
        System.out.println("Binary Number is " + new String(binaryNumber));

        int maxConsecutiveZeros = 0;
        int zeroCounter = 0;
        for (int i = 0; i < binaryNumber.length; ++i) {
            if (binaryNumber[i] == '0') {
                ++zeroCounter;
            } else if (binaryNumber[i] != 0) {
                if (maxConsecutiveZeros < zeroCounter) {
                    maxConsecutiveZeros = zeroCounter;
                }
                zeroCounter = 0;
            }
        }
        return maxConsecutiveZeros;
    }
}
