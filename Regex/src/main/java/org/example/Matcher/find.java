package org.example.Matcher;
import java.util.regex.*;
public class find {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);

        boolean findResult = matcher.find();
        System.out.println("find(): " + findResult);
    }
}
