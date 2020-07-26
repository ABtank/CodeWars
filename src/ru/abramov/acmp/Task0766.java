package ru.abramov.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0766 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        String str = (n * m >= k) ? "YES" : "NO";
        out.println(str);
        out.flush();
    }
}
