package src.ten_suqre_games_trial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T3 {

    private Test3 test3 = new Test3();

    @Test
    public void solution() {

        assertEquals(2, test3.solution(new int[]{1, 2, 1}));
        assertEquals(1, test3.solution(new int[]{2, 1, 4, 4}));
        assertEquals(4, test3.solution(new int[]{6, 2, 3, 5, 6, 3}));
        assertEquals(24, test3.solution(new int[]{1, 2, 3, 30, 4, 5}));
        assertEquals(14, test3.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1}));

    }

}