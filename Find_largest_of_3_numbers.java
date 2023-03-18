import java.util.Scanner;

public class Find_largest_of_3_numbers
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the first number\n");
        int a=k.nextInt();
        System.out.println("Enter the second number\n");
        int b=k.nextInt();
        System.out.println("Enter the third number\n");
        int c=k.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is greatest");
        }
        else if (b>c && b>a)
        {
            System.out.println("B is greatest");
        }
        else
            System.out.println("c is greatest");

        // ternary operator approach

        int largest=0;
        largest=a>b?a:b;
        largest=largest>c?largest:c;
        System.out.println("the largerst of the three number is "+largest);

    }
}
