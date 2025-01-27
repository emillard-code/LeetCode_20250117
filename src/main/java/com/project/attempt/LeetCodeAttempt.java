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

    // This method will return true if a hypothetical array original[] could have formed
    // the array derived[] through XOR operations as mentioned by the challenge specifications.
    public static boolean neighboringBitwiseXOR(int[] derived) {

        // Since derived[i] == original[i] XOR original[i+1], the value of each original[i] is dependent on
        // the next index to match up to derived[i]. Keeping this in mind, we will have two arrays to account
        // for both possible values at the starting index, where original1[0] == 0 and original2[0] == 1. We will
        // then work from there in the later loop to calculate the values of the later indexes of both arrays.
        int[] original1 = new int[derived.length];
        int[] original2 = new int[derived.length];
        original2[0] = 1;

        // This loop will then fill the two arrays by making sure that each derived[i] is the result of
        // the original[i] XOR original[i+1] operation. We will take the values of derived[i] and original[i]
        // to calculate the value of the following original[i+1] index. Once we reach the final index, we will
        // instead see if the original[i] XOR original[0] operation results in the same value as derived[i].
        // If the operation results in a matching value for either original1[] or original2[], then we return
        // true as that means a valid binary array exists. If not, the arrays are invalid as they break the
        // constraints of the challenge specifications.
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

        // If neither original1[] nor original2[] resulted in a valid binary array following the
        // specifications of the challenge, then we ultimately return false at this point.
        return false;

    }

}
