package collections.arrays;

public class TotalSalary {
    public static void main(String[] args) {
        int[] salaries = new int[3];
        float accumulator = 0;
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = (int) (Math.random() * 3000 + 964);
            accumulator += salaries[i];
            System.out.println("Employee " + (i + 1) + " has a salary of " + salaries[i]);
        }
        System.out.println((int) accumulator / salaries.length);
    }
}

