import java.util.*;
public class P2 {
    public static void main(String[] args) {
        int N;
        int eSum=0;
        int oSum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Print sum of even and odd numbers separately up to N");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2==0){
                eSum+=i;
            }
            else{
                oSum+=i;
            }
        }
        System.out.println("Even sum upto "+N+"="+eSum);
        System.out.println("Odd sum upto "+N+"="+oSum);
        sc.close();
    }
}