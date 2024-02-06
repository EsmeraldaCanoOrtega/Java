package collections.arrays;

public class HighestLowest {
    public static void main(String[] args) {
        int array[] = {30, 2, 3, 4, -1};
        int greater = highest(array);
        int lowest = lowest(array);
        System.out.println("The highest is "+greater);
        System.out.println("The lowest is "+lowest);
    }

    public static int highest(int[] array) {
        int comparator = 0;
        for (int i = 0; i < array.length ; i++) {
            comparator= array[i]>comparator?array[i]:comparator;
        }
        return comparator;
    }
    public static int lowest(int[] array) {
        int comparator = 0;
        for (int i = 0; i < array.length ; i++) {
            comparator= array[i]<comparator?array[i]:comparator;
        }
        return comparator;
    }
}
