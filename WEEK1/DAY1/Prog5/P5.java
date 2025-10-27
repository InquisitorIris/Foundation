import java.util.*;

public class P5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a,b,c,ans;
        System.out.print("Enter the first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        System.out.print("Enter the third number: ");
        c=sc.nextInt();

        if (a>=b && a>=c){
            ans=a;
        }
        else if (b>=a && b>=c){
            ans=b;
        }
        else{
            ans=c;
        }

        System.out.println("\nThe largest number is "+ans);
    }
}
