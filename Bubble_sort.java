import java.util.Arrays;

public class Bubble_sort
{
    public static void main(String[] args)
    {
        int [] arr={1,3,45,67,87,5};

        // require the two for loops

        int n=arr.length-1;
        for (int i=0;i<=n-1;i++)
        {
            for (int j=0;j<=n-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after the sorting is done : "+Arrays.toString(arr));


    }
}
