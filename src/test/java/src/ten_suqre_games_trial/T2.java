package src.ten_suqre_games_trial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2 {

    private Test2 test2 = new Test2();

    @Test
    void solution() {

        assertEquals(5, test2.solution("azABaabza"));
    }

}