package ru.abramov.codewars;

public class BitCounting {

    public static int countBits(int n){
        int b=0;
        int c;
        String a = Integer.toBinaryString(n);
        for(int i=0; i<a.length(); i++){
            c = Character.getNumericValue(a.charAt(i));
            if (c == 1) {
                b++;
            }
        }
        return b;
    }
    public static int countBitsTwo(int n){
        int ret = n % 2;
        while ((n /= 2) > 0) ret += n % 2;
        return ret;
    }
}
