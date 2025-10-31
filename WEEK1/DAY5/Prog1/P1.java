import java.util.*;
public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Print all factors of N");
        System.out.print("Enter N: ");
        N=sc.nextInt();
        for(int i=1;i<=(int)Math.sqrt(N);i++){
            if(N%i==0){
                System.out.println(i);
            }
        }
        for(int i=(int)Math.sqrt(N);i>=1;i--){
            if ((N%i==0) && (i!=(N/i))){
                System.out.println(N/i);
            }
        }
        sc.close();
    }
}