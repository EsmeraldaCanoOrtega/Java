import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names[] = {"pepe","ana","luis","eva","pelusete","tais","freia","Sintra"};
        int grades[][] = { {3,6,9},{1,5,5},{8,3,8},{9,7,6},{0,10,5},{0,10,5},{6,6,4},{3,7,8}};
        System.out.println("Search for a name");
        String userNameToFind = scanner.nextLine();
        int indexOfList = searchStudent(names, userNameToFind);
        if (indexOfList > -2){
            System.out.println(names[indexOfList]);
            System.out.println("In the first evaluation, they scored "+grades[indexOfList][0]);
            System.out.println("In the second evaluation, they scored "+grades[indexOfList][1]);
            System.out.println("In the third evaluation, they scored "+grades[indexOfList][2]);
            System.out.println("Their final grade is "+((grades[indexOfList][2]+grades[indexOfList][0]+grades[indexOfList][1])/3));

        } else {
            System.out.println("Not found");
        }
    }

    public static int searchStudent(String[] names, String userNameToFind){
        boolean found = false;
        int checked = -2;
        for (int i = 0; i < names.length && !found; i++) {
            if (names[i].equalsIgnoreCase(userNameToFind)){
                checked = i;
                found = true;
            } else {
                checked = -3;
            }
        }
        return checked;
    }
}
