package org.example.Pattern;
import java.util.regex.*;
public class matches {
    public static void main(String[] args) {
        String regex = "\\d{3}-\\d{2}-\\d{4}"; // Pattern for SSN (Social Security Number)
        Pattern pattern = Pattern.compile(regex);

        String ssn = "123-45-6889";

        if (Pattern.matches(regex,ssn)) {
            System.out.println("Valid SSN.");
        } else {
            System.out.println("Invalid SSN.");
        }
    }
}
