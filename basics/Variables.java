package basics;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Declaring variables...");
        byte octet;
        int month = 12, year = 2022;
        float balance;
        char gender = 'F';

        System.out.println("Incrementing the month variable...");
        month++;

        System.out.println("Assigning a value to the balance variable...");
        balance = 6250.34f;

        System.out.println("Assigning a value to the octet variable...");
        octet = 100;
        octet = (byte) year;

        // Printing out final values of variables
        System.out.println("Final values:");
        System.out.println("Octet: " + octet);
        System.out.println("Month: " + month);
        System.out.println("Balance: " + balance);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
    }
}
