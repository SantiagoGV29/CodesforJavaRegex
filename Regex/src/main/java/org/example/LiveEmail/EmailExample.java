package org.example.LiveEmail;
import java.util.regex.*;

public class EmailExample {
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "john.doe123@gmail.com",
                "invalid_email",
                "name@domain",
                "123@456.com"
        };

        for (String email : emails) {
            boolean valid = validateEmail(email);
            System.out.println(email + ": " + (valid ? "Valid" : "Invalid"));
        }
    }

    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}
