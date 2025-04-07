import java.util.Scanner;
public class reverse {

    public static void main(String h[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it:");
        int num = sc.nextInt();
        int rev = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            rev = rev * 10 + digit; // Append the digit to the reversed number
            num = num / 10; // Remove the last digit
        }

        System.out.println("The given number in reverse order is: " + rev);
        sc.close();
    }
}