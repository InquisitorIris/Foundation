import java.util.*;
public class P2 {
    public static int reverse(int N){
        int rev=0;
        int dig;
        while (N>0) {
            dig=N%10;
            rev=(rev*10)+dig;
            N/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if N is a palindrome");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        if(N<0){
            System.out.println("Not palindrome");
        }
        else{
            if(reverse(N)==N){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }
        }
        sc.close();
    }
}
