import java.util.*;
public class P2 {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter N: ");
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
}
