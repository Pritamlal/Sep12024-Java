import java.util.Scanner;

public class sumofN2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scn.nextInt();
        int sum=0;
        String str="";
        for(int i=1;i<=n;i++){
            sum=sum+i;
            str=str+i;
            if(i<n){
                str=str+"+";
            }
        }
        str=str+"="+sum;
        System.out.println(str);
    }
}
