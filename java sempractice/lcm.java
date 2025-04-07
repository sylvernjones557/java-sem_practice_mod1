import java.util.Scanner;
public class lcm {
    public static void main(String l[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers o find gcd of two numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = a , d = b;
      int temp;
      while(b!=0)
      {
        temp = b;
        b = a % b;
        a = temp;

      }
      System.out.println("The LEAST COMMON MULTIPLE of the numbers " + c + " and " + d + " is " + (c*d)/a);
      sc.close();
    }
}
