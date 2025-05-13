import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int A = scanner.nextInt();
        int B = scanner.nextInt();


        int reversedA = reverseNumber(A);
        int reversedB = reverseNumber(B);


        if (reversedA > reversedB) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }

        scanner.close();
    }


    public static int reverseNumber(int num) {
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        
        return ones * 100 + tens * 10 + hundreds;
    }
}