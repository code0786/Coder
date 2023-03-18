import java.util.Scanner;

public class Delete
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int k=z.nextInt();

        for (int i=1;i<=k;i++)
        {
            int age=z.nextInt();
            int lo=z.nextInt();
            int up=z.nextInt();
            if (age>=lo && age<up)
            {
                System.out.println("yes");
            }
            else
                System.out.println("no");
        }

    }
}
