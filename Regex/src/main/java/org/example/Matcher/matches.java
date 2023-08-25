package org.example.Matcher;
import java.util.regex.*;
public class matches {
    public static void main(String[] args) {
        String text = "fox";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);

        boolean matchesResult = matcher.matches();
        System.out.println("matches(): " + matchesResult);
    }
}
