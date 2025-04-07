import java.util.Scanner;
public class perfect {
    public static void main(String h[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to check wheter it is a perfect number");
      int n = sc.nextInt();
      int sum = 0;
      if(n<=0)
      System.out.println("The given number " + n + " is  not a perfect number");
      else
      {
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }
        if(sum==n)
        System.out.println("The given number " + n + " is a perfect number");
        else
        System.out.println("The given number " + n + " is not a perfect number");
      }
      sc.close();
      

    }
}
