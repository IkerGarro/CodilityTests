package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDivTest {

    @Test
    void a() {
        CountDiv countDiv = new CountDiv();
        assertEquals(3, countDiv.solution(6, 11, 2));
    }
}