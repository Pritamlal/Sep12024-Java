import java.util.Scanner;

public class dtb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        int temp;
        int binary = 0;
        int i = 1;
        while (num > 0) {
            temp = num % 2;
            binary = (temp * i) + binary;
            i = i * 10;
            num = num / 2;
        }
        System.out.println(binary);
    }
}
