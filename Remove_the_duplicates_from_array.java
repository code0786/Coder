import java.util.Arrays;
public class Remove_the_duplicates_from_array
{
    public static void main(String[] args) {
        int[] arr={1,2,6,5,5,4,3,2,4,6,7,7};
        int j=0;
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        for (int k=0;k<j;k++)
        {
            System.out.print(arr[k]);
        }


    }
}
