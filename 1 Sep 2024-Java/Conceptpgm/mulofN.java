import java.util.Scanner;

public class mulofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        int multi=1;
        String str="";
        for(int i=1;i<=num;i++){
            multi*=i;
            str+=i;
            if(i<num){
                str+="*";
            }
        }
            str=str+"="+multi;
            System.out.println(str);
    }
}
