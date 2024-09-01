import java.util.Scanner;
class dtb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        String str="";
        while(n>0){
            int bit=n%2;
            str=bit+str;
            n=n/2;
        }
        System.out.println("The decimal Number is:"+str);
    }
}