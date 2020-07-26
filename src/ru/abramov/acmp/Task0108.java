package ru.abramov.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        out.println(a + b);
        out.flush();
    }
}

