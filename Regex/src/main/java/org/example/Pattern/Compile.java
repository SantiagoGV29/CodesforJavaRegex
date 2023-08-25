package org.example.Pattern;
import java.util.regex.*;
import java.util.regex.Matcher;

public class Compile {
    public static void main(String[] args) {
        String regex = "\\d+"; // Pattern to match one or more digits
        Pattern pattern = Pattern.compile(regex);

        String text = "123d45";
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            System.out.println("Text contains only digits.");
        } else {
            System.out.println("Text does not contain only digits.");
        }
    }
}
