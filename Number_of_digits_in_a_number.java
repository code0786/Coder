public class Number_of_digits_in_a_number
{
    public static void main(String[] args)
    {
        int count=0,num=242535;
        while (num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("It is a  "+ count+" digit number");


    }
}
