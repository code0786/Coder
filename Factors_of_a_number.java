public class Factors_of_a_number
{
    public static void main(String[] args)
    {
        int num=27;
        for(int i=2;i<27/2;i++)
        {
            if (num%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
