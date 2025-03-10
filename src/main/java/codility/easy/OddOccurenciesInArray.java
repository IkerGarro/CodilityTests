package codility.easy;

public class OddOccurenciesInArray {
    public static int solution(int[] A) {
        //A will always be odd
        // Using the concept of "XOR" (^)
        // when there is a pair A and B
        // A^B will be zero
        // A^B^C (where C is not paired),
        // then A^B^C = C

        // special case
        if (A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0]; // initial

        for (int i = 1; i < A.length; i++) {
            // https://florian.github.io//xor-trick/
            //  a ^ b ^ c ^ a ^ b     # Commutativity
            //= a ^ a ^ b ^ b ^ c     # Using x ^ x = 0
            //= 0 ^ 0 ^ c             # Using x ^ 0 = x (and commutativity)
            //= c
            //unpaired = unpaired ^ A[i]; // xor
            unpaired ^= A[i];
        }

        return unpaired; // return the unpaired value
    }
}
