import java.util.Scanner;
public class factor {
    public static void main(String h[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int a = sc.nextInt();
      System.out.println("The factors of the number " + a + " are:");
      for(int i=1;i<=a;i++)
      {
        if(a%i==0)
        {
        System.out.println(i + "\t");
        }
      }
      sc.close();
    }
}
