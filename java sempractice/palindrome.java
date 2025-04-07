import java.util.Scanner;
public class palindrome {
    public static void main(String h[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to check for wheter the number is a palindrome:");
     int a = sc.nextInt();
     int temp = a;
     int rev =0;
     int digit=0;
     while(a!=0)
     {
        digit = a%10;
        rev = rev*10 + digit;
        a = a/10;
     }
     if(rev == temp)
     System.out.println("The entered number is palondrome number:");
     else
     System.out.println("The entred number is not an palindrome number:");

     sc.close();
    }
}
