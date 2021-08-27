package src.old_tsg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoTest {

    @Test
    void solutiion() {
        int[] out = {3, 8, 2, 3, 3, 2};
        assertEquals(3, Two.solution(out));
    }

}
