import java.util.Scanner;

public class Factorial_of_a_number
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number\n");
        int z=k.nextInt();
        int fact=1;
        for(int i=fact;i<=z;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of the number is "+fact);

    }
}
