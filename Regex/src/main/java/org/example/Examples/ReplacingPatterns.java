package org.example.Examples;

public class ReplacingPatterns {
    public static void main(String[] args) {
        String text = "Hello, World!";
        String pattern = "[aeiou]";

        String replacedText = text.replaceAll(pattern, "*");
        System.out.println("Original: " + text);
        System.out.println("Replaced: " + replacedText);
    }
}
