package org.example.Pattern;
import java.util.regex.*;
public class Matcherr {
    public static void main(String[] args) {
        String regex = "apple|like";
        Pattern pattern = Pattern.compile(regex);

        String text = "I like apple and banana.";
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }

}
