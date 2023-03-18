public class Prime
{
    public static void main(String[] args) {
        int a =341;
        for(int i=2;i<a/2;i++)
        {
            if (a%i==0)
            {
                System.out.println("it is not a prime");
                break;
            }
            else
                System.out.println(" a prime");
            break;
        }
    }
}
