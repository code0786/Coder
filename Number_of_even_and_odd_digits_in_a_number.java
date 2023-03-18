public class Number_of_even_and_odd_digits_in_a_number
{
    public static void main(String[] args)
    {
        int num=12345;
        int odd=0,even=0,chek=0;
        while (num!=0)
        {
            chek=num%10;
            if (chek%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            num=num/10;
        }
        System.out.println("the numbers of even are : "+even+"  the number of odds are : "+odd);

    }
}
