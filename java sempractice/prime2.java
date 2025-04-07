import java.util.Scanner;
class chk_pr
{
    public boolean prr(int n)
    {
        // Example logic to check if a number is prime
       if(n <=1)
        return false;
       else if (n==2) 
        return true;
       else if(n % 2 == 0) // Fixed condition to check divisibility by 2
        return false;
       else
       {
        for(int i=3; i*i<=n; i+=2) { // Increment by 2 to check only odd numbers
            if(n % i == 0)
            {
                return false;
            }
        }
        return true; // Ensure a return statement exists outside the loop
        }
    }
}

public class prime2 {
    public static void main(String g[])
    {
     chk_pr cc = new chk_pr();
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a range of numbrs to print those prime numbers in between them");
     int a = sc.nextInt();
     int b = sc.nextInt();
     for(int i=a;i<=b;i++)
     {
      if(cc.prr(i) == true)
      {
        System.out.print(i + "\t");
      }
     }
     sc.close();
    }
    
}
