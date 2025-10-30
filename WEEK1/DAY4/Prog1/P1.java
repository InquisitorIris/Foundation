import java.util.*;
public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print multiplication table for N");
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        for(int i=1;i<=12;i++){
            System.out.println(N+"*"+i+"="+(N*i));
        }
        sc.close();
    }
}