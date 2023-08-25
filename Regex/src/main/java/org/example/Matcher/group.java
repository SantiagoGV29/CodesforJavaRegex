package org.example.Matcher;
import java.util.regex.*;
public class group {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);

        String matchedText = matcher.group();
        System.out.println("group(): " + matchedText);
    }
}
