package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOccurenciesInArrayTest {

    @Test
    void givenArray_theUnpaired_is7() {
        int[] array = new int[]{9, 3, 9, 3, 9, 7, 9};
        assertEquals(7, OddOccurenciesInArray.solution(array));
    }

    @Test
    void givenArray_theUnpaired_is1() {
        int[] array = new int[]{9, 4, 9, 5, 5, 4, 1};
        assertEquals(1, OddOccurenciesInArray.solution(array));
    }

    @Test
    void givenArray_theUnpaired_is100() {
        int[] array = new int[]{1, 10, 100, 1, 10, 2, 2};
        assertEquals(100, OddOccurenciesInArray.solution(array));
    }

    @Test
    void givenArray_theUnpaired_is10() {
        int[] array = new int[]{101010, 10, 101010};
        assertEquals(10, OddOccurenciesInArray.solution(array));
    }
}