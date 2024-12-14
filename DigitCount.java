import java.util.Scanner;
class DigitCount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number  = sc.nextInt();
        int digitCount=0;
        while(number>0)
        {
            number/=10;
            digitCount++;
        }
        System.out.println("number of digits are "+digitCount);
    }
}