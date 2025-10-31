import java.util.*;
public class P5 {
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        int i=5;
        while(i<=(int)Math.pow(n, 0.5)){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
            i+=6;
        }
        return true;
    }
    public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Count primes between 1 and N\n");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int cnt=0;
        for(int i=2;i<=N;i++){
            if(prime(i)){
                cnt+=1;
            }
        }
        System.out.println("There are "+cnt+" prime numbers");
        sc.close();
    }
}
