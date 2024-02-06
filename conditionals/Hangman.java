import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = shuffle();
        int userGuess;
        boolean quit = false;

        for (int i = 0; i < 7 && !quit; i++) {
            System.out.println("Enter a random number: ");
            //System.out.println(randomNumber);
            userGuess = scanner.nextInt();
            if (userGuess != randomNumber) {
                System.out.println(userGuess > randomNumber ? "The number is lower" : "The number is higher");
                switch (i + 1) {
                    case 1:
                        drawStage1();
                        break;
                    case 2:
                        drawStage2();
                        break;
                    case 3:
                        drawStage3();
                        break;
                    case 4:
                        drawStage4();
                        break;
                    case 5:
                        drawStage5();
                        break;
                    case 6:
                        drawStage6();
                        break;
                    case 7:
                        drawStage7();
                        break;
                }

            } else {
                System.out.println("You guessed it right!");
                quit = true;
            }
        }
    }

    public static int shuffle() {
        return (int) (Math.random() * 5 + 1);
    }

    private static void drawStage1() {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
    }

    private static void drawStage2() {
        drawStage1();
        for (int i = 1; i <= 6; i++)
            System.out.println("\t\t  |   |");
    }

    private static void drawStage3() {
        drawStage2();
        System.out.println("\t\t  |   |");
        System.out.println("\t\t  |   |---------<");
        for (int i = 1; i <= 3; i++)
            System.out.println("\t\t  |   |");
    }

    private static void drawStage4() {
        drawStage2();
        System.out.println("\t\t  |   |");
        System.out.println(">---------|   |---------<");
        for (int i = 1; i <= 3; i++)
            System.out.println("\t\t  |   |");
    }

    private static void drawStage5() {
        drawStage4();
        System.out.println("\t\t       \\");
        System.out.println("\t\t        \\");
        System.out.println("\t\t         \\");
        System.out.println("\t\t          \\");
    }

    private static void drawStage6() {
        drawStage4();
        System.out.println("         /     \\");
        System.out.println("        /       \\");
        System.out.println("       /         \\");
        System.out.println("     _/           \\_");
    }

    private static void drawStage7() {
        for (int i = 1; i <= 2; i++)
            System.out.println("\t\t  |   |");
        System.out.println("\t\t  |   |");
        System.out.println(">---------|   |---------<");
        for (int i = 1; i <= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println(" _______         /     \\");
        System.out.println("/       \\       /       \\");
        System.out.println("| -   - |      /         \\");
        System.out.println("|   -   |    _/           \\_");
    }
}
