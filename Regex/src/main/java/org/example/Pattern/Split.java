package org.example.Pattern;
import java.util.regex.*;
public class Split {
    public static void main(String[] args) {
        String regex = "\\s*,\\s*"; // Pattern for splitting on commas with optional spaces
        Pattern pattern = Pattern.compile(regex);

        String text = "apple,banana, cherry ,orange, fruit";
        String[] fruits = pattern.split(text);

        for (String fruit : fruits) {
            System.out.println(fruit.trim()); // .trim() removes leading/trailing spaces
        }
    }
}
