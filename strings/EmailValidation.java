package strings;

public class EmailValidation {
    public static void main(String[] args) {
        // Program that reads an email address as a string.
        // We want to validate the email with the following characteristics:
        // - The format must be: user@educa.madrid.org
        // - The user can be any alphanumeric character (a..z and 0..9)
        // - It must start with an alphabetic character
        // - The following characters are also allowed: underscore (_), hyphen (-), dot (.)
        String email = "A1_@educa.madrid.org";
        boolean isValid = isValidEmail(email);
        System.out.println(isValid ? "Valid email" : "Invalid email");
    }

    public static boolean isValidEmail(String email) {
        boolean valid = false;
        int count = 0;
        String domain = "@educa.madrid.org";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_-.";

        if (email.contains("@")) {
            String user = email.substring(0, email.indexOf("@"));

            // Check if all characters in the user part are valid
            for (int i = 0; i < user.length(); i++) {
                count = validChars.contains(user.substring(i, i + 1)) ? count + 1 : count - 1;
            }

            // If all characters are valid and the domain is correct
            valid = (count == user.length()) && email.substring(email.indexOf("@")).equals(domain)
                    && alphabet.contains(email.substring(0, 1));
        }

        return valid;
    }
}
