import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if N is a prime number");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        boolean ans=true;
        if(N<=1){
            ans=false;
        }
        if(N<=3){
            ans=true;
        }
        if(N%2==0 || N%3==0){
            ans=false;
        }
        int i=5;
        while(i*i<=N){
            if(N%i==0 || N%(i+2)==0){
                ans=false;
                break;
            }
            i+=6;
        }
        if(ans==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
