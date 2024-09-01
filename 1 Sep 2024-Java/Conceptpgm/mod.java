import java.util.Scanner;

public class mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter the number");
        int num2 = sc.nextInt();
        int temp;
        while(num2!=0){
         temp = num1%num2;
        }
        System.out.println("The Temp is:" +temp);
    }
}
