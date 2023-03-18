public class Subsets_of_a_string
{
    public static void main(String[] args)
    {
        // formula to find the subsets is n*(n+1)/2
        String k= " welcome";
        int temp=0;
        int len=k.length();
        String[] ko=new String[len];
        for (int i=0;i<len;i++)
        {
            for (int j=i;j<len;j++)
            {
                ko[temp]=k.substring(i,j+1);
                temp++;
            }
        }
        for (int i=0;i<ko.length-1;i++)
        {
            System.out.println(ko[i]);
        }

    }
}
