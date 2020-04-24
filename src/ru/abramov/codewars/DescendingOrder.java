package ru.abramov.codewars;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String str = "" + num;
        boolean bool = true;
        int[] arrInt = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrInt[i] = Character.getNumericValue(str.charAt(i));
        }
        System.out.println(arrInt);
        str = "";
        while (bool) {
            int a;
            bool = false;
            for (int i = 1; i < arrInt.length; i++) {
                if (arrInt[i] > arrInt[i - 1]) {
                    a = arrInt[i - 1];
                    arrInt[i - 1] = arrInt[i];
                    arrInt[i] = a;
                    bool = true;
                }
            }
        }
        System.out.println(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            str += arrInt[i];
        }
        System.out.println(str);
        //Your code
        return Integer.parseInt(str);
    }


    public static int sortDescTwo(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static int sortDescThree(final int num) {
        String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
        Arrays.sort(numbers);

        String result = "";

        for(String s : numbers)
        {
            result = s + result;
        }

        return Integer.parseInt(result);
    }
}
