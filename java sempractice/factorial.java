import java.util.Scanner;
public class factorial {
    public static void main(String h[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO FIND IT IS FACTORIAL");
        int a = sc.nextInt();
        double fact = 1;
        for(int i=1;i<=a;i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of the number " + a + " : " + fact);
        sc.close();


    }
}
