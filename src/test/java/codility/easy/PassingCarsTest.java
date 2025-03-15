package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PassingCarsTest {

    PassingCars passingCars = new PassingCars();

    @Test
    void a() {
        assertAll(() -> {
                    assertEquals(5, passingCars.solution(new int[]{0, 1, 0, 1, 1}));
                    assertEquals(2, passingCars.solution(new int[]{1, 1, 0, 1, 1}));
                    assertEquals(0, passingCars.solution(new int[]{1, 1, 1, 1, 0}));
                    assertEquals(4, passingCars.solution(new int[]{0, 1, 1, 1, 1}));
                    assertEquals(1, passingCars.solution(new int[]{1, 1, 1, 0, 1}));
                }
        );
    }
}