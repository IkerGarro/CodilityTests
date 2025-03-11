package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogRiverOneTest {

    @Test
    void givenLeaveFallingSequence_findSecondsNeededToCross_is6() {
        assertEquals(6, FrogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    void givenLeaveFallingSequence_findSecondsNeededToCross_is12() {
        assertEquals(12, FrogRiverOne.solution(8, new int[]{1, 3, 1, 4, 2, 3, 5, 4, 7, 7, 7, 8, 6}));
    }
}