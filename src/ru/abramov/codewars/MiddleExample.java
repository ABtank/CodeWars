package ru.abramov.codewars;

public class MiddleExample {
    public static String getMiddle(String word) {
        String answer;
        if(word.length()%2==0){
            answer=""+word.charAt((word.length()-1)/2)
                    +word.charAt((word.length()+1)/2);
        }else {
            answer = ""+word.charAt((word.length())/2);
        }
        return answer;
    }
}
