package ru.abramov.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String str = (a==b)?"=":(a>b)?">":"<";
        out.println(str);
        out.flush();
    }
}
