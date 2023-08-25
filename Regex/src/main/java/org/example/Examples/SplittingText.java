package org.example.Examples;

public class SplittingText {
    public static void main(String[] args) {
        String text = "apple, banana, cherry";
        String pattern = "\\s*,\\s*";

        String[] fruits = text.split(pattern);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
