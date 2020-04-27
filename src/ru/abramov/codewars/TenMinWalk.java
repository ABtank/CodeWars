package ru.abramov.codewars;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;
        if (walk.length != 10) return false;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') n++;
            if (walk[i] == 's') s++;
            if (walk[i] == 'w') w++;
            if (walk[i] == 'e') e++;
        }
        System.out.println("n=" + n + " s=" + s + " w=" + w + " e=" + e);
        if (n != s || w != e || (n + s + w + e) != 10) return false;
        return true;
    }

}
