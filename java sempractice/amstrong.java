import java.util.Scanner;
public class amstrong {
    public static void main(String l[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to check wheter it is amstrong number or not:");
     int a = sc.nextInt();
     int sum=0 ,temp,digit = a;
     while(a > 0)
     {
        temp = a%10;
        sum  += (temp*temp*temp);
        a /= 10;
     }
     if(sum==digit)
     System.out.println("The number " + digit + " is an amstrong number");
     else
     System.out.println("The number " + digit + " is not an amstrong number");
     sc.close();
    }
}
