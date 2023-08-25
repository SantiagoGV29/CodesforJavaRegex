package org.example.Matcher;
import java.util.regex.*;
public class findStart {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        boolean findFromPositionResult = matcher.find(17); // Start searching from the end of the previous match // 17 false
        System.out.println("find(int start): " + findFromPositionResult);
    }
}
