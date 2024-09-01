import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scn.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scn.nextInt();

        // Finding HCF using the Euclidean algorithm
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        // num1 now holds the HCF
        System.out.println("The HCF of the given numbers is: " + num1);
    }
}
