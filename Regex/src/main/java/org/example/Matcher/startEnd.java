package org.example.Matcher;
import java.util.regex.*;
public class startEnd {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);

        matcher.find();
        int matchStart = matcher.start();
        int matchEnd = matcher.end();
        System.out.println("start(): " + matchStart);
        System.out.println("end(): " + matchEnd);
    }
}
