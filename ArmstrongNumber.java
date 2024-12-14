import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int digitCount = 0;
        int temp = number;
        int sum = 0;
        while(temp>0)
        {
            temp/=10;
            digitCount++;
        }
        temp =number;
        while(temp>0){
            int rem = temp%10;
            sum += (int)Math.pow(rem,digitCount);
            temp=temp/10;
        }
        if(number==sum)
        {
            System.out.println(number+" is a armstrong number");
        }
        else
        {
            System.out.println(number+" is not a armstrong number");
        }
    }
}