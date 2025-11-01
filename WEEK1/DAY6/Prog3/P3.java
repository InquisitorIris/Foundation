import java.util.*;
public class P3 {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Find smallest digit in N");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int n=N;
        int dig;
        int m=10;
        while(n>0){
            dig=n%10;
            if(m>dig){
                m=dig;
            }
            n/=10;
        }
        System.out.println("The smallest digit in "+N+" is "+m);
        sc.close();
    }
}
