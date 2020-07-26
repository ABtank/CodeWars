package ru.abramov.acmp;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Task0000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long a;
        BigInteger bi;
        long max = 0;
        for (int i = 0; i < 3; i++) {
            a = sc.nextLong();
            if (a >= max) {
                max = a;
            }
        }
        out.println(max);
        out.flush();
    }

    public static int TripleDouble(long num1, long num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        int count = 0;
        for (int i = 1; i < str1.length(); i++) {
            if (str1.charAt(i - 1) == str1.charAt(i)) {
                count++;
                if (count == 3) {
                    count = 0;
                    for (int j = 0; j < str2.length(); j++) {
                        if (str2.charAt(i - 1) == str2.charAt(i)) {
                            count++;
                            if (count == 2) return 1;
                        } else count = 0;
                    }
                }
            } else count = 0;
        }
        return 0;
    }
}
