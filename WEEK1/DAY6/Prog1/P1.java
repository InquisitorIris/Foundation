import java.util.*;
public class P1 {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Find sum of squares of first N numbers");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int ans=0;
        for(int i=1;i<=N;i++){
            ans+=(i*i);
        }
        System.out.println("Sum of squares of first "+N+" numbers = "+ans);
        sc.close();
    }
}
