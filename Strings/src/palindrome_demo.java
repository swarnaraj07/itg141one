import java.util.Scanner;
public class palindrome_demo {

public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a String:");
        String s = sc.next();
        int i=0;
        int j= s.length()-1;
 
       
        while(i<j)
        {
        if(s.charAt(i)!=s.charAt(j))
        {
        System.out.println("given string not a palindrome");
        System.exit(0);
        }
        i++;
            j--;
        }
       
        System.out.println("Given string is palindrome");
}
}