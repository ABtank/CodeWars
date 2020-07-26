package ru.abramov.codewars;


// -----АЛГОРИТМ ЛУНА------ \\

import java.util.Arrays;

public class ValidateCreditCardNumber {
    public static boolean validateOne(String n) {
        if (Long.parseLong(n) < 0) return false;
        String[] arrstr = n.split("");
        if (arrstr.length > 16) return false;
        int[] arrInt = new int[arrstr.length];
        for (int i = 0; i < arrstr.length; i++) {
            arrInt[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arrInt[i] + "-");
        }
        System.out.println();
        for (int i = arrInt.length - 2; i >=0; i--) {
            if (i % 2 == 0) {
                arrInt[i] *= 2;
                while (arrInt[i] > 9) {
                    arrInt[i] -= 9;
                }
            }
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
        }
        System.out.println(sum);
        sum %= 10;
        System.out.println(sum);

        return sum == 0;
    }

    public static boolean validate(String n) {
        if (Long.parseLong(n) < 0) return false;
        String[] arrstr = n.split("");
        if (arrstr.length > 16) return false;
        int[] arrInt = new int[arrstr.length];
        for (int i = 0; i < arrstr.length; i++) {
            arrInt[i] = Integer.parseInt(arrstr[i]);
            System.out.print(arrInt[i] + "_");
        }
        System.out.println();
        if (arrInt.length % 2 == 0) {
            for (int i = 0; i < arrInt.length; i++) {
                if (i % 2 == 0) {
                    arrInt[i] *= 2;
                    while (arrInt[i] > 9) {
                        arrInt[i] -= 9;
                    }
                }
            }
        } else {
            for (int i = 0; i < arrInt.length; i++) {
                if (i % 2 == 1) {
                    arrInt[i] *= 2;
                    while (arrInt[i] > 9) {
                        arrInt[i] -= 9;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
        }
        System.out.println(sum);
        sum %= 10;
        System.out.println(sum);

        return sum == 0;
    }

    public static boolean validateStream(String n) {
        final boolean[] flag = {(n.length() & 1) == 1};
        return Arrays.stream(
                n.split(""))
                .map(Integer::parseInt)
                .mapToInt(value -> value)
                .map(integer -> ((flag[0] ^= true) ? (integer * 2 - 1) % 9 + 1 : integer))
                .sum() % 10 == 0;
    }
}


/*
In this TripleDouble, you will implement the Luhn Algorithm, which is used to help validate credit card numbers.

Given a positive integer of up to 16 digits, return true if it is a valid credit card number, and false if it is not.

Here is the algorithm:

Double every other digit, scanning from right to left, starting from the second digit (from the right).

Another way to think about it is: if there are an even number of digits, double every other digit starting with the first; if there are an odd number of digits, double every other digit starting with the second:

1714 ==> [1*, 7, 1*, 4] ==> [2, 7, 2, 4]

12345 ==> [1, 2*, 3, 4*, 5] ==> [1, 4, 3, 8, 5]

891 ==> [8, 9*, 1] ==> [8, 18, 1]
If a resulting number is greater than 9, replace it with the sum of its own digits (which is the same as subtracting 9 from it):

[8, 18*, 1] ==> [8, (1+8), 1] ==> [8, 9, 1]

or:

[8, 18*, 1] ==> [8, (18-9), 1] ==> [8, 9, 1]
Sum all of the final digits:

[8, 9, 1] ==> 8 + 9 + 1 = 18
Finally, take that sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.


  18 (modulus) 10 ==> 8 , which is not equal to 0, so this is not a valid credit card number
 */