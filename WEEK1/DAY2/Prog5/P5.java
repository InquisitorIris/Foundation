import java.util.*;
public class P5 {
    public static int gcd(int a,int b){
        if(b>a){
            int c=a;
            a=b;
            b=c;
        }
        int rem=0;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("LCM of a and b");
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.print("LCM = 0 (or undefined for non-zero inputs)");
            sc.close(); 
            return; 
        }
        int g=gcd(a,b);
        int l=(a*b)/g;
        System.out.println("LCM = "+l);
        sc.close();
    }
}
