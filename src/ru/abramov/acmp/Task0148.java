package ru.abramov.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task0148 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int b;
        int d;
        int q = 0;
        int r = 1;
        String ack = in.nextLine();
        String[] arrstr = ack.split(" ");
        int[] arrInt = new int[arrstr.length];
        for (int i = 0; i < arrstr.length; i++) {
            arrInt[i] = Integer.parseInt(arrstr[i]);
        }
        if (arrInt[0] > arrInt[1]) {
            int temp = arrInt[0];
            arrInt[0] = arrInt[1];
            arrInt[1] = temp;
        }
        b = arrInt[0];
        d = arrInt[1];
        while (r != 0) {
            while (d >= b) {
                d -= b;
            }
            if (d != 0) {
                q = d;
                d = b;
                b = q;
            } else r = d;
        }
        out.println(b);
        out.flush();
    }
}
