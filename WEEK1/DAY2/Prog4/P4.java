import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("GCD of a and b");
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt();
        int rem;
        if(b>a){
            int c=a;
            a=b;
            b=c;
        }
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("\nGCD = "+a);
        sc.close();
    }
}
