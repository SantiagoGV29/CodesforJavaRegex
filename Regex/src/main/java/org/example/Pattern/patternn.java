package org.example.Pattern;
import java.util.regex.*;
public class patternn {
    public static void main(String[] args) {
        String regex = "\\b\\w{4}\\b"; // Pattern for matching 4-letter words
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Pattern: " + pattern.pattern());

        String text = "This is a test sentence with some words.";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
