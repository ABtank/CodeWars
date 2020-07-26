package ru.abramov.codewars;

public class TripleDouble {
    public static int TripleDouble(long num1, long num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        int count = 0;
        for (int i = 1; i < str1.length(); i++) {
            if (str1.charAt(i - 1) == str1.charAt(i)) {
                count++;
                if (count == 2) {
                    count = 0;
                    for (int j = 1; j < str2.length(); j++) {
                        if (str2.charAt(j - 1) == str2.charAt(j) && str2.charAt(j) == str1.charAt(i)) {
                            count++;
                            if (count == 1) return 1;
                        } else count = 0;
                    }
                }
            } else count = 0;
        }
        return 0;
    }

    public static int TripleDouble2(long num1, long num2) {
        String n1str = String.valueOf(num1);
        String n2str = String.valueOf(num2);
        for (int i = 0; i < 10; i++) {
            String n = String.valueOf(i);
            if (n1str.contains(n + n + n) && n2str.contains(n + n)) return 1;
        }
        return 0;
    }
}
