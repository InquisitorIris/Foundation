import java.util.*;
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if the year is a leap year");
        System.out.print("Enter Y: ");
        int Y=sc.nextInt();
        boolean ans;
        if(Y%400==0){
            ans=true;
        }
        else{
            if(Y%4==0 && Y%100!=0){
                ans=true;
            }
            else{
                ans=false;
            }
        }
        if(ans==true){
            System.out.println(Y+" is a leap year!");
        }
        else{
            System.out.println(Y+" is not a leap year!");
        }
        sc.close();
    }
}
