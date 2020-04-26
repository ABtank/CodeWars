package ru.abramov.codewars;

import java.util.Arrays;
import java.util.List;

public class WhoLikeIt {


    public static String whoLikesIt(String... names) {
        System.out.println(names.length);
        if (names.length == 0) return "no one likes this";
        if (names.length == 1) return String.format("%s likes this", names[0]);
        if (names.length == 2) return String.format("%s and %s like this", names[0],names[1]);
        if (names.length == 3) return String.format("%s, %s and %s like this", names[0],names[1],names[2]);
        return String.format("%s, %s and %d others like this", names[0],names[1],names.length-2);
    }

    public static String whoLikesItTwo(String... names) {

        StringBuilder output = new StringBuilder();

        List<String> values = Arrays.asList(names);

        if (values.isEmpty()) {
            output.append("no one likes this");
        } else if (values.size() == 1) {
            output.append(values.get(0))
                    .append(" likes this");
        } else if (values.size() == 2) {
            output.append(values.get(0))
                    .append(" and ")
                    .append(values.get(1))
                    .append(" like this");
        } else if (values.size() == 3) {
            output.append(values.get(0))
                    .append(", ")
                    .append(values.get(1))
                    .append(" and ")
                    .append(values.get(2))
                    .append(" like this");
        } else {
            output.append(values.get(0))
                    .append(", ")
                    .append(values.get(1))
                    .append(" and ")
                    .append(values.size() - 2)
                    .append(" others like this");
        }
        return output.toString();
    }
}
