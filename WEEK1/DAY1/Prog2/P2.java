import java.util.Scanner;

public class P2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("INTEGER SUM");
        int a=2;
        int b=3;
        int s1=a+b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a+b = "+s1);

        System.out.print("Enter c: ");
        int c=sc.nextInt();
        System.out.print("Enter d: ");
        int d=sc.nextInt();
        int s2=c+d;
        System.out.println("c+d = "+s2);

        System.out.println("************************");

        System.out.println("DECIMAL SUM");
        double a1=2.1;
        double b1=3.4;
        double s3=a1+b1;
        System.out.println("a1 = "+a1);
        System.out.println("b1 = "+b1);
        System.out.println("a1+b1 = "+s3);

        System.out.print("Enter c: ");
        double c1=sc.nextDouble();
        System.out.print("Enter d: ");
        double d1=sc.nextDouble();
        double s4=c1+d1;
        System.out.println("c1+d1 = "+s4);

        sc.close();
    }
}
