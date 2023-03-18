import java.util.Scanner;

public class Convert_farhaneit_to_celcius
{
    public static void main(String[] args)
    {
        float temp;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the value that you want to convert");
        temp=k.nextFloat();
        temp=((temp-32)*5)/9;
        System.out.println("temp in celsius is "+temp);

    }
}
