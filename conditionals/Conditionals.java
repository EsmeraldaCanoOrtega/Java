package conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade1 , grade2 , grade3 ;
        System.out.print("Enter the student's name: ");
        String name = sc.next();
        System.out.print("Enter the grade for the 1st exam: ");
        grade1 = sc.nextInt();
        System.out.print("Enter the grade for the 2nd exam: ");
        grade2 = sc.nextInt();
        System.out.print("Enter the grade for the 3rd exam: ");
        grade3 = sc.nextInt();
        int finalGrade = calculateGrade(grade1, grade2, grade3);
        displayGrades(name, grade1, grade2, grade3, finalGrade);
    }

    private static int calculateGrade(int grade1, int grade2, int grade3) {
        float average;
        if (grade3 >= 5) {
            average = (grade3 + grade2 + grade1) / 3;
            if (average < 5)
                average = 5;
        } else {
            average = (grade3 + grade2 + grade1) / 3;
            if (average >= 5)
                average = 4;
        }
        return (int) average;
    }

    private static void displayGrades(String name, int grade1, int grade2, int grade3,
                                      int finalGrade) {
        System.out.println("The student " + name + " has obtained the following grades:");
        System.out.println("1st Exam: " + grade1);
        System.out.println("2nd Exam: " + grade2);
        System.out.println("3rd Exam: " + grade3);
        System.out.println("--------------------------------------------");
        System.out.println("The final grade is: " + finalGrade);
        System.out.println(finalGrade < 5 ? name + " has not passed the course" : name + " has passed the course");
    }
}
