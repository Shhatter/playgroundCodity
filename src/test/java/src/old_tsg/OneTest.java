package src.old_tsg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneTest {

    @Test
    void testOne() {
        assertEquals(2, One.updatedSolution("abaaba"));

    }

    @Test
    void testTwo() {

        assertEquals(5, One.updatedSolution("zyzyzyz"));
    }

}


/*

https://www.geeksforgeeks.org/smallest-substring-occurring-only-once-in-a-given-string/

* Given a string S consisting of N lowercase alphabets, the task is to find the length of the smallest substring in S whose occurrence is exactly 1.

Examples:

Input: S = “abaaba”
Output: 2
Explanation:
The smallest substring in the string S, whose occurrence is exactly 1 is “aa” . Length of this substring is 2.
Therefore, print 2.

Input: S = “zyzyzyz”
Output: 5
* */