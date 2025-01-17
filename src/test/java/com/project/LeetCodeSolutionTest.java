package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void neighboringBitwiseXORTest() {

        int[] derived1 = new int[]{1, 1, 0};
        assertTrue(LeetCodeSolution.doesValidArrayExist(derived1));

        int[] derived2 = new int[]{1, 1};
        assertTrue(LeetCodeSolution.doesValidArrayExist(derived2));

        int[] derived3 = new int[]{1, 0};
        assertFalse(LeetCodeSolution.doesValidArrayExist(derived3));

    }

}
