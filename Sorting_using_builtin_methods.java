import java.util.Arrays;

public class Sorting_using_builtin_methods
{
    public static void main(String[] args)
    {
        int[] arr={1,34,67,45,23,9,3,12,3};
        Arrays.sort(arr);
        for (int k:arr)
        {
            System.out.print(k+",");
        }

    }
}
