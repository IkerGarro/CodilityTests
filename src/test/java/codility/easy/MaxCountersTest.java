package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxCountersTest {

    MaxCounters maxCounters = new MaxCounters();

    @Test
    void a() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}