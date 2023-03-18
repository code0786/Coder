public class Pallindrome_number
{
    public static void main(String[] args)
    {
        int num=121,rev=0,remp=num;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if (rev==remp)
        {
            System.out.println("It is a pallindrome number");
        }
        else
        {
            System.out.println("It is not a pallindrome number");
        }

    }
}
