package ru.abramov.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0006 {
    public static Scanner in = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out);
    public static final String ERROR = "ERROR";
    public static final String NO = "NO";
    public static final String YES = "YES";


    public static void main(String[] args) {
        String str = in.nextLine();
        out.println(function(str));

        out.flush();
    }
    private static String function(String str) {
         boolean booChar0 = false;
         boolean booChar3 = false;
         boolean booChar1 = false;
         boolean booChar4 = false;
        if (str.length() != 5) return ERROR;
        char[] arrStr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrStr[i] = str.charAt(i);
        }
        //проверка строки
        if (arrStr[2] != '-') return ERROR;
        for (char i = 'A'; i <= 'H'; i++) {
            if (i == arrStr[0]) booChar0 = true;
            if (i == arrStr[3]) booChar3 = true;
        }
        if (!booChar0 || !booChar3) return ERROR;
        for (char i = '1'; i < '9'; i++) {
            if (i == arrStr[1]) booChar1 = true;
            if (i == arrStr[4]) booChar4 = true;
        }
        if (!booChar1 || !booChar4) return ERROR;

        if ((arrStr[0] == arrStr[3] - 2 && arrStr[3] - 2 >= 'A') ||
                (arrStr[0] == arrStr[3] + 2 && arrStr[3] + 2 <= 'H')) {
            if (arrStr[1] == arrStr[4] - 1 && arrStr[4] - 1 >= '1') {
                return YES;
            }
            if (arrStr[1] == arrStr[4] + 1 && arrStr[4] + 1 <= '8') {
                return YES;
            }
        }

        if ((arrStr[0] == arrStr[3] - 1 && arrStr[3] - 1 >= 'A') ||
                (arrStr[0] == arrStr[3] + 1 && arrStr[3] + 1 <= 'H')) {
            if (arrStr[1] == arrStr[4] - 2 && arrStr[4] - 2 >= '1') {
                return YES;
            }
            if (arrStr[1] == arrStr[4] + 2 && arrStr[4] + 2 <= '8') {
                return YES;
            }
        }
        return NO;
    }
}
