package codility.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    void givenDefaultArray_whenKis3_thenShiftedIs() {
        int[] rotativeArray = {3, 8, 9, 7, 6};
        var expectedArray = new int[]{9, 7, 6, 3, 8};
        assertArrayEquals(expectedArray, CyclicRotation.solution(rotativeArray, 3));
    }

    @Test
    void givenArray1_whenKis4_thenShiftedIs() {
        int[] rotativeArray = {3, 8, 9, 7, 6};
        var expectedArray = new int[]{8, 9, 7, 6, 3};
        assertArrayEquals(expectedArray, CyclicRotation.solution(rotativeArray, 4));
    }


    @Test
    void givenArray1_whenKis500_thenShiftedIs() {
        int[] rotativeArray = {3, 8, 9, 7, 6};
        var expectedArray = new int[]{3, 8, 9, 7, 6};
        assertArrayEquals(expectedArray, CyclicRotation.solution(rotativeArray, 500));
    }

    @Test
    void givenDefaultArray_whenKis1_thenShiftedIs() {
        int[] rotativeArray = {0, 0, 0};
        var expectedArray = new int[]{0, 0, 0};
        assertArrayEquals(expectedArray, CyclicRotation.solution(rotativeArray, 1));
    }

    @Test
    void givenDefaultArray_whenKis4_thenShiftedIs() {
        int[] rotativeArray = {1, 2, 3, 4};
        var expectedArray = new int[]{1, 2, 3, 4};
        assertArrayEquals(expectedArray, CyclicRotation.solution(rotativeArray, 4));
    }
}