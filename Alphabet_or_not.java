import java.util.Scanner;

public class Alphabet_or_not
{
    public static void main(String[] args)
    {
        Scanner k= new Scanner(System.in);
        char to=k.next().charAt(0);
        if (to>='a' && to<='z')
        {
            System.out.println("it is an alphabet");
        }
        else
            System.out.println("not a alphabet");
    }
}
