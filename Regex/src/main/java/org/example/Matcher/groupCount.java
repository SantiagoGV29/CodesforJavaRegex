package org.example.Matcher;
import java.util.regex.*;
public class groupCount {
    public static void main(String[] args) {
        String text = "Name: John, Age: 30";
        Pattern pattern = Pattern.compile("(Name|Age):\\s(\\w+)");
        Matcher matcher = pattern.matcher(text);

        matcher.find();
        int groupCount = matcher.groupCount();
        System.out.println("groupCount(): " + groupCount);
    }
}
