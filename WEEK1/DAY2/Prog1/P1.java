import java.util.*;
public class P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        int ans=(N*(N+1))/2;
        System.out.println("\nSum of first N numbers = "+ans);
        sc.close();
    }
}
