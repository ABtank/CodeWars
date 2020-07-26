package ru.abramov.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        String n = sc.nextLine();
        int a;
        int chet = 0;
        int notChet = 0;
        if (Integer.parseInt(n) > 100) n = "100";
        for (int i = 0; i < Integer.parseInt(n); i++) {
            a = sc.nextInt();
            if (a % 2 == 0) {
                chet++;
                sb4.append(a).append(" ");
            } else {
                notChet++;
                sb3.append(a).append(" ");
            }
        }

        n = (chet >= notChet) ? "YES" : "NO";
        out.println(sb3.toString());
        out.println(sb4.toString());
        out.println(n);
        out.flush();
    }
}
