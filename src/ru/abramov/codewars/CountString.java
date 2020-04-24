package ru.abramov.codewars;

public class CountString {


    public static String high(String s) {
        int max = Integer.MIN_VALUE;
        String bestWord = "";
        int sum = 0;
        String[] arrStr = s.split(" ");
        for (int i = 0; i < arrStr.length; i++) {

            for (int j = 0; j < arrStr[i].length(); j++) {
                int intChar = countChar(arrStr[i].charAt(j));
                sum += intChar;
            }
            if (max < sum) {
                max = sum;
                bestWord = arrStr[i];
            }
            sum = 0;
        }
        System.out.println(bestWord);
        return bestWord;
    }

    public static int countChar(char ch) {
        int count = 0;
        for (char i = 'a'; i < 'z'; i++) {
            count++;
            if (i == ch) return count;
        }
        return count;
    }


    public static String highTwo(String str) {
        String[] words = str.split(" ");
        String max = words[0];
        for (String word : words) {
            if (getScoreTwo(word) > getScoreTwo(max)) {
                max = word;
            }
        }
        return max;
    }

    private static int getScoreTwo(String word) {
        char[] chars = word.toCharArray();
        int sum = 0;
        for (char symbol : chars) {
            sum += (int) symbol - 96;
        }
        return sum;
    }
}
