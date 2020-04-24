package ru.abramov.codewars;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        int c = 0;

        for (char j = 'a'; j <= 'z'; j++) {
            c++;
        }
        System.out.println(c);
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
       // System.out.println(check(pangram1));
    }

    public boolean check(String sentence) {
        Set<Character> setCh = new HashSet<Character>();
        char chCheck;
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            chCheck = sentence.toLowerCase().charAt(i);
            for (char j = 'a'; j <= 'z'; j++) {
                if (chCheck == j){
                    setCh.add(j);
                }
            }
        }
        System.out.println(setCh.size());
        return setCh.size()==26;
    }

    public boolean checkTwo(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }

    public boolean checkThree(String sentence){

        String neu = sentence.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (neu.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}
