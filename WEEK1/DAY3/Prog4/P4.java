import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Factorial of N");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        int ans=1;
        for(int i=2;i<=N;i++){
            ans*=i;
        }
        System.out.println("Factorial of "+N+" = "+ans);
        sc.close();
    }
}
