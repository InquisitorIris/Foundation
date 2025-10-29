import java.util.*;
public class P3 {
    public static void multiple15(int N){
        for(int i=1; i<=N; i++){
            if(i%15==0){
                System.err.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print all numbers 1→N divisible by 3 and 5");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        multiple15(N);
        sc.close();
    }
}
