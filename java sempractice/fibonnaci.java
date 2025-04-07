import java.util.Scanner;
public class fibonnaci {
    public static void main(String j[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the Fibonacci series up to that number:");
        int num = sc.nextInt();
        int first = 0, second = 1;
        int next = 0;

        System.out.print(first + " ");
        System.out.print(second + " ");

        while (next < num)
        {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        sc.close();
    }
}