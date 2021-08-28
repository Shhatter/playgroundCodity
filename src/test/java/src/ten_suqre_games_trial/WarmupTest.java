package src.ten_suqre_games_trial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarmupTest {

    Warmup warmup = new Warmup();

    @Test
    void solution() {

        int[] myNum = {1, 3, 6, 4, 1, 2};

        assertEquals(5, warmup.solution(myNum));
    }

    @Test
    void solutionTwo() {

        int[] myNum = {1, 2, 3};

        assertEquals(4, warmup.solution(myNum));
    }

    @Test
    void solutionThree() {

        int[] arrayNumbers = {-3, -2};
        assertEquals(1, warmup.solution(arrayNumbers));
    }

}