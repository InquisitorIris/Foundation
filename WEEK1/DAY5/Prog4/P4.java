import java.util.*;
public class P4 {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if N is perfect number");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        int ans=0;
        for(int i=1;i<=(N/2);i++){
            if(N%i==0){
                ans+=i;
            }
        }
        if(ans==N){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not perfect number");
        }
        sc.close();
    }
}
