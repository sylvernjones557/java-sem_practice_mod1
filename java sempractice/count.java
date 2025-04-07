import java.util.Scanner;
class count
{
    public static void main(String j[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to find the find the sum of te digits");
      int a = sc.nextInt();
      int i =0;
      int b = a;
      while(a>0)
      {
        a = a/10;
        i++;
      }
      System.out.println("the number of the digits in the given number " + b +" is " + i);
      sc.close();
    }
}