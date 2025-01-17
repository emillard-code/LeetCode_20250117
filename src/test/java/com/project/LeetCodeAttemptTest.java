package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void neighboringBitwiseXORTest() {

        int[] derived1 = new int[]{1, 1, 0};
        assertTrue(LeetCodeAttempt.neighboringBitwiseXOR(derived1));

        int[] derived2 = new int[]{1, 1};
        assertTrue(LeetCodeAttempt.neighboringBitwiseXOR(derived2));

        int[] derived3 = new int[]{1, 0};
        assertFalse(LeetCodeAttempt.neighboringBitwiseXOR(derived3));

    }

}
