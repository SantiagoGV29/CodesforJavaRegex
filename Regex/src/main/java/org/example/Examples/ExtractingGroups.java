package org.example.Examples;
import java.util.regex.*;

public class ExtractingGroups {
    public static void main(String[] args) {
        String text = "Name: John Doe, Age: 30";
        String pattern = "Name: (.*), Age: (\\d+)";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        if (matcher.find()) {
            String name = matcher.group(1);
            int age = Integer.parseInt(matcher.group(2));
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
