import java.util.Scanner;
public class P5 {
    public static int numDig(int N){
        int l=0;
        while(N>0){
            l+=1;
            N/=10;
        }
        return l;
    }
    public static void armstrong(int N){
        int l=numDig(N);
        int ans=0;
        int n=N;
        int dig;
        while(n>0){
            dig=n%10;
            ans+=(int)Math.pow(dig,l);
            n/=10;
        }
        if(ans==N){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Check if N is an Armstrong number");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        armstrong(N);
        sc.close();
    }
}
