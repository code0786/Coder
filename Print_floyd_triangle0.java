public class Print_floyd_triangle0
{
    public static void main(String[] args)
    {
        //  floyds triangle
        int n=5;
        for (int i=0;i<=n;i++)
        {
            for (int j=i+1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}
