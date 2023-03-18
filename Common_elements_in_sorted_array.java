public class Common_elements_in_sorted_array
{
    public static void main(String[] args) {
        int[] a1={12,34,56,76,89};
        int[] a2={12,23,45,67,89,90};
        int[] a3={12,33,55,67,88};
        int x=0,y=0,z=0;
        while(x<a1.length && y<a2.length && z<a3.length)
        {
            if (a1[x]==a2[y] && a2[y]==a3[z])
            {
                System.out.println(a1[x]);
                x++;
                y++;
                z++;
            }
            else if (a1[x]>a2[y])
            {
                y++;

            }
            else if (a2[y]>a3[z])
            {
                z++;
            }
            else
                x++;
        }
    }

}
