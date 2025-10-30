import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=0;
        int ans=0;
        int dig;
        System.out.println("Find sum of digits of N");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int n=N;
        while(n>0){
            dig=n%10;
            ans+=dig;
            n/=10;
        }
        System.out.println("Sum of digits of "+N+"="+ans);
        sc.close();
    }
}