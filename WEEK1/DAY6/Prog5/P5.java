import java.util.*;
public class P5 {
    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if N is strong number");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int n=N;
        int dig;
        int ans=0;
        while(n>0){
            dig=n%10;
            ans+=factorial(dig);
            n/=10;
        }
        if(ans==N){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not strong number");
        }
        sc.close();
    }
}
