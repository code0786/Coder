import java.util.Arrays;
public class Reverse_A_array
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,67,8};
       // int[] rev= new int[arr.length];
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
