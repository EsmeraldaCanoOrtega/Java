import java.util.Arrays;
import java.util.Scanner;

public class Ips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an IP: ");
        String inputIP = sc.next();
        String firstByte = "";
        String ipClass;
        boolean isPrivate = false;
        String privateRanges = "abc";
        int secondByte;
        boolean exitLoop = false;
        int calculatedValue = 0;


        for (int i = 0; i < inputIP.indexOf("."); i++) {
            firstByte = firstByte.concat("" + inputIP.charAt(i));
        }
        calculatedValue = Integer.parseInt(firstByte);


        if (calculatedValue <= 127) {
            ipClass = "A";
        } else if (calculatedValue <= 191) {
            ipClass = "B";
        } else if (calculatedValue <= 223) {
            ipClass = "C";
        } else if (calculatedValue <= 239) {
            ipClass = "D";
        } else {
            ipClass = "E";
        }

        if (privateRanges.contains(ipClass.toLowerCase())) {
            firstByte = "";
            for (int i = inputIP.indexOf('.') + 1; i < inputIP.indexOf('.') + 2 || !exitLoop; i++) {
                firstByte = firstByte.concat("" + inputIP.charAt(i));
                if (inputIP.substring(i + 1, i + 2).equals(".")) {
                    exitLoop = true;
                }
            }
            secondByte = Integer.parseInt(firstByte);
            if (calculatedValue == 172 && (secondByte >= 16 && secondByte <= 31)) {
                isPrivate = true;
            } else if (calculatedValue == 192 && secondByte == 168) {
                isPrivate = true;
            } else if (calculatedValue == 10) {
                isPrivate = true;
            }
        }

        System.out.println("Class: " + ipClass);
        System.out.println(isPrivate ? "Private" : "Public");
    }
}
