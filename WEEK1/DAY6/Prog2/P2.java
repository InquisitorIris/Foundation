import java.util.*;
public class P2 {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Find product of digits of N");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int n=N;
        int dig;
        int ans=1;
        while(n>0){
            dig=n%10;
            ans*=dig;
            n/=10;
        }
        System.out.println("Product of digits of "+N+" = "+ans);
        sc.close();
    }
}
