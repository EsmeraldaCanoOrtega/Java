package collections.matrixes;

public class FillDisplay {
    public static void main(String[] args) {
        int array[][] = new int[2][3];
        fill(array);
        display(array);
    }

    public static void fill(int[][] array){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = j;
            }
        }
    }

    public static void display(int[][] array){
        for (int i = 0; i < 2; i++) {
            System.out.println("\nStudent "+ i);
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
    }
}
