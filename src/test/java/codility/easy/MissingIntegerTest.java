package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {

    MissingInteger missingInteger = new MissingInteger();

    @Test
    void a() {
        assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    void b() {
        assertEquals(4, missingInteger.solution(new int[]{1, 2, 3}));
    }

    @Test
    void c() {
        assertEquals(1, missingInteger.solution(new int[]{-1, -3}));
    }
}