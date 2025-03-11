package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJumpTest {


    @Test
    void givenXYAndDistance30_thenNumberOfJumps3() {
        assertEquals(3, FrogJump.solution(10, 85, 30));
    }

    @Test
    void givenXYAndDistance5_thenNumberOfJumps3() {
        assertEquals(3, FrogJump.solution(2, 13, 5));
    }

    @Test
    void givenXYAndDistance1_thenNumberOfJumps98() {
        assertEquals(98, FrogJump.solution(2, 100, 1));
    }
}