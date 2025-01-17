package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] derived1 = new int[]{1, 1, 0};
        System.out.println(neighboringBitwiseXOR(derived1));

        int[] derived2 = new int[]{1, 1};
        System.out.println(neighboringBitwiseXOR(derived2));

        int[] derived3 = new int[]{1, 0};
        System.out.println(neighboringBitwiseXOR(derived3));

    }

    public static boolean neighboringBitwiseXOR(int[] derived) {

        int[] original1 = new int[derived.length];
        int[] original2 = new int[derived.length];
        original2[0] = 1;

        for (int i = 0; i < derived.length; i++) {

            if (i < derived.length - 1) {

                if ((derived[i] == 0 && original1[i] == 0) || (derived[i] == 1 && original1[i] == 1)) {
                    original1[i+1] = 0;
                } else if ((derived[i] == 0 && original1[i] == 1) || (derived[i] == 1 && original1[i] == 0)) {
                    original1[i+1] = 1;
                }

                if ((derived[i] == 0 && original2[i] == 0) || (derived[i] == 1 && original2[i] == 1)) {
                    original2[i+1] = 0;
                } else if ((derived[i] == 0 && original2[i] == 1) || (derived[i] == 1 && original2[i] == 0)) {
                    original2[i+1] = 1;
                }

            } else if (i == derived.length - 1) {

                if ((derived[i] == 0 && original1[i] == 0) || (derived[i] == 1 && original1[i] == 1)) {
                    return true;
                }

                if ((derived[i] == 0 && original2[i] == 1) || (derived[i] == 1 && original2[i] == 0)) {
                    return true;
                }

            }

        }

        return false;

    }

}
