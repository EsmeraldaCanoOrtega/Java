package strings;

import java.util.Scanner;

public class EmailProfessor {
    public static void main(String[] args) {
        String email; // String containing the user's email

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER AN EMAIL: ");
        email = input.nextLine();
        if (validateEmail(email))
            System.out.println("The email is correct");
        else
            System.out.println("The email is invalid");
    }

    /*********************************************************************/
    private static boolean validateEmail(String email) {
        // Validate the domain
        boolean allGood = false;    // Variable to track the process
        boolean charOk = true;      // Variable to check if each position
        // of the user is a valid character
        int position;               // Position of the @
        String domain, user;        // Parts of the email
        int i = 0;

        // Extract user and domain
        position = email.indexOf('@');
        domain = email.substring(position + 1);
        user = email.substring(0, position);

        // Check the domain
        allGood = domain.equals("educa.madrid.org");

        // Check if the user starts with a letter
        if (allGood)
            allGood = Character.isLetter(user.charAt(0));

        if (allGood) {
            while (charOk && i < position) {
                if (!((Character.isDigit(user.charAt(i))) ||
                        (Character.isLetter(user.charAt(i))) ||
                        (user.charAt(i) == '_') ||
                        (user.charAt(i) == '-') ||
                        (user.charAt(i) == '.')))
                    charOk = false;
                i++;
            }
            allGood = charOk;
        }

        return allGood;
    }
}
