package src.ten_suqre_games_trial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1 {

    private static Test1 test1 = new Test1();

    @Test
    void solution() {

//        assertEquals(11, test1.solution(10));
//        assertEquals(9999, test1.solution(99));
        assertEquals(19, test1.solution(14));

    }
}