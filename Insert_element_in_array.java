import java.util.Scanner;

public class Insert_element_in_array
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of the array you want");
        int z=k.nextInt();

        int [] arr=new int[z];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int f:arr)
        {
            System.out.println("The values inserted are : " + f +" ");
        }

    }
}
