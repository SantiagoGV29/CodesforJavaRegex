package org.example.Examples;
import java.util.regex.*;
public class MatchingPatterns {
    public static void main(String[] args) {
        String text = "The cat and the hat.";
        String pattern = "cat";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.println("Found match at index " + matcher.start());
        }
    }
}
