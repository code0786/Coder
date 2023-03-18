public class Fibonachi_number
{
    public static void main(String[] args)
    {
        int a=0,b=1,c=0,count=5;
        while (count!=0)
        {
            c=a+b;
            a=b;
            b=c;
            count--;

        }
        System.out.println(c);


    }
}
