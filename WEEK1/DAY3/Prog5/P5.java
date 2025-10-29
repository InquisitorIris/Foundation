import java.util.Scanner;

public class P5 {
    public static int reverse(int N){
        boolean isNegative = N < 0;
        if (isNegative) {
            N = -N;
        }
        int rev=0;
        int dig;
        while (N>0) {
            dig=N%10;
            rev=(rev*10)+dig;
            N/=10;
        }
        if (isNegative) {
            rev = -rev;  
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Reverse N");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        int rev=reverse(N);
        System.out.println("Reverse of "+N+" = "+rev);
        sc.close();
    }
}
