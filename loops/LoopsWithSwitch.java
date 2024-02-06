package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option = 5;
        while (!exit) {
            System.out.println("(1) Enter a number (between 1 and 9)\n" +
                    "and display its multiplication table using the for loop");
            System.out.println("(2) Enter a number (between 1 and 9)\n" +
                    "and display its multiplication table using the while loop");
            System.out.println("(3) Enter a number (between 1 and 9)\n" +
                    "and display its multiplication table using the do-while loop");
            System.out.println("(4) Exit");
            System.out.println("Enter an option:");
            try {
                option = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
            switch (option) {
                case 1:
                    forLoop(sc);
                    break;
                case 2:
                    whileLoop(sc);
                    break;
                case 3:
                    doWhileLoop(sc);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            sc.nextLine();
        }
    }

    static void forLoop(Scanner sc) {
        boolean exitForLoop = false;
        try {
            while (!exitForLoop) {
                System.out.println("Enter a number from 1 to 9:");
                int num = sc.nextInt();
                if (num < 1 || num > 9) {
                    System.out.println("Error, enter a number from 1 to 9");
                } else {
                    System.out.println("Multiplication table using 'for' loop for :" + num);
                    for (int i = 1; i < 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    exitForLoop = true;
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Error, enter numerical values");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public static void whileLoop(Scanner sc) {
        boolean exit = false;
        int i = 1;
        try {
            while (!exit) {
                System.out.println("Enter a number from 1 to 9:");
                int num = sc.nextInt();
                if (num < 1 || num > 9) {
                    System.out.println("Error, enter a number from 1 to 9");
                } else {
                    System.out.println("Multiplication table using 'while' loop for :" + num);
                    while (i < 10) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                        i++;
                    }
                }
                exit = true;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Error, enter numerical values");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public static void doWhileLoop(Scanner sc) {
        boolean exitDoWhileLoop = false;
        int i = 1;
        try {
            while (!exitDoWhileLoop) {
                System.out.println("Enter a number from 1 to 9:");
                int num = sc.nextInt();
                if (num < 1 || num > 9) {
                    System.out.println("Error, enter a number from 1 to 9");
                } else {
                    System.out.println("Multiplication table using 'do-while' loop for :" + num);
                    do {
                        System.out.println(num + " x " + i + " = " + (num * i));
                        i++;
                    } while (i < 10);
                }
                exitDoWhileLoop = true;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Error, enter numerical values");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
