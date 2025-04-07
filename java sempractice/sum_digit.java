import java.util.Scanner;
public class sum_digit {
    public static void main(String h[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to prin the sum of the digits :");
      int a = sc.nextInt();
      int b = a;
      int sum = 0,digit = 0;
      while(a>0)
      {
        digit = a % 10;
        sum = sum + digit;
        a /= 10;
      }
      System.out.println("The sum of the digits of the given number " + b + " is " + sum);
      sc.close();

    }
}
