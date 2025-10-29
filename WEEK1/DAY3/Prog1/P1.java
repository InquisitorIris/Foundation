import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Count the number of digits in N");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        int n=N;
        int cnt=0;
        while (n>0) {
            cnt+=1;
            n/=10;
        }
        System.out.println(N+" has "+cnt+" digits\n");
        sc.close();
    }
}
