package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TapeEquilibriumTest {

    @Test
    void givenDefaultArray_ReturnValueWithMinDifferenceIs1() {
        assertEquals(1, TapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    void givenDefaultArray_ReturnValueWithMinDifferenceIs0() {
        assertEquals(0, TapeEquilibrium.solution(new int[]{7, 3, 4}));
    }

    @Test
    void givenDefaultArray_ReturnValueWithMinDifferenceIs4() {
        assertEquals(4, TapeEquilibrium.solution(new int[]{8, 4, 3, 7, 2, 1, 9}));
    }
}