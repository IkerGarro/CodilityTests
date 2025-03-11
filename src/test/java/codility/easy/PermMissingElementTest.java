package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElementTest {

    @Test
    void givenDefaultArray_thenMissingElementIs4() {
        assertEquals(4, PermMissingElement.solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    void givenDefaultArray_thenMissingElementIs7() {
        assertEquals(7, PermMissingElement.solution(new int[]{8, 9, 4, 2, 6, 3, 1, 5}));
    }
}