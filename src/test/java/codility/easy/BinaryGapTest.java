package codility.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    void given1041_findBinaryGap_WhichI5(){
        assertEquals(5,binaryGap.solution(1041));
    }

    @Test
    void given529_findBinaryGap_WhichI4(){
        assertEquals(4,binaryGap.solution(529));
    }

    @Test
    void given9_findBinaryGap_WhichI2(){
        assertEquals(2,binaryGap.solution(9));
    }

    @Test
    void given15_findBinaryGap_WhichI0(){
        assertEquals(0,binaryGap.solution(15));
    }

    @Test
    void given3243242_findBinaryGap_WhichIs3(){
        assertEquals(3,binaryGap.solution(3243242));
    }
}