import java.util.*;
public class P3 {
    public static void main(String[] args) {
        char c=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("Check whether a character is vowel or consonant");
        System.out.print("Enter character: ");
        String ip=sc.next();
        if (ip.length() > 1) {
            System.out.println("Invalid entry. Please enter only a single character.");
            sc.close();
            return; // Exit the program immediately
        }
        if (ip.length() > 0){
            if (ip.length() > 1) {
                System.out.println("Invalid entry. Please enter only a single character.");
                sc.close();
                return;
            }
            else{
                c=ip.charAt(0);
            }
        } 
        else{
            System.out.println("No character entered.");
        }
        if((c>= 'a' && c<='z') || (c>='A' && c<='Z')){
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                System.out.println("Vowel!");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("This is not an alphabet");
        }
        sc.close();
    }
}
