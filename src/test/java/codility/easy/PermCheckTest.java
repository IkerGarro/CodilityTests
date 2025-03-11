package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    private PermCheck permCheck = new PermCheck();

    @Test
    void givenArray_whenCheckingPermutationInIt_thenItsNot() {
        assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }

    @Test
    void givenArray_whenCheckingPermutationInIt_thenIts() {
        assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
    }
}