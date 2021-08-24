package src.tenSquareGames;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneTest {

    @Test
    void testOne() {
        assertEquals(2, One.solution("abaaba"));

    }

    @Test
    void testTwo() {

        assertEquals(5, One.solution("zyzyzyz"));

    }

}