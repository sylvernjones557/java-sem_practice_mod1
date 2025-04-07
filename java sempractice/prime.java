import java.util.Scanner;
class prime
{
    public static void main(String j[])
    {
     Scanner sc = new Scanner(System.in);
     int flag = 1;
     System.out.println("Enter a number to check for a prime");
     int a  = sc.nextInt();
     if(a <= 1){
        System.out.println("The number is not " + a  + " a prime:");
       }
       else if (a==2) {
        System.out.println("The number is " + a + " prime");
       }
       else
       {
        for(int i =2;i*i<=a;i++){
            if (a%i==0) {
                flag = 0;
                break;
            }


        }
        if (flag == 1) {
            System.out.println("The number is " + a + " prime");
        }
        else
        System.out.println("The number is not " + a  + " a prime:");

       }
       sc.close();
     
    }
}