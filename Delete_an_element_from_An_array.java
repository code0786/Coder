import java.util.Arrays;

public class Delete_an_element_from_An_array
{
    public static void main(String[] args)
    {

        int[] arr={12,34,5,67,88};
        int pos=3;
        int l=arr.length-1;
        for(int i=pos-1;i<l;i++)
        {
            arr[i]=arr[i+1];
        }
        l--;
        System.out.println(Arrays.toString(arr));
    }
}
